package model;

import java.time.ZonedDateTime;
import java.util.List;

/**
 *  Class for managing a round of betting. It stores the incoming bets and
 *  sends them to the authority and manages the payout at the end of the
 *  round. It also logs the starting and ending moment of the round.
 */
public class BettingRound {
    private String bettingRoundId;
    private ZonedDateTime createdAt;
    private ZonedDateTime endedAt;
    private List<Bet> bets;
    private Logger bettingRoundLog;
    private AuthorityGateway authorityGateway;

    /**
     *
     * @param bet Bet to place
     */
    public void placeBet(Bet bet) {}

    /**
     *
     */
    public void resolveBets() {}
}

