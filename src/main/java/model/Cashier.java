package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the cashier
 */
public class Cashier {

    private String cashierId;
    private Map<Card,CardCredit> cardCredits = new HashMap<>();
    private Logger cashierLog;
    private AuthorityGateway authorityGateway;
    private static Cashier instance = null;

    private Cashier() {}

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
        if(credit == null) throw new IllegalArgumentException();
        if(credit < 0) throw new IllegalArgumentException();

        Card card = new Card();
        cardCredits.put(card, new CardCredit(credit));
        return card;
    }

    /**
     * Returns the current credit of the card.
     * @param card Card card to get the credit from
     * @return credit Double current card's credit
     */
    public Double getCardCredit(Card card){
        if(!cardCredits.containsKey(card)) throw new IllegalArgumentException();

        return cardCredits.get(card).getCredit();
    }

    /**
     * Adds credit to the card. Throws exception if the credit
     * is negative and the card doesnt have enough credit.
     * @param card Card Card to perform the operation.
     * @param credit Double Added credit from the current credit of the card. May be negative.
     */
    public void updateCardCredit(Card card, Double credit){
        if (card == null) throw new IllegalArgumentException();
        if (credit == null) throw new IllegalArgumentException();
        if (!cardCredits.containsKey(card)) throw new IllegalArgumentException();

        CardCredit cardCredit = cardCredits.get(card);
        Double oldCredit = cardCredit.getCredit();
        Double newCredit = oldCredit + credit;

        if (newCredit < 0) throw new InsufficientCreditException();

        cardCredit.setCredit(newCredit);
    }

    /**
     * Withdraw credit from the card.
     * Sets the credit of the card to 0.
     * @param card Card Card to perform the operation.
     * @return credit Double Cash to withdraw.
     */
    public Double cashOutCard(Card card) {
        if (card == null) throw new IllegalArgumentException();
        if (!cardCredits.containsKey(card)) throw new IllegalArgumentException();

        CardCredit cardCredit = cardCredits.get(card);
        Double credit = cardCredit.getCredit();
        cardCredit.setCredit(0.0);

        return credit;
    }
}
