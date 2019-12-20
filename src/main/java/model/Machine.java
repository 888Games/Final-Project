package model;


/**
 * Machine is a class to manage the bets of gamblers.
 */
public class Machine {

    /**
     * Checks with the cashier if there is enough credit on the
     * card to place a bet. If so, it lets the BettingRound add
     * the bet to the list.
     * @param inValue
     */
    public void placeBet(int inValue) {}

    /**
     * On BettingRound's finish, notifies the gambler about the
     * value won.
     * @param bet
     */
    public void getOutValue(Bet bet) {}
}