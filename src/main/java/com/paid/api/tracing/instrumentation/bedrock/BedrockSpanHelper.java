package com.paid.api.tracing.instrumentation.bedrock;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.core.SdkRequest;
import software.amazon.awssdk.core.SdkResponse;
import software.amazon.awssdk.services.bedrockruntime.model.ConverseRequest;
import software.amazon.awssdk.services.bedrockruntime.model.ConverseResponse;
import software.amazon.awssdk.services.bedrockruntime.model.ConverseStreamRequest;
import software.amazon.awssdk.services.bedrockruntime.model.InvokeModelRequest;
import software.amazon.awssdk.services.bedrockruntime.model.InvokeModelResponse;
import software.amazon.awssdk.services.bedrockruntime.model.InvokeModelWithResponseStreamRequest;

/**
 * Helper class for extracting attributes from Bedrock requests and responses.
 *
 * <p>This class follows the OpenTelemetry GenAI semantic conventions for model operations.
 * See: https://opentelemetry.io/docs/specs/semconv/gen-ai/
 *
 * <h3>Attributes Extracted:</h3>
 * <ul>
 *   <li><b>gen_ai.system</b> - Always "aws.bedrock"</li>
 *   <li><b>gen_ai.request.model</b> - Model ID (e.g., "anthropic.claude-3-sonnet")</li>
 *   <li><b>gen_ai.request.max_tokens</b> - Maximum tokens to generate</li>
 *   <li><b>gen_ai.request.temperature</b> - Sampling temperature</li>
 *   <li><b>gen_ai.request.top_p</b> - Top-p sampling parameter</li>
 *   <li><b>gen_ai.response.id</b> - Response/request ID</li>
 *   <li><b>gen_ai.response.model</b> - Actual model used in response</li>
 *   <li><b>gen_ai.response.finish_reasons</b> - Stop reason(s)</li>
 *   <li><b>gen_ai.response.latency_ms</b> - Response latency in milliseconds</li>
 *   <li><b>gen_ai.usage.input_tokens</b> - Input token count</li>
 *   <li><b>gen_ai.usage.output_tokens</b> - Output token count</li>
 *   <li><b>gen_ai.usage.cache_read_input_tokens</b> - Cached tokens read from prompt cache</li>
 *   <li><b>gen_ai.usage.cache_creation_input_tokens</b> - Tokens written to prompt cache</li>
 * </ul>
 */
final class BedrockSpanHelper {

    private static final Logger logger = LoggerFactory.getLogger(BedrockSpanHelper.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // GenAI semantic convention attribute keys
    private static final AttributeKey<String> GEN_AI_SYSTEM = AttributeKey.stringKey("gen_ai.system");
    private static final AttributeKey<String> GEN_AI_REQUEST_MODEL = AttributeKey.stringKey("gen_ai.request.model");
    private static final AttributeKey<Long> GEN_AI_REQUEST_MAX_TOKENS =
            AttributeKey.longKey("gen_ai.request.max_tokens");
    private static final AttributeKey<Double> GEN_AI_REQUEST_TEMPERATURE =
            AttributeKey.doubleKey("gen_ai.request.temperature");
    private static final AttributeKey<Double> GEN_AI_REQUEST_TOP_P = AttributeKey.doubleKey("gen_ai.request.top_p");
    private static final AttributeKey<String> GEN_AI_RESPONSE_ID = AttributeKey.stringKey("gen_ai.response.id");
    private static final AttributeKey<String> GEN_AI_RESPONSE_MODEL = AttributeKey.stringKey("gen_ai.response.model");
    private static final AttributeKey<String> GEN_AI_RESPONSE_FINISH_REASONS =
            AttributeKey.stringKey("gen_ai.response.finish_reasons");
    private static final AttributeKey<Long> GEN_AI_RESPONSE_LATENCY_MS =
            AttributeKey.longKey("gen_ai.response.latency_ms");
    private static final AttributeKey<Long> GEN_AI_USAGE_INPUT_TOKENS =
            AttributeKey.longKey("gen_ai.usage.input_tokens");
    private static final AttributeKey<Long> GEN_AI_USAGE_OUTPUT_TOKENS =
            AttributeKey.longKey("gen_ai.usage.output_tokens");
    private static final AttributeKey<Long> GEN_AI_USAGE_CACHE_READ_INPUT_TOKENS =
            AttributeKey.longKey("gen_ai.usage.cache_read_input_tokens");
    private static final AttributeKey<Long> GEN_AI_USAGE_CACHE_CREATION_INPUT_TOKENS =
            AttributeKey.longKey("gen_ai.usage.cache_creation_input_tokens");

    // Private constructor to prevent instantiation
    private BedrockSpanHelper() {}

    /**
     * Adds request attributes to a span.
     *
     * @param span the span to add attributes to
     * @param request the Bedrock request
     * @param operationName the operation name (Converse or ConverseStream)
     */
    static void addRequestAttributes(Span span, SdkRequest request, String operationName) {
        try {
            // Always set the system
            span.setAttribute(GEN_AI_SYSTEM, "bedrock");

            // Handle Converse and ConverseStream requests
            if (request instanceof ConverseRequest) {
                ConverseRequest converseRequest = (ConverseRequest) request;
                addConverseRequestAttributes(span, converseRequest);
            } else if (request instanceof ConverseStreamRequest) {
                ConverseStreamRequest streamRequest = (ConverseStreamRequest) request;
                addConverseStreamRequestAttributes(span, streamRequest);
            } else if (request instanceof InvokeModelRequest) {
                InvokeModelRequest invokeModelRequest = (InvokeModelRequest) request;
                addInvokeModelRequestAttributes(span, invokeModelRequest);
            } else if (request instanceof InvokeModelWithResponseStreamRequest) {
                InvokeModelWithResponseStreamRequest streamRequest = (InvokeModelWithResponseStreamRequest) request;
                addInvokeModelWithResponseStreamRequestAttributes(span, streamRequest);
            }
        } catch (Exception e) {
            logger.error("Error extracting request attributes", e);
        }
    }

    /**
     * Adds response attributes to a span.
     *
     * @param span the span to add attributes to
     * @param response the Bedrock response
     * @param operationName the operation name (Converse or ConverseStream)
     */
    static void addResponseAttributes(Span span, SdkResponse response, String operationName) {
        try {
            // Handle Converse responses
            if (response instanceof ConverseResponse) {
                ConverseResponse converseResponse = (ConverseResponse) response;
                addConverseResponseAttributes(span, converseResponse);
            } else if (response instanceof InvokeModelResponse) {
                InvokeModelResponse invokeModelResponse = (InvokeModelResponse) response;
                addInvokeModelResponseAttributes(span, invokeModelResponse);
            }
            // Note: InvokeModelWithResponseStream doesn't return a standard response object,
            // usage data comes through streaming events which are not easily captured here
        } catch (Exception e) {
            logger.error("Error extracting response attributes", e);
        }
    }

    /**
     * Extracts attributes from a ConverseRequest.
     */
    private static void addConverseRequestAttributes(Span span, ConverseRequest request) {
        // Model ID
        if (request.modelId() != null) {
            span.setAttribute(GEN_AI_REQUEST_MODEL, request.modelId());
        }

        // Inference configuration
        if (request.inferenceConfig() != null) {
            if (request.inferenceConfig().maxTokens() != null) {
                span.setAttribute(
                        GEN_AI_REQUEST_MAX_TOKENS,
                        request.inferenceConfig().maxTokens().longValue());
            }
            if (request.inferenceConfig().temperature() != null) {
                span.setAttribute(
                        GEN_AI_REQUEST_TEMPERATURE,
                        request.inferenceConfig().temperature().doubleValue());
            }
            if (request.inferenceConfig().topP() != null) {
                span.setAttribute(
                        GEN_AI_REQUEST_TOP_P, request.inferenceConfig().topP().doubleValue());
            }
        }
    }

    /**
     * Extracts attributes from a ConverseStreamRequest.
     */
    private static void addConverseStreamRequestAttributes(Span span, ConverseStreamRequest request) {
        // Model ID
        if (request.modelId() != null) {
            span.setAttribute(GEN_AI_REQUEST_MODEL, request.modelId());
        }

        // Inference configuration
        if (request.inferenceConfig() != null) {
            if (request.inferenceConfig().maxTokens() != null) {
                span.setAttribute(
                        GEN_AI_REQUEST_MAX_TOKENS,
                        request.inferenceConfig().maxTokens().longValue());
            }
            if (request.inferenceConfig().temperature() != null) {
                span.setAttribute(
                        GEN_AI_REQUEST_TEMPERATURE,
                        request.inferenceConfig().temperature().doubleValue());
            }
            if (request.inferenceConfig().topP() != null) {
                span.setAttribute(
                        GEN_AI_REQUEST_TOP_P, request.inferenceConfig().topP().doubleValue());
            }
        }
    }

    /**
     * Extracts attributes from a ConverseResponse.
     */
    private static void addConverseResponseAttributes(Span span, ConverseResponse response) {
        // Response/request ID
        if (response.responseMetadata() != null && response.responseMetadata().requestId() != null) {
            span.setAttribute(GEN_AI_RESPONSE_ID, response.responseMetadata().requestId());
        }

        // Stop reason (finish reason)
        if (response.stopReason() != null) {
            span.setAttribute(
                    GEN_AI_RESPONSE_FINISH_REASONS, response.stopReason().toString());
        }

        // Latency
        if (response.metrics() != null && response.metrics().latencyMs() != null) {
            span.setAttribute(GEN_AI_RESPONSE_LATENCY_MS, response.metrics().latencyMs());
        }

        // Token usage
        if (response.usage() != null) {
            if (response.usage().inputTokens() != null) {
                span.setAttribute(
                        GEN_AI_USAGE_INPUT_TOKENS,
                        response.usage().inputTokens().longValue());
            }
            if (response.usage().outputTokens() != null) {
                span.setAttribute(
                        GEN_AI_USAGE_OUTPUT_TOKENS,
                        response.usage().outputTokens().longValue());
            }
            if (response.usage().cacheReadInputTokens() != null) {
                span.setAttribute(
                        GEN_AI_USAGE_CACHE_READ_INPUT_TOKENS,
                        response.usage().cacheReadInputTokens().longValue());
            }
            if (response.usage().cacheWriteInputTokens() != null) {
                span.setAttribute(
                        GEN_AI_USAGE_CACHE_CREATION_INPUT_TOKENS,
                        response.usage().cacheWriteInputTokens().longValue());
            }
        }
    }

    /**
     * Extracts attributes from an InvokeModelRequest.
     */
    private static void addInvokeModelRequestAttributes(Span span, InvokeModelRequest request) {
        // Model ID
        if (request.modelId() != null) {
            span.setAttribute(GEN_AI_REQUEST_MODEL, request.modelId());
        }

        // Try to parse request body for additional parameters (best effort)
        if (request.body() != null) {
            try {
                String bodyJson = request.body().asUtf8String();
                JsonNode rootNode = objectMapper.readTree(bodyJson);

                // Extract max_tokens if available
                if (rootNode.has("max_tokens")) {
                    span.setAttribute(
                            GEN_AI_REQUEST_MAX_TOKENS,
                            rootNode.get("max_tokens").asLong());
                }

                // Extract temperature if available
                if (rootNode.has("temperature")) {
                    span.setAttribute(
                            GEN_AI_REQUEST_TEMPERATURE,
                            rootNode.get("temperature").asDouble());
                }

                // Extract top_p if available
                if (rootNode.has("top_p")) {
                    span.setAttribute(
                            GEN_AI_REQUEST_TOP_P, rootNode.get("top_p").asDouble());
                }
            } catch (Exception e) {
                logger.debug("Failed to parse InvokeModel request body for attributes", e);
            }
        }
    }

    /**
     * Extracts attributes from an InvokeModelWithResponseStreamRequest.
     */
    private static void addInvokeModelWithResponseStreamRequestAttributes(
            Span span, InvokeModelWithResponseStreamRequest request) {
        // Model ID
        if (request.modelId() != null) {
            span.setAttribute(GEN_AI_REQUEST_MODEL, request.modelId());
        }

        // Try to parse request body for additional parameters (best effort)
        if (request.body() != null) {
            try {
                String bodyJson = request.body().asUtf8String();
                JsonNode rootNode = objectMapper.readTree(bodyJson);

                // Extract max_tokens if available
                if (rootNode.has("max_tokens")) {
                    span.setAttribute(
                            GEN_AI_REQUEST_MAX_TOKENS,
                            rootNode.get("max_tokens").asLong());
                }

                // Extract temperature if available
                if (rootNode.has("temperature")) {
                    span.setAttribute(
                            GEN_AI_REQUEST_TEMPERATURE,
                            rootNode.get("temperature").asDouble());
                }

                // Extract top_p if available
                if (rootNode.has("top_p")) {
                    span.setAttribute(
                            GEN_AI_REQUEST_TOP_P, rootNode.get("top_p").asDouble());
                }
            } catch (Exception e) {
                logger.debug("Failed to parse InvokeModelWithResponseStream request body for attributes", e);
            }
        }
    }

    /**
     * Extracts attributes from an InvokeModelResponse.
     * Parses the JSON response body to extract token usage and metadata.
     */
    private static void addInvokeModelResponseAttributes(Span span, InvokeModelResponse response) {
        // Response/request ID from metadata
        if (response.responseMetadata() != null && response.responseMetadata().requestId() != null) {
            span.setAttribute(GEN_AI_RESPONSE_ID, response.responseMetadata().requestId());
        }

        // Parse response body for usage and other attributes
        if (response.body() != null) {
            try {
                String bodyJson = response.body().asUtf8String();
                JsonNode rootNode = objectMapper.readTree(bodyJson);

                // Extract response ID (if present in body)
                if (rootNode.has("id")) {
                    span.setAttribute(GEN_AI_RESPONSE_ID, rootNode.get("id").asText());
                }

                // Extract model (if present in body)
                if (rootNode.has("model")) {
                    span.setAttribute(
                            GEN_AI_RESPONSE_MODEL, rootNode.get("model").asText());
                }

                // Extract stop_reason (finish reason)
                if (rootNode.has("stop_reason")) {
                    span.setAttribute(
                            GEN_AI_RESPONSE_FINISH_REASONS,
                            rootNode.get("stop_reason").asText());
                }

                // Extract usage information
                if (rootNode.has("usage")) {
                    JsonNode usageNode = rootNode.get("usage");

                    if (usageNode.has("input_tokens")) {
                        span.setAttribute(
                                GEN_AI_USAGE_INPUT_TOKENS,
                                usageNode.get("input_tokens").asLong());
                    }

                    if (usageNode.has("output_tokens")) {
                        span.setAttribute(
                                GEN_AI_USAGE_OUTPUT_TOKENS,
                                usageNode.get("output_tokens").asLong());
                    }

                    if (usageNode.has("cache_read_input_tokens")) {
                        span.setAttribute(
                                GEN_AI_USAGE_CACHE_READ_INPUT_TOKENS,
                                usageNode.get("cache_read_input_tokens").asLong());
                    }

                    // Handle both field names: cache_creation_input_tokens and
                    // cache_write_input_tokens
                    if (usageNode.has("cache_creation_input_tokens")) {
                        span.setAttribute(
                                GEN_AI_USAGE_CACHE_CREATION_INPUT_TOKENS,
                                usageNode.get("cache_creation_input_tokens").asLong());
                    } else if (usageNode.has("cache_write_input_tokens")) {
                        span.setAttribute(
                                GEN_AI_USAGE_CACHE_CREATION_INPUT_TOKENS,
                                usageNode.get("cache_write_input_tokens").asLong());
                    }
                }
            } catch (Exception e) {
                logger.debug("Failed to parse InvokeModel response body for attributes", e);
            }
        }

        // Extract content type
        if (response.contentType() != null) {
            logger.debug("InvokeModel response content type: {}", response.contentType());
        }
    }
}
