package model;

/**
 *
 * @author Simon Martin Florian
 */

import java.util.List;

/**
 * Class for cards
 */

public class Card {

    private String cardId;
    private List<String> betIds;

    /**
     * Constructor for creating a card
     * Id is automatically created
     */
    public Card(){

    }

    /**
     * Method to store a betId on the card
     * @param betId String value of the bet Id
     */
    public void addBetId(String betId) {

    }

    /**
     * Method to generate a new betId
     * @return  betId String value of the generated bet Id
     */
    public String generateBetId() {
        return "";
    }

}
