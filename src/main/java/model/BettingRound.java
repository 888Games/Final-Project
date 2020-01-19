package model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *  Represents a round of betting
 */
public class BettingRound {
    private String bettingRoundId;
    private ZonedDateTime createdAt;
    private ZonedDateTime endedAt;
    private List<Bet> bets;
    private Logger bettingRoundLog;
    private AuthorityGateway authorityGateway;

    /**
     * Creates a new betting round
     */
    public BettingRound() {
        this.bets = new ArrayList<>();
        this.authorityGateway = AuthorityGateway.getInstance();

    }

    public void setAuthorityGateway(AuthorityGateway authorityGateway) {
        this.authorityGateway = authorityGateway;
    }

    public String getBettingRoundId() {
        return bettingRoundId;
    }

    public ZonedDateTime getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(ZonedDateTime endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * Saves the bet in a betting round
     * @param bet Bet to be placed
     */
    public void placeBet(Bet bet) {
        if(bet.isResolved()){
            throw new IllegalArgumentException("Cannot place bet which has already been resolved");
        }
        if(!bet.isResolved()){
            this.bets.add(bet);
        }
    }

    /**
     * Defines the winning bet and the amount of money won
     * Should only be called once in the end of the betting round
     */
    public void resolveBets() {
        int randomNumber = this.authorityGateway.randomInt("");
        Double finalOutValue = 0.0;
        for (Bet bet : bets){
            finalOutValue = bet.getInValue() + finalOutValue;
            if(bets.indexOf(bet) != randomNumber-1){
                bet.resolve(0.0);
            }
        }
        bets.get(randomNumber-1).resolve(finalOutValue);

    }
}

