package com.paid.api.tracing;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Main entry point for Paid OpenTelemetry tracing functionality.
 *
 * <p>This class provides:
 * <ul>
 *   <li>Initialization of standalone Paid tracer (separate from global OTEL)</li>
 *   <li>Configuration via API parameters or environment variables</li>
 *   <li>Custom tracing API for wrapping user code with trace context</li>
 * </ul>
 *
 * <h2>Environment Variables</h2>
 * <ul>
 *   <li>{@code PAID_API_KEY} - API key for authentication</li>
 *   <li>{@code PAID_OTEL_COLLECTOR_ENDPOINT} - OTLP collector endpoint (default: https://collector.agentpaid.io:4318/v1/traces)</li>
 * </ul>
 *
 * <h2>Usage Examples</h2>
 *
 * <h3>Initialization</h3>
 * <pre>{@code
 * // Using environment variables
 * PaidTracing.initialize();
 *
 * // With API key only (uses default endpoint)
 * PaidTracing.initialize("your-api-key");
 *
 * // Or with explicit parameters
 * PaidTracing.initialize("your-api-key", "https://collector.agentpaid.io:4318/v1/traces");
 * }</pre>
 *
 * <h3>Tracing with Try-With-Resources</h3>
 * <pre>{@code
 * try (TraceScope scope = PaidTracing.trace("agent_workflow")
 *         .customerId("customer_123")
 *         .agentId("agent_456")
 *         .metadata("region", "us-west")
 *         .start()) {
 *     // Your code here - all operations will be traced
 *     result = performWorkflow();
 * }
 * }</pre>
 *
 * <h3>Tracing with Callback</h3>
 * <pre>{@code
 * String result = PaidTracing.trace("agent_workflow")
 *     .customerId("customer_123")
 *     .agentId("agent_456")
 *     .call(() -> performWorkflow());
 * }</pre>
 */
public final class PaidTracing {

    private static final String ENV_API_KEY = "PAID_API_KEY";
    private static final String ENV_OTEL_ENDPOINT = "PAID_OTEL_COLLECTOR_ENDPOINT";
    private static final String DEFAULT_OTEL_ENDPOINT = "https://collector.agentpaid.io:4318/v1/traces";
    private static final String SERVICE_NAME = "paid-java-sdk";

    private static volatile OpenTelemetry openTelemetry;
    private static volatile Tracer tracer = OpenTelemetry.noop().getTracer(SERVICE_NAME);
    private static volatile SdkTracerProvider tracerProvider;
    private static volatile PaidSpanProcessor spanProcessor;
    private static volatile String apiKey;
    private static volatile boolean initialized = false;

    // Private constructor to prevent instantiation
    private PaidTracing() {}

    /**
     * Initializes the Paid tracing system using environment variables.
     *
     * <p>Reads configuration from:
     * <ul>
     *   <li>{@code PAID_API_KEY} - Required for authentication</li>
     *   <li>{@code PAID_OTEL_COLLECTOR_ENDPOINT} - Optional, defaults to https://collector.agentpaid.io:4318/v1/traces</li>
     * </ul>
     *
     * @throws IllegalStateException if PAID_API_KEY is not set
     */
    public static synchronized void initialize() {
        String envApiKey = System.getenv(ENV_API_KEY);
        if (envApiKey == null || envApiKey.isEmpty()) {
            throw new IllegalStateException(
                    "PAID_API_KEY environment variable must be set. "
                            + "Alternatively, call initialize(apiKey) or initialize(apiKey, endpoint) with explicit parameters.");
        }

        String endpoint = System.getenv(ENV_OTEL_ENDPOINT);
        if (endpoint == null || endpoint.isEmpty()) {
            endpoint = DEFAULT_OTEL_ENDPOINT;
        }

        initialize(envApiKey, endpoint);
    }

    /**
     * Initializes the Paid tracing system with API key only, using the default collector endpoint.
     *
     * @param apiKey the Paid API key for authentication
     * @throws IllegalArgumentException if apiKey is null/empty
     */
    public static synchronized void initialize(String apiKey) {
        initialize(apiKey, DEFAULT_OTEL_ENDPOINT);
    }

    /**
     * Initializes the Paid tracing system with explicit parameters.
     *
     * @param apiKey   the Paid API key for authentication
     * @param endpoint the OTLP collector endpoint (e.g., "https://collector.agentpaid.io:4318/v1/traces")
     * @throws IllegalArgumentException if apiKey or endpoint is null/empty
     */
    public static synchronized void initialize(String apiKey, String endpoint) {
        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("API key cannot be null or empty");
        }
        if (endpoint == null || endpoint.isEmpty()) {
            throw new IllegalArgumentException("OTLP endpoint cannot be null or empty");
        }

        if (initialized) {
            System.err.println("PaidTracing already initialized. Skipping re-initialization.");
            return;
        }

        try {
            PaidTracing.apiKey = apiKey;

            // Create resource with service name and API key
            Resource resource = Resource.getDefault().toBuilder()
                    .put(AttributeKey.stringKey("api.key"), apiKey)
                    .build();

            // Create OTLP HTTP exporter
            OtlpHttpSpanExporter spanExporter =
                    OtlpHttpSpanExporter.builder().setEndpoint(endpoint).build();

            // Create custom span processor
            spanProcessor = new PaidSpanProcessor();

            tracerProvider = SdkTracerProvider.builder()
                    .setResource(resource)
                    .addSpanProcessor(spanProcessor)
                    .addSpanProcessor(BatchSpanProcessor.builder(spanExporter).build())
                    .build();

            // Build OpenTelemetry instance
            openTelemetry =
                    OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build();

            // Get tracer instance
            tracer = openTelemetry.getTracer(SERVICE_NAME);

            initialized = true;

            System.out.println("PaidTracing initialized successfully with endpoint: " + endpoint);
        } catch (Exception e) {
            System.err.println("Failed to initialize PaidTracing: " + e.getMessage());
            throw new RuntimeException("Failed to initialize PaidTracing", e);
        }
    }

    /**
     * Creates a new trace scope builder for wrapping code with tracing context.
     *
     * <p>This method creates a parent span that will contain any child spans created
     * during the execution of the wrapped code (including auto-instrumented operations).
     *
     * @return a TraceScope builder for configuring the trace
     */
    public static TraceScope.Builder trace() {
        ensureInitialized();
        return new TraceScope.Builder(tracer);
    }

    private static void ensureInitialized() {
        if (!initialized) {
            try {
                initialize();
            } catch (Exception e) {
                System.err.println("PaidTracing error on implicit intialization: " + e.getMessage());
            }
        }
    }

    /**
     * Emits a signal within a tracing context.
     *
     * <p>This method must be called within an active tracing context (e.g., within a {@code try (TraceScope scope = PaidTracing.trace()...start())}).
     *
     * <h3>Usage Examples</h3>
     * <pre>{@code
     * // Basic signal within a tracing context
     * try (TraceScope scope = PaidTracing.trace()
     *         .externalCustomerId("cust_123")
     *         .externalAgentId("agent_456")
     *         .start()) {
     *     // ... do work ...
     *     PaidTracing.signal("order_processed", false, Map.of("order_id", "12345"));
     * }
     *
     * // Signal with cost tracking
     * try (TraceScope scope = PaidTracing.trace()
     *         .externalCustomerId("cust_123")
     *         .start()) {
     *     // ... call AI provider ...
     *     PaidTracing.signal("ai_api_call_complete", true, null);
     * }
     * }</pre>
     *
     * @param eventName         the name of the signal (e.g., "user_signup", "payment_processed", "task_completed")
     * @param enableCostTracing if true, associates this signal with cost/usage traces from the same tracing context.
     *                          Should only be called once per tracing context to avoid multiple signals referring to the same costs.
     * @param data              additional context data to attach to the signal. Will be JSON-serialized and stored as a span attribute.
     *                          Can be null if no additional data is needed.
     */
    public static void signal(String eventName, boolean enableCostTracing, Map<String, Object> data) {
        Signal.emit(tracer, eventName, enableCostTracing, data);
    }

    /**
     * Emits a signal within a tracing context without additional data.
     *
     * <p>Convenience overload for {@link #signal(String, boolean, Map)} with null data.
     *
     * @param eventName         the name of the signal
     * @param enableCostTracing if true, associates this signal with cost/usage traces
     */
    public static void signal(String eventName, boolean enableCostTracing) {
        signal(eventName, enableCostTracing, null);
    }

    /**
     * Emits a simple signal within a tracing context.
     *
     * <p>Convenience overload for {@link #signal(String, boolean, Map)} with cost tracing disabled and no data.
     *
     * @param eventName the name of the signal
     */
    public static void signal(String eventName) {
        signal(eventName, false, null);
    }

    /**
     * Flushes Paid telemetry
     *
     * <p>Need to call before shutting down the application.
     *
     * @return True if flushed any telemetry, false otherwise
     */
    public static boolean flush() {
        if (tracerProvider != null) {
            try {
                tracerProvider.forceFlush().join(3, TimeUnit.SECONDS);
                return true;
            } catch (Exception e) {
                System.err.println("Error flushing spans: " + e.getMessage());
                return false;
            }
        }
        return false;
    }
}
