package model;

import java.util.List;

/**
 * Represents a machine
 */
public class Machine {

    private String machineId;
    private List<Card> connectedCards;
    private Cashier cashier;
    private Game game;

    /**
     * Creates a new machine.
     */
    public Machine(){}

    /**
     * Creates a bet with the inValue into the current betting round.
     * Throws exception if there is no current betting round or the credit
     * of the card is lower than inValue.
     * @param card Card the operation be performed on
     * @param inValue the amount of money bet
     */
    public void placeBet(Card card, int inValue) {}

    /**
     * Connects the card to the machine.
     * @param card to be connected
     */
    public void connectCard(Card card){}

    /**
     * Disconnects the card from the machine
     * @param card to be disconnected
     */
    public void disconnectCard(Card card){}

    /**
     * Updates the card credit with the outValue of the bet.
     * @param bet Bet that contains outValue
     */
    public void givePrize(Bet bet){}
}