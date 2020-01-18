package model;

import java.util.Map;

/**
 * Represents the cashier
 */
public class Cashier {

    private String cashierId;
    private Map<Card,CardCredit> cardCredits;
    private Logger cashierLog;
    private AuthorityGateway authorityGateway;
    private static Cashier instance = null;

    private Cashier() {
    }

    public static Cashier getInstance() {
        if(instance == null)
            instance = new Cashier();
        return instance;
    }

    /**
     * Creates a new card and returns it.
     * @param credit Double Initial credit of the card.
     * @return Card The created card.
     */
    public Card createCard(Double credit){
        return new Card();
    }

    /**
     * Returns the current credit of the card.
     * @param card Card card to get the credit from
     * @return credit Double current card's credit
     */
    public Double getCardCredit(Card card){
        return 0.0;
    }

    /**
     * Adds credit to the card. Throws exception if the credit
     * is negative and the card doesnt have enough credit.
     * @param card Card Card to perform the operation.
     * @param credit Double Added credit from the current credit of the card. May be negative.
     */
    public void updateCardCredit(Card card, Double credit){

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
