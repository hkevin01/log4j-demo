/*
 * Agent AI Rule: Always add meaningful comments to all .java files and keep code modular, readable, and maintainable.
 * This rule is kept at the top of each Java file for visibility and consistency.
 */

package src.main.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * BasicLoggerDemo demonstrates simple Log4j 2.x logging usage.
 */
public class BasicLoggerDemo {
    // Logger instance for this class
    private static final Logger logger = LogManager.getLogger(BasicLoggerDemo.class);

    /**
     * Main method to log messages at different levels.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}
