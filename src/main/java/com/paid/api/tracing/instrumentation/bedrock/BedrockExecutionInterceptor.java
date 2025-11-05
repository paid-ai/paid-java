package com.paid.api.tracing.instrumentation.bedrock;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.core.SdkRequest;
import software.amazon.awssdk.core.SdkResponse;
import software.amazon.awssdk.core.interceptor.Context.AfterExecution;
import software.amazon.awssdk.core.interceptor.Context.BeforeExecution;
import software.amazon.awssdk.core.interceptor.Context.FailedExecution;
import software.amazon.awssdk.core.interceptor.ExecutionAttribute;
import software.amazon.awssdk.core.interceptor.ExecutionAttributes;
import software.amazon.awssdk.core.interceptor.ExecutionInterceptor;
import software.amazon.awssdk.core.interceptor.SdkExecutionAttribute;

/**
 * AWS SDK v2 ExecutionInterceptor for tracing Bedrock operations.
 *
 * <p>This interceptor hooks into the AWS SDK request/response lifecycle to automatically
 * create spans for Bedrock API calls with detailed attributes about the model, tokens,
 * and other relevant metadata.
 *
 * <p>This class is automatically loaded by the AWS SDK v2 via Service Provider Interface (SPI).
 * The class name is listed in: {@code software/amazon/awssdk/global/handlers/execution.interceptors}
 *
 * <p><b>Supported Operations:</b>
 * <ul>
 *   <li>Converse - Standard Bedrock conversation API</li>
 *   <li>ConverseStream - Streaming Bedrock conversation API</li>
 *   <li>InvokeModel - Standard Bedrock model invocation API</li>
 *   <li>InvokeModelWithResponseStream - Streaming Bedrock model invocation API</li>
 * </ul>
 *
 * <p>All other Bedrock operations are ignored by this interceptor.
 */
public final class BedrockExecutionInterceptor implements ExecutionInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(BedrockExecutionInterceptor.class);

    private static final String OPERATION_CONVERSE = "Converse";
    private static final String OPERATION_CONVERSE_STREAM = "ConverseStream";
    private static final String OPERATION_INVOKE_MODEL = "InvokeModel";
    private static final String OPERATION_INVOKE_MODEL_WITH_RESPONSE_STREAM = "InvokeModelWithResponseStream";

    // Custom execution attribute key to store span context across threads
    private static final ExecutionAttribute<SpanContext> SPAN_CONTEXT_KEY =
            new ExecutionAttribute<>("BedrockSpanContext");

    private final Tracer tracer;

    /**
     * No-arg constructor for AWS SDK SPI loading.
     * Gets the tracer from PaidTracing.
     */
    public BedrockExecutionInterceptor() {
        this.tracer = com.paid.api.tracing.PaidTracing.getTracer();
    }

    @Override
    public void beforeExecution(BeforeExecution context, ExecutionAttributes executionAttributes) {
        if (!BedrockInstrumentor.isInstrumented()) {
            return;
        }

        // Get the operation name
        String operationName = executionAttributes.getAttribute(SdkExecutionAttribute.OPERATION_NAME);

        // Only instrument supported operations
        if (!OPERATION_CONVERSE.equals(operationName)
                && !OPERATION_CONVERSE_STREAM.equals(operationName)
                && !OPERATION_INVOKE_MODEL.equals(operationName)
                && !OPERATION_INVOKE_MODEL_WITH_RESPONSE_STREAM.equals(operationName)) {
            return;
        }

        try {
            // Create a new span for this operation
            String spanName = "bedrock." + operationName.toLowerCase();
            Span span =
                    tracer.spanBuilder(spanName).setSpanKind(SpanKind.CLIENT).startSpan();

            // Make the span current
            Scope scope = span.makeCurrent();

            // Store span and scope in ExecutionAttributes (not ThreadLocal) for cross-thread access
            SpanContext spanContext = new SpanContext(span, scope);
            executionAttributes.putAttribute(SPAN_CONTEXT_KEY, spanContext);

            // Extract and add request attributes
            SdkRequest request = context.request();
            BedrockSpanHelper.addRequestAttributes(span, request, operationName);
        } catch (Exception e) {
            logger.error("Error in beforeExecution", e);
        }
    }

    @Override
    public void afterExecution(AfterExecution context, ExecutionAttributes executionAttributes) {
        if (!BedrockInstrumentor.isInstrumented()) {
            return;
        }

        SpanContext spanContext = executionAttributes.getAttribute(SPAN_CONTEXT_KEY);
        if (spanContext == null) {
            return;
        }

        try {
            Span span = spanContext.span;
            SdkResponse response = context.response();
            String operationName = executionAttributes.getAttribute(SdkExecutionAttribute.OPERATION_NAME);

            // Extract and add response attributes
            BedrockSpanHelper.addResponseAttributes(span, response, operationName);

            // Mark span as successful
            span.setStatus(StatusCode.OK);
        } catch (Exception e) {
            logger.error("Error in afterExecution", e);
            if (spanContext != null && spanContext.span != null) {
                spanContext.span.recordException(e);
                spanContext.span.setStatus(StatusCode.ERROR, "Failed to extract response attributes");
            }
        } finally {
            if (spanContext != null) {
                // Close scope and end span
                spanContext.close();
            }
        }
    }

    @Override
    public void onExecutionFailure(FailedExecution context, ExecutionAttributes executionAttributes) {
        if (!BedrockInstrumentor.isInstrumented()) {
            return;
        }

        SpanContext spanContext = executionAttributes.getAttribute(SPAN_CONTEXT_KEY);
        if (spanContext == null) {
            return;
        }

        try {
            Span span = spanContext.span;
            Throwable error = context.exception();

            // Record the exception
            span.recordException(error);
            span.setStatus(StatusCode.ERROR, error.getMessage());
        } catch (Exception e) {
            logger.error("Error in onExecutionFailure", e);
        } finally {
            if (spanContext != null) {
                // Close scope and end span
                spanContext.close();
            }
        }
    }

    /**
     * Helper class to hold span and scope together for proper cleanup.
     */
    private static final class SpanContext {
        final Span span;
        final Scope scope;

        SpanContext(Span span, Scope scope) {
            this.span = span;
            this.scope = scope;
        }

        void close() {
            try {
                if (scope != null) {
                    scope.close();
                }
            } finally {
                if (span != null) {
                    span.end();
                }
            }
        }
    }
}
