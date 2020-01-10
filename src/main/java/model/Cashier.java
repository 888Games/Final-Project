package model;

/**
 * @author 888 Games
 */

import java.util.Map;

/**
 * Class to manage cards
 */
public class Cashier {

    private String cashierId;
    private Map<Card,CardCredit> cardCredits;
    private Logger cashierLog;
    private AuthorityGateway authorityGateway;

    /**
     * Creates a new card.
     * @param credit Double Initial credit of the card.
     * @return Card The created card.
     */
    public Card createCard(Double credit){
        return new Card();
    }

    /**
     * Gets the credit of the card.
     * @param card Card card to perform the operation
     * @return credit Double card's credit
     */
    public Double getCardCredit(Card card){
        return 0.0;
    }

    /**
     * Adds credit to the card.
     * @param card Card Card to perform the operation.
     * @param credit Double Added credit from the current credit of the card.
     *               May be negative, but not bigger than the current credit of the card.
     */
    public void updateCardCredit(Card card, Double credit){
        return;
    }

    /**
     * Chaeks if the card's credit is greater or equal than credit
     * @param card Card Card to perform the operation.
     * @param credit Double
     */
    public Boolean checkCardCredit(Card card, Double credit){
        return false;
    }

    /**
     * Withdraw credit from the card.
     * Sets the credit of the card to 0.
     * @param card Card Card to perform the operation.
     * @return credit Double Cash to withdraw.
     */
    public Double cashOutCard(Card card) {
        return 0.0;
    }
}
