package model;

/**
 * @author Simon Martin Florian*
 */

/**
 * Class to manage gambler cards
 */

public class Cashier {

    /**
     * This is a method for getting the current credit of a GamblerCard.
     * @param gambleCardId String value of the gambleCard id
     * @return currentCredit Double value of the current credit for the card id
     */

    public double getCredit(String gambleCardId){
        return 0.0;
    }


    /**
     * This is a method for giving a gambler card back and getting the credit from the card
     * @param gambleCardId String value of the gambleCard id
     * @return credit Double value of the balance for the card id
     */

    public double cashOutCard(String gambleCardId) {
        return 0.0;
    }

    /**
     * This is a method for creating a new a gambler card
     * @param initialBalance Double value of the initial balance
     * @return String value of the id of the created gambler card
     */

    public String getGamblerCard(double initialBalance){
        return "";
    }


    /**
     * This is a method for updating the current credit of a gambler card
     * @param gambleCardId String value of the gambleCard id
     * @param credit Double value of the credit which is added or substracted from the current credit
     */

    public void updateCredit(String gambleCardId, double credit){

    }


}
