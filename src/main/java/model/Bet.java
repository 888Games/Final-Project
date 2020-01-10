package model;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * A bet is taken by the Gambler and processed by the BettingRound class.
 * It stores a timeStamp of its creation, the value of the bet and the value
 * at the end of the betting round, which is transferred to the gambler's card.
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


    public void resolve(){}

}
