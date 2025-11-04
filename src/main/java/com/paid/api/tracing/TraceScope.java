package com.paid.api.tracing;

import io.opentelemetry.api.baggage.Baggage;
import io.opentelemetry.api.baggage.BaggageBuilder;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * A trace scope that creates a parent span and propagates custom attributes via Baggage.
 *
 * <p>Supports two usage patterns:
 * <ul>
 *   <li><b>Try-with-resources:</b> Automatically manages span lifecycle
 *       <pre>{@code
 *       try (TraceScope scope = PaidTracing.trace("operation")
 *               .externalCustomerId("customer_123")
 *               .externalAgentId("agent_smith")
 *               .start()) {
 *           // Your code here
 *       }
 *       }</pre>
 *   </li>
 *   <li><b>Callback:</b> Wraps a callable/runnable
 *       <pre>{@code
 *       Result result = PaidTracing.trace("operation")
 *           .externalCustomerId("customer_123")
 *           .externalAgentId("agent_smith")
 *           .call(() -> performOperation());
 *       }</pre>
 *   </li>
 * </ul>
 *
 * <p>All custom attributes are propagated to child spans via OpenTelemetry Baggage.
 */
public final class TraceScope implements AutoCloseable {

    private final Span span;
    private final Scope scope;
    private final Context context;

    private TraceScope(Span span, Scope scope, Context context) {
        this.span = span;
        this.scope = scope;
        this.context = context;
    }

    /**
     * Closes the trace scope, ending the span and restoring the previous context.
     */
    @Override
    public void close() {
        try {
            scope.close();
            span.end();
        } catch (Exception e) {
            System.err.println("Error closing TraceScope: " + e.getMessage());
        }
    }

    /**
     * Builder for creating TraceScope instances with custom attributes.
     */
    public static final class Builder {
        private final Tracer tracer;
        private final Map<String, String> attributes;
        private static final String PARENT_SPAN_NAME = "parent_span";

        Builder(Tracer tracer) {
            this.tracer = tracer;
            this.attributes = new HashMap<>();
        }

        /**
         * Sets the customer ID attribute.
         *
         * @param externalCustomerId the external customer ID
         * @return this builder
         */
        public Builder externalCustomerId(String externalCustomerId) {
            if (externalCustomerId != null && !externalCustomerId.isEmpty()) {
                attributes.put("external_customer_id", externalCustomerId);
            }
            return this;
        }

        /**
         * Sets the agent ID attribute.
         *
         * @param externalAgentId the external agent ID
         * @return this builder
         */
        public Builder externalAgentId(String externalAgentId) {
            if (externalAgentId != null && !externalAgentId.isEmpty()) {
                attributes.put("external_agent_id", externalAgentId);
            }
            return this;
        }

        /**
         * Adds a custom metadata attribute.
         *
         * @param key   the attribute key
         * @param value the attribute value
         * @return this builder
         */
        public Builder metadata(String key, String value) {
            if (key != null && !key.isEmpty() && value != null) {
                attributes.put("metadata." + key, value);
            }
            return this;
        }

        /**
         * Adds multiple custom metadata attributes.
         * Nested maps are flattened using dot notation (e.g., "parent.child.key").
         *
         * @param metadata map of metadata key-value pairs (supports nested maps)
         * @return this builder
         */
        public Builder metadata(Map<String, ?> metadata) {
            if (metadata != null) {
                flattenAndAddMetadata(metadata, "");
            }
            return this;
        }

        /**
         * Recursively flattens nested maps into dot-notation keys and adds them as attributes.
         *
         * @param map       the map to flatten
         * @param parentKey the parent key prefix (empty for root level)
         */
        private void flattenAndAddMetadata(Map<String, ?> map, String parentKey) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                String newKey = parentKey.isEmpty() ? key : parentKey + "." + key;

                if (value instanceof Map) {
                    // Recursively flatten nested maps
                    @SuppressWarnings("unchecked")
                    Map<String, ?> nestedMap = (Map<String, ?>) value;
                    flattenAndAddMetadata(nestedMap, newKey);
                } else if (value != null) {
                    // Add the flattened key with metadata prefix
                    attributes.put("metadata." + newKey, value.toString());
                }
            }
        }

        /**
         * Starts the trace scope for use with try-with-resources.
         *
         * @return a new TraceScope that must be closed
         */
        public TraceScope start() {
            try {
                // Get current context
                Context currentContext = Context.current();

                // Build baggage with attributes
                BaggageBuilder baggageBuilder = Baggage.builder();
                for (Map.Entry<String, String> entry : attributes.entrySet()) {
                    baggageBuilder.put(entry.getKey(), entry.getValue());
                }

                Baggage baggage = baggageBuilder.build();

                // Create context with baggage
                Context contextWithBaggage = currentContext.with(baggage);

                // Create span in the context with baggage
                Span span = tracer.spanBuilder(PARENT_SPAN_NAME)
                        .setParent(contextWithBaggage)
                        .setSpanKind(SpanKind.INTERNAL)
                        .startSpan();

                // Make both the span and baggage current
                Context contextWithSpan = contextWithBaggage.with(span);
                Scope scope = contextWithSpan.makeCurrent();

                return new TraceScope(span, scope, contextWithSpan);
            } catch (Exception e) {
                System.err.println("Error starting TraceScope: " + e.getMessage());
                throw new RuntimeException("Failed to start trace scope", e);
            }
        }

        /**
         * Executes a callable within the trace scope and returns its result.
         *
         * @param callable the code to execute
         * @param <T>      the return type
         * @return the result of the callable
         * @throws Exception if the callable throws an exception
         */
        public <T> T call(Callable<T> callable) throws Exception {
            try (TraceScope scope = start()) {
                try {
                    T result = callable.call();
                    scope.span.setStatus(StatusCode.OK);
                    return result;
                } catch (Exception e) {
                    scope.span.recordException(e);
                    scope.span.setStatus(StatusCode.ERROR, e.getMessage());
                    throw e;
                }
            }
        }

        /**
         * Executes a runnable within the trace scope.
         *
         * @param runnable the code to execute
         */
        public void run(Runnable runnable) {
            try (TraceScope scope = start()) {
                try {
                    runnable.run();
                    scope.span.setStatus(StatusCode.OK);
                } catch (Exception e) {
                    scope.span.recordException(e);
                    scope.span.setStatus(StatusCode.ERROR, e.getMessage());
                    throw e;
                }
            }
        }
    }
}
