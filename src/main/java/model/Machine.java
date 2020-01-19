package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    public Machine(){
        machineId = UUID.randomUUID().toString();
        game = new Game("easy-lottery");
        connectedCards = new ArrayList<>();
        cashier = Cashier.getInstance();
    }

    /**
     * Creates a bet with the inValue into the current betting round.
     * Throws exception if there is no current betting round or the credit
     * of the card is lower than inValue.
     * @param card Card the operation be performed on
     * @param inValue the amount of money bet
     */
    public void placeBet(Card card, Double inValue) {

        if(card != null && connectedCards.contains(card) && inValue != null &&inValue >= 0 && game.getCurrentBettingRound() != null){
            cashier.updateCardCredit(card,(0 - inValue));
            game.getCurrentBettingRound().placeBet(new Bet(inValue, this, card));

        }else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Connects the card to the machine.
     * @param card to be connected
     */
    public void connectCard(Card card){
        if (card != null && !connectedCards.contains(card)){
            connectedCards.add(card);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Disconnects the card from the machine
     * @param card to be disconnected
     */
    public void disconnectCard(Card card){
        if(card != null && connectedCards.contains(card)){
            connectedCards.remove(card);
        }else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Updates the card credit with the outValue of the bet.
     * @param bet Bet that contains outValue
     */
    public void givePrize(Bet bet){
        if(bet != null && bet.isResolved()){
            cashier.updateCardCredit(bet.getCard(), bet.getOutValue());
        }else {
            throw new IllegalArgumentException();
        }
    }
}