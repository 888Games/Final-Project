package model;

/**
 * @author 888 Games
 */

/**
 * Class to manage cards
 */
public class Cashier {

    /**
     * Gets the credit of the card.
     * @param card Card card to perform the operation
     * @return credit double card's credit
     */
    public double getCardCredit(Card card){
        return 0.0;
    }

    /**
     * Withdraw credit from the card.
     * Sets the credit of the card to 0.
     * @param card Card Card to perform the operation.
     * @return credit double Cash to withdraw.
     */
    public double cashOutCard(Card card) {
        return 0.0;
    }

    /**
     * Creates a new card.
     * @param credit Double Initial credit of the card.
     * @return Card The created card.
     */
    public Card createCard(double credit){
        return new Card(0);
    }

    /**
     * Adds credit to the card.
     * @param card Card Card to perform the operation.
     * @param credit double Added credit from the current credit of the card.
     *               May be negative, but not bigger than the current credit of the card.
     */
    public void updateCardCredit(Card card, double credit){
        return;
    }
}
