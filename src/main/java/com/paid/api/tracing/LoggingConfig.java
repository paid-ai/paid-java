package com.paid.api.tracing;

/**
 * Configures logging for the Paid tracing library.
 *
 * <p>This class reads the {@code PAID_LOG_LEVEL} environment variable and
 * configures the logging level for all Paid tracing loggers. The default
 * level is ERROR.
 *
 * <h3>Supported Log Levels (via PAID_LOG_LEVEL):</h3>
 * <ul>
 *   <li>ERROR (default)</li>
 *   <li>WARN</li>
 *   <li>INFO</li>
 *   <li>DEBUG</li>
 *   <li>TRACE</li>
 * </ul>
 *
 * <h3>Usage:</h3>
 * <pre>{@code
 * // Set via environment variable before starting the application:
 * export PAID_LOG_LEVEL=DEBUG
 * java -jar your-app.jar
 * }</pre>
 *
 * <p><b>Note:</b> This configuration works with SLF4J Simple Logger. If you're
 * using a different SLF4J implementation (logback, log4j2, etc.), you should
 * configure logging through that implementation's configuration files.
 */
final class LoggingConfig {

    private static final String ENV_LOG_LEVEL = "PAID_LOG_LEVEL";
    private static final String DEFAULT_LOG_LEVEL = "error";
    private static final String LOGGER_PACKAGE = "com.paid.api.tracing";

    static {
        configureLogging();
    }

    private LoggingConfig() {}

    /**
     * Configures logging based on the PAID_LOG_LEVEL environment variable.
     * This is called automatically when the class is loaded.
     */
    private static void configureLogging() {
        String envLevel = System.getenv(ENV_LOG_LEVEL);
        String logLevel = (envLevel != null && !envLevel.isEmpty()) ? envLevel.toLowerCase() : DEFAULT_LOG_LEVEL;

        // Validate log level
        if (!isValidLogLevel(logLevel)) {
            System.err.println("[PAID] Invalid PAID_LOG_LEVEL '" + envLevel + "', defaulting to ERROR. "
                    + "Valid values: ERROR, WARN, INFO, DEBUG, TRACE");
            logLevel = DEFAULT_LOG_LEVEL;
        }

        // Set system property for SLF4J Simple Logger
        // This property is read by slf4j-simple when it initializes
        String propertyKey = "org.slf4j.simpleLogger.log." + LOGGER_PACKAGE;

        // Only set if not already set (to allow system property override)
        if (System.getProperty(propertyKey) == null) {
            System.setProperty(propertyKey, logLevel);
        }
    }

    /**
     * Ensures logging is configured. Call this method to force initialization.
     */
    static void ensureConfigured() {
        // Static initializer will run if this is the first reference to the class
    }

    private static boolean isValidLogLevel(String level) {
        return level.equals("error")
                || level.equals("warn")
                || level.equals("info")
                || level.equals("debug")
                || level.equals("trace");
    }
}
