package model;


import java.util.List;

/**
 * Machine is a class to manage the bets of gamblers.
 */
public class Machine {

    private String machineId;
    private List<Card> connectedCards;
    private Cashier cashier;
    private Game game;

    /**
     * Checks with the cashier if there is enough credit on the
     * card to place a bet. If so, it lets the BettingRound add
     * the bet to the list.
     * @param inValue the amount I want to bet
     */
    public void placeBet(Card card, int inValue) {}

    /**
     * On BettingRound's finish, notifies the gambler about the
     * value won.
     * @param bet the bet for the outvalue
     */
    public void getOutValue(Bet bet) {}

    /**
     *
     * @param
     */
    public void connectCard(Card card){}

    /**
     *
     * @param
     */
    public void disconnectCard(Card card){}

    /**
     *
     * @param
     */
    public void givePrize(Bet bet){}
}