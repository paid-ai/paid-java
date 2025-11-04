package com.paid.api.tracing;

import io.opentelemetry.api.baggage.Baggage;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import io.opentelemetry.sdk.trace.SpanProcessor;

/**
 * Custom SpanProcessor that adds Paid-specific attributes to spans.
 *
 * <p>This processor:
 * <ul>
 *   <li>Prefixes all span names with "paid.tracing." for consistent namespacing</li>
 *   <li>Reads user-defined attributes from Baggage (customerId, agentId, metadata, etc.)</li>
 *   <li>Adds attributes with "metadata." prefix to spans</li>
 *   <li>Ensures thread-safe attribute propagation across async boundaries</li>
 * </ul>
 */
class PaidSpanProcessor implements SpanProcessor {

    private static final String SPAN_NAME_PREFIX = "paid.tracing.";
    private static final String METADATA_PREFIX = "metadata.";

    /**
     * Creates a new PaidSpanProcessor.
     */
    public PaidSpanProcessor() {}

    @Override
    public void onStart(Context parentContext, ReadWriteSpan span) {
        try {
            // Prefix span name with "paid.tracing."
            String originalName = span.getName();
            if (!originalName.startsWith(SPAN_NAME_PREFIX)) {
                span.updateName(SPAN_NAME_PREFIX + originalName);
            }

            // Read baggage from context and add as span attributes
            Baggage baggage = Baggage.fromContext(parentContext);
            if (baggage != null && !baggage.isEmpty()) {
                baggage.forEach((key, entry) -> {
                    String value = entry.getValue();
                    if (value != null && !value.isEmpty()) {
                        span.setAttribute(key, value);
                    }
                });
            }
        } catch (Exception e) {
            // Never fail span creation due to processor errors
            System.err.println("Error in PaidSpanProcessor.onStart: " + e.getMessage());
        }
    }

    @Override
    public boolean isStartRequired() {
        return true;
    }

    @Override
    public void onEnd(ReadableSpan span) {
        // Nothing to do on end
    }

    @Override
    public boolean isEndRequired() {
        return false;
    }
}
