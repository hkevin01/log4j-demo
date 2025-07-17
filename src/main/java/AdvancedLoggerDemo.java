/*
 * Agent AI Rule: Always add meaningful comments to all .java files and keep code modular, readable, and maintainable.
 * This rule is kept at the top of each Java file for visibility and consistency.
 */

package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.filter.LevelMatchFilter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.apache.logging.log4j.core.config.Configurator;

/**
 * AdvancedLoggerDemo demonstrates advanced Log4j 2.x features.
 */
public class AdvancedLoggerDemo {
    // Logger instance for this class
    private static final Logger logger = LogManager.getLogger(AdvancedLoggerDemo.class);

    /**
     * Main method to demonstrate advanced logging features.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Set log level programmatically
        Configurator.setRootLevel(Level.DEBUG);

        // Custom pattern layout
        PatternLayout layout = PatternLayout.newBuilder()
            .withPattern("%d [%t] %-5level: %msg%n%throwable")
            .build();

        // Custom filter: only allow ERROR level
        Filter errorFilter = LevelMatchFilter.newBuilder()
            .setLevel(Level.ERROR)
            .setOnMatch(Filter.Result.ACCEPT)
            .setOnMismatch(Filter.Result.DENY)
            .build();

        // Console appender with filter
        Appender consoleAppender = ConsoleAppender.newBuilder()
            .setName("Console")
            .setLayout(layout)
            .setFilter(errorFilter)
            .build();
        // File appender
        Appender fileAppender = FileAppender.newBuilder()
            .setName("File")
            .setLayout(layout)
            .withFileName("logs/advanced-demo.log")
            .build();

        // Log messages
        logger.debug("Debug message (should not appear in console)");
        logger.info("Info message (should not appear in console)");
        logger.error("Error message (should appear in console and file)");
    }
}
