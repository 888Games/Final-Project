package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Represents a card
 */
public class Card {

    private String cardId;
    private List<String> betIds;

    /**
     * Creates a card with an automatically generated ID
     * and an empty list of bet IDs
     * Should only be called by the cashier
     */
    public Card(){
    this.betIds = new ArrayList<>();
    }

    public List<String> getBetIds() {
        return betIds;
    }

    /**
     * Stores a betId on the card
     * @param betId String value of the bet Id
     */
    public void addBetId(String betId) {
        if (betId == null){
            throw new IllegalArgumentException("betId should not be null");
        }
        if (betId == ""){
            throw new IllegalArgumentException("betId should not be empty");
        }
    betIds.add(betId);
    }

    /**
     * Generates a new betId
     * @return  betId String value of the generated bet Id
     */
    public String generateBetId() {
        String betId = UUID.randomUUID().toString();
        return betId;
    }

}
