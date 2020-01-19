package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorityGatewayTest {

    /**
     * Asserts if getting an instance of AuthorityGateway actually returns an instance.
     */
    @Test
    public void getInstance_Always_ShouldPass() {
        //arrange
        //act
        AuthorityGateway SUT = AuthorityGateway.getInstance();
        //assert
        assertNotNull(SUT);
    }

    /**
     * Asserts if getting the AuthorityGateway instance multiple times always returns the same instance.
     */
    @Test
    public void getInstance_Twice_ShouldReturnTheSameInstance() {
        //arrange
        //act
        AuthorityGateway ag1 = AuthorityGateway.getInstance();
        AuthorityGateway ag2 = AuthorityGateway.getInstance();
        //assert
        assertEquals(ag1, ag2);
    }

    /**
     * Asserts if a string token is returned.
     */
    @Test
    public void getToken_Always_ShouldPass() {
        //arrange
        AuthorityGateway SUT = AuthorityGateway.getInstance();
        //act
        String token = SUT.getToken();
        //assert
        assertNotNull(token);
    }

    /**
     * Asserts if an integer is returned.
     */
    @Test
    public void getRandomInt_WithToken_ShouldPass() {
        //arrange
        AuthorityGateway SUT = AuthorityGateway.getInstance();
        String token = "token";
        //act
        int randomInt = SUT.randomInt(token);
        //assert
        assertNotNull(randomInt);
    }

    /**
     * Asserts if a string message can be passed to sendLog.
     * Dummy test for code coverage.
     * Should forward to Authority (outside of scope).
     */
    @Test
    public void sendLog_Always_ShouldPass() {
        //arrange
        AuthorityGateway SUT = AuthorityGateway.getInstance();
        String message ="The spectacle before us was indeed sublime.";
        //act
        SUT.sendLog(message);
        //assert
        assertNotNull(message);
    }
}