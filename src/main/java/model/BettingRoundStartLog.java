package model;

/**
 * @author Ulrich Firpion
 */

import java.time.LocalTime;

/**
 * Class to manage the beginning of a betting round
 */

public class BettingRoundStartLog {

    /**
     * Method to get the time a betting round has been started
     * @return the starting time of the betting round
     */
    public LocalTime getTime(){
        return LocalTime.now();
    }

    /**
     * Override method to display the start of a beginning round
     * @return info about the beginning of the betting round
     */
    @Override
    public String toString() {
        return "Betting round started at : ";
    }
}
