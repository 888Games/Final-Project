package model;

import javax.crypto.Mac;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Represents a bet
 */
public class Bet {
    private String betId;
    private ZonedDateTime createdAt;
    private ZonedDateTime resolvedAt;
    private Double inValue;
    private Double outValue;
    private Machine machine;
    private Card card;
    private AuthorityGateway authorityGateway;


    /**
     * Creates a new bet. Throws exception if the card
     * is not connected to the machine.
     * @param inValue The amount of money bet
     * @param machine The machine on which the bet is placed
     * @param card Card used to place a bet
     */
    public Bet(Double inValue, Machine machine, Card card) {
    }

    /**
     * Sets the outValue and updates the card credit
     * @param outValue the amount of money won
     */
    public void resolve(Double outValue){}


    public boolean isResolved() {
        return true;
    }

    public Double getOutValue() {
        return outValue;
    }
}
