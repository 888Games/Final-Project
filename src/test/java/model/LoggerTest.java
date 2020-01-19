package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTest {

    /**
     * Asserts if creating a new Logger object works.
     */
    @Test
    public void createLogger_Always_ShouldPass() {
        //arrange
        //act
        Logger logger = new Logger();
        //assert
        assertNotNull(logger);
    }

    /**
     * Asserts if log method stores a new log in logs list.
     */
    @Test
    public void logs_AfterCreationOfLog_ShouldContainLog() {
        //arrange
        Logger logger = new Logger();
        String message = "18/01/2020 test message";
        //act
        logger.log(message);
        //assert
        assertTrue(logger.getLogs().contains(message));
    }

    /**
     * Asserts whether trying to store a null message throws IllegalArgumentException.
     */
    @Test (expected = IllegalArgumentException.class)
    public void logMessage_WithNullMessage_ShouldThrowIllegalArgumentsException() {
        //arrange
        Logger logger = new Logger();
        String message = null;
        //act
        logger.log(message);
    }

    /**
     * Asserts whether an empty message is successfully stored in logs.
     */
    @Test
    public void logMessage_WithEmptyMessage_ShouldPass() {
        //arrange
        Logger logger = new Logger();
        String message = "";
        //act
        logger.log(message);
        //assert
        assertTrue(logger.getLogs().contains(message));
    }
}