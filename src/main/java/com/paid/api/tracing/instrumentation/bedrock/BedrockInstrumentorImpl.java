package com.paid.api.tracing.instrumentation.bedrock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.services.bedrockruntime.BedrockRuntimeClient;

/**
 * Internal implementation class for Bedrock instrumentation.
 *
 * <p>This class is loaded lazily by {@link BedrockInstrumentor} to avoid class loading
 * errors when the AWS Bedrock SDK is not on the classpath.
 *
 * <p>The {@link BedrockRuntimeClient} import ensures that if the Bedrock SDK is not available,
 * loading this class will fail with {@link ClassNotFoundException}.
 */
final class BedrockInstrumentorImpl {

    private static final Logger logger = LoggerFactory.getLogger(BedrockInstrumentorImpl.class);

    // Reference to Bedrock class to ensure SDK is available at runtime
    @SuppressWarnings("unused")
    private static final Class<?> BEDROCK_CLIENT_CLASS = BedrockRuntimeClient.class;

    private BedrockInstrumentorImpl() {}

    static void instrument() {
        logger.info(
                "Bedrock instrumentation enabled. The interceptor will be automatically applied to all BedrockRuntimeClient instances.");
    }
}
