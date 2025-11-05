package com.paid.api.tracing.instrumentation.bedrock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point for AWS Bedrock instrumentation.
 *
 * <p>This class uses AWS SDK v2's Service Provider Interface (SPI) mechanism to automatically
 * register an ExecutionInterceptor that traces all supported Bedrock operations.
 *
 * <p>If the AWS Bedrock SDK is not on the classpath, calls to {@link #instrument()} will be a no-op.
 *
 * <h2>Supported Operations</h2>
 * <ul>
 *   <li>Converse - Standard Bedrock conversation API</li>
 *   <li>ConverseStream - Streaming Bedrock conversation API</li>
 *   <li>InvokeModel - Standard Bedrock model invocation API</li>
 *   <li>InvokeModelWithResponseStream - Streaming Bedrock model invocation API</li>
 * </ul>
 *
 * <h2>Usage</h2>
 * <pre>{@code
 * // Initialize Paid tracing
 * PaidTracing.initialize("your-api-key");
 *
 * // Enable Bedrock instrumentation
 * BedrockInstrumentor.instrument();
 *
 * // Create your Bedrock client - tracing is automatically enabled
 * BedrockRuntimeClient client = BedrockRuntimeClient.builder()
 *     .region(Region.US_EAST_1)
 *     .build();
 *
 * // All supported Bedrock operations will be automatically traced
 * }</pre>
 *
 * <p>This method is safe to call multiple times (idempotent) and will only instrument once.
 */
public final class BedrockInstrumentor {

    private static final Logger logger = LoggerFactory.getLogger(BedrockInstrumentor.class);

    private static volatile boolean instrumented = false;
    private static final Object LOCK = new Object();

    // Private constructor to prevent instantiation
    private BedrockInstrumentor() {}

    /**
     * Enables Paid instrumentation for bedrock sdk.
     */
    public static void instrument() {
        if (instrumented) {
            return;
        }

        synchronized (LOCK) {
            if (instrumented) {
                return;
            }

            try {
                // Try to load the BedrockInstrumentorImpl class
                // This will fail gracefully if AWS SDK is not on the classpath
                Class<?> implClass = Class.forName(
                        "com.paid.api.tracing.instrumentation.bedrock.BedrockInstrumentorImpl",
                        true,
                        BedrockInstrumentor.class.getClassLoader());

                // Call the static instrument method on the impl class
                java.lang.reflect.Method instrumentMethod = implClass.getDeclaredMethod("instrument");
                instrumentMethod.invoke(null);
                instrumented = true;
                logger.info("Bedrock instrumentation enabled successfully");
            } catch (ClassNotFoundException | NoClassDefFoundError e) {
                // AWS SDK not on classpath - this is fine
                logger.debug("AWS Bedrock SDK not detected, skipping instrumentation");
            } catch (Exception e) {
                // Other errors during instrumentation
                logger.error("Failed to instrument AWS Bedrock SDK", e);
            }
        }
    }

    /**
     * Checks if Bedrock instrumentation has been successfully applied.
     *
     * @return true if instrumentation is active, false otherwise
     */
    public static boolean isInstrumented() {
        return instrumented;
    }
}
