package model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
     * Creates a new game with a list for the betting rounds.
     * @param name The name of the game
     */
    public Game(String name){
        if ( name == null || name.equals("") ) {
            throw new IllegalArgumentException("Name should be a non-empty string.");
        } else {
            this.gameId = UUID.randomUUID().toString();
            this.gameName = name;
            this.gameLog = new Logger();
            this.authorityGateway = AuthorityGateway.getInstance();
            this.bettingRounds = new ArrayList<>();
            BettingRound nextRound = new BettingRound();
            this.bettingRounds.add(nextRound);
            this.gameLog.log(ZonedDateTime.now(ZoneId.of("UTC")) + " Game round was created with token " + nextRound.getBettingRoundId());

        }
    }

    public String getGameId() {
        return gameId;
    }

    public Logger getGameLog() {
        return gameLog;
    }

    public List<BettingRound> getBettingRounds() {
        return bettingRounds;
    }

    /**
     * Returns the current betting round of the game.
     * @return the current betting round or null if there is no active betting round
     */
    public BettingRound getCurrentBettingRound(){
        return bettingRounds.stream()
                .filter(br -> br.getEndedAt() == null)
                .findAny()
                .orElse(null);
    }
}
