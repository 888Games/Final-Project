package model;

/**
 * @author Ulrich Firpion
 */

/**
 * Class to manage the end of a betting round
 */

public class BettingRoundEndLog {

    /**
     * Method which given a betting round return its result
     * @param bettingRound
     * @return  result double value of the Betting round
     */
    public double getResult(BettingRound bettingRound) {
        return 0.0;
    }

    /**
     * Override method to display the end of a beginning round
     * @return info about the beginning of the betting round
     */
    @Override
    public String toString() {
        return "Betting round ended with the result :" ;
    }
}
