package model;

import java.util.Random;
import java.util.UUID;

/**
 * Middleware for the communication with the authority
 */
public class AuthorityGateway {
    public Logger authorityGatewayLog;
    private static AuthorityGateway instance = null;

    private AuthorityGateway() {
    }

    public static AuthorityGateway getInstance() {
        if(instance == null)
            instance = new AuthorityGateway();
        return instance;
    }

    /**
     * Requests a token from the authority
     * @return a token
     */
    public String getToken(){

        return UUID.randomUUID().toString();
    }

    /**
     * Requests a random integer based on the token from the authority
     * @param token the string needed by the authority for int generation
     * @return a reandom integer
     */
    public int randomInt(String token){
        Random r = new Random();
        return r.nextInt();
    }

    /**
     * Sends a log message to the authority
     * @param message the message to be logged
     */
    public void sendLog(String message){}
}
