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
        this.createdAt = ZonedDateTime.now();
        this.inValue = inValue;
        this.machine = machine;
        this.card = card;
        if (inValue == null || machine == null || card == null){
            throw new IllegalArgumentException("Values should not be null");
        }
    }

    public void setInValue(Double inValue) {
        this.inValue = inValue;
    }

    /**
     * Sets the outValue and updates the card credit
     * @param outValue the amount of money won
     */
    public void resolve(Double outValue){
        if(outValue <0 || outValue == null){
            throw new IllegalArgumentException("outValue should be positive");
        }
        this.outValue = outValue;
        this.resolvedAt = ZonedDateTime.now();
        this.machine.givePrize(this);

    }


    public boolean isResolved() {
        if (outValue == null && resolvedAt== null){
            return false;
        }
        return true;
    }

    public Double getOutValue() {
        return outValue;
    }

    public Double getInValue() {
        return inValue;
    }

    public Card getCard() {
        return card;
    }
}
