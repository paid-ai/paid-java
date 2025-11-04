# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is the official Paid Java SDK, an auto-generated client library (built with Fern) that provides convenient access to the Paid API from Java applications. The SDK is published to Maven Central as `ai.paid:paid-java`.

## Build and Development Commands

### Building the Project
```bash
# Build the entire project
./gradlew build

# Build only the main library without tests
./gradlew jar

# Build and generate all artifacts (JAR, sources, javadoc)
./gradlew build
```

### Testing
```bash
# Run all tests
./gradlew test

# Run tests with output
./gradlew test --info

# Run a specific test class
./gradlew test --tests com.paid.api.core.QueryStringMapperTest

# Run a specific test method
./gradlew test --tests com.paid.api.core.QueryStringMapperTest.testMethod
```

### Code Quality
```bash
# Format code using Palantir Java Format (spotless)
./gradlew spotlessApply

# Check code formatting
./gradlew spotlessCheck

# Generate Javadoc
./gradlew javadoc
```

### Publishing
```bash
# Build and upload to Sonatype Central
./gradlew sonatypeCentralUpload

# This requires MAVEN_USERNAME, MAVEN_PASSWORD, MAVEN_SIGNATURE_SECRET_KEY, and MAVEN_SIGNATURE_PASSWORD environment variables
```

## Project Architecture

### Key Structure

The SDK is organized into several main layers:

1. **Client Layer** (`com.paid.api`)
   - `PaidApiClient`: Main synchronous client entry point
   - `AsyncPaidApiClient`: Asynchronous client variant
   - Builder pattern used for client configuration

2. **Resource Layer** (`com.paid.api.resources.*`)
   - Organized by API resource: `agents`, `contacts`, `customers`, `orders`, `usage`
   - Each resource has both sync and async client implementations
   - `*Client` and `Async*Client` classes provide the public API
   - `Raw*Client` and `AsyncRaw*Client` classes provide lower-level access

3. **Core Infrastructure** (`com.paid.api.core`)
   - **HTTP Handling**: `PaidApiHttpResponse`, `InputStreamRequestBody`
   - **Serialization**: `ObjectMappers` (Jackson configuration), `DateTimeDeserializer`
   - **Error Handling**: `PaidApiException`, `PaidApiApiException`
   - **Request Management**: `RequestOptions`, `ClientOptions`, `RetryInterceptor`
   - **Streaming**: `Stream`, `FileStream`, `ResponseBodyInputStream`
   - Uses OkHttp3 for HTTP operations

4. **Data Types** (`com.paid.api.types`)
   - Generated model classes for API entities: `Customer`, `Agent`, `Contact`, `Order`, etc.
   - Request DTOs: `CustomerCreate`, `CustomerUpdate`, `AgentCreate`, `OrderCreate`, etc.
   - Enums for constants: `ChargeType`, `BillingFrequency`, `CreationSource`, `Salutation`, `TaxExemptStatus`
   - Support types: `Address`, `Pricing`, `AgentAttribute`, `OrderLine`, etc.

### API Resource Methods Pattern

Each resource client follows this general pattern:
- `list()`: Get all entities of that type
- `create(request)`: Create a new entity
- `get(id)`: Retrieve a specific entity by ID
- `update(id, request)`: Update an entity
- `delete(id)`: Delete an entity
- `getByExternalId(externalId)`: Retrieve by external ID
- `updateByExternalId(externalId, request)`: Update by external ID
- `deleteByExternalId(externalId)`: Delete by external ID

### Client Configuration

The client supports configuration via `PaidApiClientBuilder`:
- `token(String)`: API authentication token
- `environment(Environment)`: API environment (Production, Staging, etc.)
- `url(String)`: Custom base URL for API
- `httpClient(OkHttpClient)`: Custom OkHttpClient instance
- `maxRetries(int)`: Retry count for retryable HTTP status codes (408, 429, 5XX)
- `timeout(int)`: Request timeout in seconds (default: 60s)
- `addHeader(String, String)`: Custom headers at client or request level

## Key Dependencies

- **OkHttp 4.12.0**: HTTP client
- **Jackson 2.17.2**: JSON serialization/deserialization with JDK8 and JSR310 support
- **JUnit 5.8.2**: Testing framework
- **Spotless 6.11.0**: Code formatting

## Important Notes

1. **Auto-Generated Code**: This library is generated programmatically from an API definition. Direct modifications to generated code will be overwritten on the next release. Changes should be made to the Fern API definition instead.

2. **Sample App**: The `sample-app` module provides example usage patterns and is included in the multi-module build via `settings.gradle`.

3. **Test Coverage**: Tests are located in `src/test/java` and include:
   - `QueryStringMapperTest`: Tests for query string encoding
   - `TestClient`: Client initialization and usage examples
   - `StreamTest`: File streaming functionality

4. **Compatibility**: Targets Java 1.8+ for both source and target compilation.

5. **Publishing**: The library includes signing and Maven publication configuration. Releases are published to Maven Central (Sonatype) with GPG signing.
