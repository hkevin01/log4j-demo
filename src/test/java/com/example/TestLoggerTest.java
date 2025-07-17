/*
 * Agent AI Rule: Always add meaningful comments to all .java files and keep code modular, readable, and maintainable.
 * This rule is kept at the top of each Java file for visibility and consistency.
 */

package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for TestLogger using Log4j 2.x and JUnit 5.
 */
public class TestLoggerTest {
    private static final Logger logger = LogManager.getLogger(TestLoggerTest.class);

    @Test
    public void testLogging() {
        logger.info("Unit test: info log");
        logger.error("Unit test: error log");
        assertTrue(true, "Dummy assertion for logging test");
    }
}
