package model;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoggerTest {

    /**
     * Asserts if log method stores a new log in logs list.
     */
    @Test
    public void logs_AfterCreationOfLog_ShouldContainLog() {
        //arrange
        Logger logger = new Logger();
        String message = "Almost before we knew it, we had left the ground.";
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

    /**
     * Checks if logging a message also means sending it to the AuthorityGateway.
     * Indirect output
     */
    @Test
    public void log_WhenLoggingMessage_ShouldNotifyAuthority() {
        //arrange
        Logger logger = new Logger();
        AuthorityGateway ag = mock(AuthorityGateway.class);
        logger.setAuthorityGateway(ag);
        String message = "A shining crescent far beneath the flying vessel.";
        //act
        logger.log(message);
        //assert
        verify(ag).sendLog(message);
    }
}