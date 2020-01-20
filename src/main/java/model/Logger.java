package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a logger.
 */
public class Logger {

    private List<String> logs;
    private AuthorityGateway authorityGateway;

    public Logger() {
        this.logs = new ArrayList<>();
        this.authorityGateway = AuthorityGateway.getInstance();
    }

    public List<String> getLogs() {
        return logs;
    }

    public AuthorityGateway getAuthorityGateway() {
        return authorityGateway;
    }

    public void setAuthorityGateway(AuthorityGateway authorityGateway) {
        this.authorityGateway = authorityGateway;
    }

    /**
     * Saves a log message in the logs, sends it to authority.
     * @param message Message to be logged.
     */
    public void log(String message) {
        if (message != null) {
            this.logs.add(message);
            this.authorityGateway.sendLog(message);
        } else throw new IllegalArgumentException("Message cannot be null");
    }
}
