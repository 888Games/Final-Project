package model;

import java.util.List;

/**
 * Represents a game
 */
public class Game {
    private String gameId;
    private String gameName;
    private List<BettingRound> bettingRounds;
    private Logger gameLog;
    private AuthorityGateway authorityGateway;

    /**
     * Creates a new game and a list for the betting rounds.
     * @param name The name of the game
     */
    public Game(String name){}

    /**
     * Returns the current betting round of the game.
     * @return the current betting round or null if there is no active betting round
     */
    public BettingRound getCurrentBettingRound(){ return new BettingRound(); }
}
