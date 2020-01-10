package model;

/**
 *
 * @author Simon Martin Florian
 */

import java.util.List;

/**
 * Class for creating a game and starting rounds
 */

public class Game {
    private String gameId;
    private String gameName;
    private List<BettingRound> bettingRounds;
    private Logger gameLog;

    /**
     * Constructor for creating a new game
     * @param name String value of the name of the game
     */
    public Game(String name){}

    public BettingRound getCurrentBettingRound(){ return new BettingRound(); }
}
