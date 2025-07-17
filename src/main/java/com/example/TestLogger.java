/*
 * Agent AI Rule: Always add meaningful comments to all .java files and keep code modular, readable, and maintainable.
 * This rule is kept at the top of each Java file for visibility and consistency.
 */

package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * TestLogger demonstrates Log4j 2.x logging in a JUnit test.
 */
public class TestLogger {
    // Logger instance for this class
    private static final Logger logger = LogManager.getLogger(TestLogger.class);

    /**
     * Runs a test to demonstrate logging at various levels.
     */
    @Test
    public void logTest() {
        runMe("This is a Test of the Logger");
    }

    /**
     * Logs messages at different levels using Log4j 2.x.
     * @param parameter Message to log
     */
    private void runMe(String parameter) {
        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : {}", parameter);
        }
        if (logger.isInfoEnabled()) {
            logger.info("This is info : {}", parameter);
        }
        logger.warn("This is warn : {}", parameter);
        logger.error("This is error : {}", parameter);
        logger.fatal("This is fatal : {}", parameter);
    }
}
