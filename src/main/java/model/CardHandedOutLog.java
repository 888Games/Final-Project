package model;


/**
 * @author Ulrich Firpion
 */

/**
 * Class to manage when a GamblingCard is handed back to the cashier
 */

public class CardHandedOutLog {


    /**
     * Override method which displays when a card has been given back to the cashier by a gambler
     * @return info
     */
    @Override
    public String toString() {
        return "Card has been given back by the gambler to the cashier" ;
    }
}
