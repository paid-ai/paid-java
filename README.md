# Paid Java Library

[![fern shield](https://img.shields.io/badge/%F0%9F%8C%BF-Built%20with%20Fern-brightgreen)](https://buildwithfern.com?utm_source=github&utm_medium=github&utm_campaign=readme&utm_source=https%3A%2F%2Fgithub.com%2Fpaid-ai%2Fpaid-java)
[![Maven Central](https://img.shields.io/maven-central/v/ai.paid/paid-java)](https://central.sonatype.com/artifact/ai.paid/paid-java)

The Paid Java library provides convenient access to the Paid API from Java.

## Installation

### Gradle

Add the dependency in your `build.gradle` file:

```groovy
dependencies {
  implementation 'ai.paid:paid-java'
}
```

### Maven

Add the dependency in your `pom.xml` file:

```xml
<dependency>
  <groupId>ai.paid</groupId>
  <artifactId>paid-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

## Reference

A full reference for this library is available [here](https://github.com/paid-ai/paid-java/blob/HEAD/./reference.md).

## Usage

Instantiate and use the client with the following:

```java
package com.example.usage;

import com.paid.api.PaidApiClient;
import com.paid.api.resources.customers.requests.CustomerCreate;

public class Example {
    public static void main(String[] args) {
        PaidApiClient client = PaidApiClient
            .builder()
            .token("<token>")
            .build();

        client.customers().create(
            CustomerCreate
                .builder()
                .name("Acme, Inc.")
                .externalId("acme-inc")
                .build()
        );
    }
}
```

## Environments

This SDK allows you to configure different environments for API requests.

```java
import com.paid.api.PaidApiClient;
import com.paid.api.core.Environment;

PaidApiClient client = PaidApiClient
    .builder()
    .environment(Environment.Production)
    .build();
```

## Base Url

You can set a custom base URL when constructing the client.

```java
import com.paid.api.PaidApiClient;

PaidApiClient client = PaidApiClient
    .builder()
    .url("https://example.com")
    .build();
```

## Exception Handling

When the API returns a non-success status code (4xx or 5xx response), an API exception will be thrown.

```java
import com.paid.api.core.PaidApiApiException;

try {
    client.customers().create(...);
} catch (PaidApiApiException e) {
    // Do something with the API exception...
}
```

## Advanced

### Custom Client

This SDK is built to work with any instance of `OkHttpClient`. By default, if no client is provided, the SDK will construct one. 
However, you can pass your own client like so:

```java
import com.paid.api.PaidApiClient;
import okhttp3.OkHttpClient;

OkHttpClient customClient = ...;

PaidApiClient client = PaidApiClient
    .builder()
    .httpClient(customClient)
    .build();
```

### Retries

The SDK is instrumented with automatic retries with exponential backoff. A request will be retried as long
as the request is deemed retryable and the number of retry attempts has not grown larger than the configured
retry limit (default: 2).

A request is deemed retryable when any of the following HTTP status codes is returned:

- [408](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/408) (Timeout)
- [429](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429) (Too Many Requests)
- [5XX](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500) (Internal Server Errors)

Use the `maxRetries` client option to configure this behavior.

```java
import com.paid.api.PaidApiClient;

PaidApiClient client = PaidApiClient
    .builder()
    .maxRetries(1)
    .build();
```

### Timeouts

The SDK defaults to a 60 second timeout. You can configure this with a timeout option at the client or request level.

```java
import com.paid.api.PaidApiClient;
import com.paid.api.core.RequestOptions;

// Client level
PaidApiClient client = PaidApiClient
    .builder()
    .timeout(10)
    .build();

// Request level
client.customers().create(
    ...,
    RequestOptions
        .builder()
        .timeout(10)
        .build()
);
```

### Custom Headers

The SDK allows you to add custom headers to requests. You can configure headers at the client level or at the request level.

```java
import com.paid.api.PaidApiClient;
import com.paid.api.core.RequestOptions;

// Client level
PaidApiClient client = PaidApiClient
    .builder()
    .addHeader("X-Custom-Header", "custom-value")
    .addHeader("X-Request-Id", "abc-123")
    .build();
;

// Request level
client.customers().create(
    ...,
    RequestOptions
        .builder()
        .addHeader("X-Request-Header", "request-value")
        .build()
);
```

## Tracing

The Paid Java SDK includes built-in OpenTelemetry tracing support for monitoring and analyzing your application's behavior, including automatic instrumentation for AWS Bedrock operations.

### Initialization

Initialize tracing before making any API calls or Bedrock requests:

```java
import com.paid.api.tracing.PaidTracing;

// Using environment variables (PAID_API_KEY required, PAID_OTEL_COLLECTOR_ENDPOINT optional)
PaidTracing.initialize();

// Or with explicit API key (uses default endpoint)
PaidTracing.initialize("your-api-key");

// Or with custom endpoint
PaidTracing.initialize("your-api-key", "https://collector.agentpaid.io:4318/v1/traces");
```

**Environment Variables:**
- `PAID_API_KEY` - Required for authentication
- `PAID_OTEL_COLLECTOR_ENDPOINT` - Optional, defaults to `https://collector.agentpaid.io:4318/v1/traces`

### Tracing Your Code

Use `PaidTracing.trace()` to create traced spans for your operations. This creates a parent span that will automatically include any child spans from auto-instrumented operations (like Bedrock API calls).

#### Try-With-Resources Pattern

```java
import com.paid.api.tracing.PaidTracing;
import com.paid.api.tracing.TraceScope;

try (TraceScope scope = PaidTracing.trace()
        .externalCustomerId("customer_123")
        .externalAgentId("agent_456")
        .metadata("region", "us-west")
        .metadata("environment", "production")
        .start()) {
    // Your code here - all operations will be traced
    String result = performWorkflow();
}
```

#### Callback Pattern

```java
// With return value
String result = PaidTracing.trace()
    .externalCustomerId("customer_123")
    .externalAgentId("agent_456")
    .call(() -> performWorkflow());

// Without return value
PaidTracing.trace()
    .externalCustomerId("customer_123")
    .run(() -> performTask());
```

#### Nested Metadata

You can add nested metadata that will be flattened using dot notation:

```java
Map<String, Object> metadata = Map.of(
    "request", Map.of(
        "type", "chat",
        "model", "claude-3-sonnet"
    ),
    "user", Map.of(
        "tier", "premium"
    )
);

try (TraceScope scope = PaidTracing.trace()
        .externalCustomerId("customer_123")
        .metadata(metadata)  // Creates: metadata.request.type, metadata.request.model, metadata.user.tier
        .start()) {
    // Your traced code
}
```

### Emitting Signals

Emit custom events within a tracing context to track important application events:

```java
try (TraceScope scope = PaidTracing.trace()
        .externalCustomerId("customer_123")
        .start()) {

    // Process order
    processOrder(orderId);

    // Emit signal without cost tracking
    PaidTracing.signal("order_processed");

    // Emit signal with metadata
    PaidTracing.signal("payment_received", false, Map.of(
        "order_id", "12345",
        "amount", "99.99",
        "currency", "USD"
    ));

    // Make AI API call
    String response = callBedrockModel();

    // Emit signal with cost tracking enabled (associates with Bedrock costs)
    PaidTracing.signal("ai_response_complete", true);
}
```

**Signal Parameters:**
- `eventName` - Name of the event (e.g., "order_processed", "payment_received")
- `enableCostTracing` - If `true`, associates this signal with cost/usage traces from the same context. Only call once per tracing context to avoid duplicate cost associations.
- `data` - Optional map of additional context data (will be JSON-serialized)

### AWS Bedrock Instrumentation

The SDK provides automatic instrumentation for AWS Bedrock operations. This captures detailed telemetry including model parameters, token usage, and prompt caching metrics.

#### Setup

Enable Bedrock instrumentation after initializing tracing:

```java
import com.paid.api.tracing.PaidTracing;
import com.paid.api.tracing.instrumentation.bedrock.BedrockInstrumentor;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.bedrockruntime.BedrockRuntimeClient;

// Initialize tracing
PaidTracing.initialize("your-api-key");

// Enable Bedrock instrumentation
BedrockInstrumentor.instrument();

// Create Bedrock client - instrumentation is automatically applied
BedrockRuntimeClient bedrockClient = BedrockRuntimeClient.builder()
    .region(Region.US_EAST_1)
    .build();

// All Bedrock operations will now be automatically traced
```

#### Supported Operations

The Bedrock instrumentor automatically traces the following operations:

- **Converse** - Standard Bedrock conversation API
- **ConverseStream** - Streaming Bedrock conversation API
- **InvokeModel** - Standard Bedrock model invocation API
- **InvokeModelWithResponseStream** - Streaming Bedrock model invocation API

#### Example with Tracing Context

```java
try (TraceScope scope = PaidTracing.trace()
        .externalCustomerId("customer_123")
        .externalAgentId("agent_456")
        .metadata("task", "customer_support")
        .start()) {

    // Invoke Bedrock model - automatically traced
    InvokeModelResponse response = bedrockClient.invokeModel(request -> request
        .modelId("anthropic.claude-3-sonnet-20240229-v1:0")
        .body(SdkBytes.fromUtf8String(jsonRequest))
    );

    // Process response
    String result = response.body().asUtf8String();

    // Emit signal with cost tracking
    PaidTracing.signal("bedrock_inference_complete", true, Map.of(
        "model", "claude-3-sonnet",
        "success", true
    ));
}
```

#### Captured Metrics

The Bedrock instrumentation automatically captures:

- **Request Attributes:**
  - Model ID
  - Request parameters (max_tokens, temperature, top_p)
  - Guardrail configuration (if applicable)

- **Response Attributes:**
  - Response/Request ID
  - Token usage (input_tokens, output_tokens)
  - Prompt cache metrics (cache_read_input_tokens, cache_creation_input_tokens)
  - Stop reason (finish reason)
  - Response latency

All metrics follow OpenTelemetry GenAI semantic conventions for AWS Bedrock.

### Flushing Telemetry

Flush telemetry data before shutting down your application:

```java
PaidTracing.flush();
```

This is automatically handled via shutdown hook, but you can call it explicitly if needed.

### Logging

Uses SLF4J. Error logs are shown by default. Configurable with PAID_LOG_LEVEL environment variable.

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically.
Additions made directly to this library would have to be moved over to our generation code,
otherwise they would be overwritten upon the next generated release. Feel free to open a PR as
a proof of concept, but know that we will not be able to merge it as-is. We suggest opening
an issue first to discuss with us!

On the other hand, contributions to the README are always very welcome!
