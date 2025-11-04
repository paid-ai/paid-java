package com.paid.api.tracing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import java.util.HashMap;
import java.util.Map;

public final class Signal {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Private constructor to prevent instantiation
    private Signal() {}

    static void emit(Tracer tracer, String eventName, boolean enableCostTracing, Map<String, Object> data) {
        if (tracer == null) {
            System.err.println("Cannot emit signal [" + eventName + "]: Tracer is not initialized");
            return;
        }

        Span span = tracer.spanBuilder("signal").startSpan();
        try {
            span.setAttribute("event_name", eventName);

            Map<String, Object> finalData = data;

            if (enableCostTracing) {
                // Let the app know to associate this signal with cost traces
                if (finalData == null) {
                    finalData = new HashMap<>();
                }
                Map<String, Object> paidMetadata = new HashMap<>();
                paidMetadata.put("enable_cost_tracing", true);
                finalData.put("paid", paidMetadata);
            }

            // Optional data (e.g., manual cost tracking)
            if (finalData != null && !finalData.isEmpty()) {
                try {
                    String jsonData = objectMapper.writeValueAsString(finalData);
                    span.setAttribute("data", jsonData);
                } catch (JsonProcessingException e) {
                    System.err.println(
                            "Failed to serialize data into JSON for signal [" + eventName + "]: " + e.getMessage());
                    // If cost tracing was enabled, at least preserve that
                    if (enableCostTracing) {
                        try {
                            Map<String, Object> fallbackData = new HashMap<>();
                            Map<String, Object> paidMetadata = new HashMap<>();
                            paidMetadata.put("enable_cost_tracing", true);
                            fallbackData.put("paid", paidMetadata);
                            span.setAttribute("data", objectMapper.writeValueAsString(fallbackData));
                        } catch (JsonProcessingException ignored) {
                            // If even this fails, continue without data attribute
                        }
                    }
                }
            }

            // Mark span as successful
            span.setStatus(StatusCode.OK);
            System.out.println("Signal [" + eventName + "] was sent");
        } finally {
            span.end();
        }
    }
}
