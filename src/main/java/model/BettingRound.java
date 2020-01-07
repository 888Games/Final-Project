package model;

/**
 *  Class for managing a round of betting. It stores the incoming bets and
 *  sends them to the authority and manages the payout at the end of the
 *  round. It also logs the starting and ending moment of the round.
 */
public class BettingRound {

    /**
     * The method stores the passed value (an incoming bet) in a list.
     * @param inValue Int bet value
     */
    public void placeBet(int inValue) {}


    /**
     * This method makes the cashier pay out the won amount
     * to the gambler's card.
     * @param cashier the used cashier
     * @param bet the ended bet
     */
    public void getOutValue(Cashier cashier, Bet bet) {}

    /**
     * Sends the bettingRoundId (the token) with the list of bets
     * when the round ends.
     */
    public void notifyAuthorityAtEnd() {}
}

