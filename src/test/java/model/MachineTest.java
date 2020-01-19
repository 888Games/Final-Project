package model;

import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Tests for machine model
 */
public class MachineTest {

    /**
     * validating the machine constructor. No parameters, all attributes are hard-coded initialized in the constructor.
     */
    @Test
    public void createMachine_Always_ShouldPass() {
        // arrange
        Machine machine = new Machine();
        //assert
        assertTrue("Machine is created successfully", machine != null);
    }

    /**
     * Validating connecting a card to an existing machine. Card should show up in the stored cards of the machine.
     */
    @Test
    public void connectCard_ShouldPass() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.connectCard(card);
        // assert
        assertTrue("Card should be stored in the connected Cards list", machine.getConnectedCards().contains(card));
    }

    /**
     * Validating connecting multiple cards to an existing machine. Card should show up in the stored cards of the machine.
     */
    @Test
    public void connectMultipleCards_ShouldPass() {
        // arrange
        Card card1 = mock(Card.class);
        Card card2 = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.connectCard(card1);
        machine.connectCard(card2);
        // assert
        assertTrue("Both cards should be stored in the connected Cards list", machine.getConnectedCards().contains(card1) && machine.getConnectedCards().contains(card2));
    }


    /**
     * Validating that null values are not allowed.
     */
    @Test (expected = IllegalArgumentException.class)
    public void connectCard_WithNullCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Machine machine = new Machine();
        // act
        machine.connectCard(null);
    }

    /**
     * Validating that a card can only be connected once.
     */
    @Test (expected = IllegalArgumentException.class)
    public void connectCard_WithAlreadyConnectedCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.connectCard(card);
        machine.connectCard(card);
    }

    /**
     * Validating that when disconnecting a card the card is removed from the machine connected cards.
     */
    @Test
    public void disconnectCard_ShouldPass() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        machine.connectCard(card);
        // act
        machine.disconnectCard(card);
        // assert
        assertTrue("Card should be removed from the connected Cards list", !machine.getConnectedCards().contains(card));
    }

    /**
     * Validating that a machine can handle multiple cards at the same time.
     */
    @Test
    public void disconnectMultipleCards_ShouldPass() {
        // arrange
        Card card1 = mock(Card.class);
        Card card2 = mock(Card.class);
        Machine machine = new Machine();
        machine.connectCard(card1);
        machine.connectCard(card2);
        // act
        machine.disconnectCard(card2);
        machine.disconnectCard(card1);
        // assert
        assertTrue("Both cards should be removed from the connected Cards list", !machine.getConnectedCards().contains(card1) && !machine.getConnectedCards().contains(card2));

    }

    /**
     * Validating that null values are not allowed.
     */
    @Test (expected = IllegalArgumentException.class)
    public void disconnectCard_WithNullCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        machine.connectCard(card);
        // act
        machine.disconnectCard(null);
    }

    /**
     * Validating that a not connected card can not be disconnected.
     */
    @Test (expected = IllegalArgumentException.class)
    public void disconnectCard_WithNotConnectedCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.disconnectCard(card);
    }

    /**
     * Validating that teh give prize method updates teh card credit through the cashier.
     */
    @Test
    public void givePrize_ShouldPass() {
        // arrange
        Machine machine = new Machine();
        Cashier cashier = mock(Cashier.class);
        machine.setCashier(cashier);
        Bet bet = mock(Bet.class);
        Card card = mock(Card.class);
        when(bet.isResolved()).thenReturn(true);
        when(bet.getCard()).thenReturn(card);
        when(bet.getOutValue()).thenReturn(20.0);
        // act
        machine.givePrize(bet);
        //assert
        verify(cashier).updateCardCredit(card,20.0);
    }

    /**
     * Validating that null values are not allowed.
     */
    @Test (expected = IllegalArgumentException.class)
    public void givePrize_WithNullBet_ShouldThrowIllegalArgumentsException() {
        // arrange
        Machine machine = new Machine();
        // act
        machine.givePrize(null);
    }

    /**
     * Validating that an unresolved bet can not be given a prize.
     */
    @Test (expected = IllegalArgumentException.class)
    public void givePrize_WithUnresolvedBet_ShouldThrowIllegalArgumentsException() {
        // arrange
        Machine machine = new Machine();
        Cashier cashier = mock(Cashier.class);
        machine.setCashier(cashier);
        Bet bet = mock(Bet.class);
        Card card = mock(Card.class);
        when(bet.isResolved()).thenReturn(false);
        when(bet.getCard()).thenReturn(card);
        // act
        machine.givePrize(bet);
        // assert
        verifyZeroInteractions(cashier);
    }

    /**
     * Validating that a bet can not be placed with a negative number.
     */
    @Test(expected = IllegalArgumentException.class)
    public void placeBet_WithNegativeInValue_ShouldThrowIllegalArgumentsException() {
        // arrange
        Machine machine = new Machine();
        Cashier cashier = mock(Cashier.class);
        machine.setCashier(cashier);
        Card card = mock(Card.class);
        machine.connectCard(card);
        // act
        machine.placeBet(card, -1.0);
        // assert
        verifyZeroInteractions(cashier);
    }

    /**
     * Validating that a bet can be placed with a positive number.
     */
    @Test
    public void placeBet_WithPositiveInValue_ShoudlPass() {
        // arrange
        Machine machine = new Machine();
        Card card = mock(Card.class);
        Cashier cashier = mock(Cashier.class);
        when(cashier.getCardCredit(card)).thenReturn(10.0);
        machine.setCashier(cashier);
        machine.connectCard(card);
        // act
        machine.placeBet(card, 1.0);
        // assert
        verify(cashier).updateCardCredit(card,-1.0);
    }

    /**
     * Validating that a bet can be placed without money.
     */
    @Test
    public void placeBet_WithZeroInValue_ShouldPass() {
        // arrange
        Machine machine = new Machine();
        Cashier cashier = mock(Cashier.class);
        machine.setCashier(cashier);
        Card card = mock(Card.class);
        machine.connectCard(card);
        // act
        machine.placeBet(card, 0.0);
        // assert
        verify(cashier).updateCardCredit(card, 0.0);
    }

    /**
     * Validating that null values are not allowed.
     */
    @Test (expected = IllegalArgumentException.class)
    public void placeBet_WithNullInValue_ShouldThrowIllegalArgumentsException() {
        // arrange
        Machine machine = new Machine();
        Cashier cashier = mock(Cashier.class);
        machine.setCashier(cashier);
        Card card = mock(Card.class);
        machine.connectCard(card);
        // act
        machine.placeBet(card, null);
        // assert
        verifyZeroInteractions(cashier);
    }

    /**
     * Validating that the card credit gets updated through teh cashier as soon as the bet was placed.
     */
    @Test
    public void placeBet_WithValidBet_CardCreditShouldBeUpdatedThroughCashier() {
        // arrange
        Machine machine = new Machine();
        Cashier cashier = mock(Cashier.class);
        machine.setCashier(cashier);
        Card card = mock(Card.class);
        when(cashier.getCardCredit(card)).thenReturn(10.0);
        machine.setCashier(cashier);
        machine.connectCard(card);
        // act
        machine.placeBet(card, 1.0);
        //assert
        verify(cashier).updateCardCredit(card, -1.0);
    }

    /**
     * Validating that the card for the bet is connected to the machine.
     */
    @Test (expected = IllegalArgumentException.class)
    public void placeBet_WithNotConnectedCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Machine machine = new Machine();
        Cashier cashier = mock(Cashier.class);
        machine.setCashier(cashier);
        Card card = mock(Card.class);
        // act
        machine.placeBet(card, 1.0);
        // assert
        verifyZeroInteractions(cashier);
    }

    /**
     * Validating that a bet can only be made when there is a running betting round.
     */
    @Test (expected = InvalidBettingRoundException.class)
    public void placeBet_WithNoCurrentBettingRound_ShouldThrowInvalidBettingRoundException() {
        // arrange
        Machine machine = new Machine();
        Card card = mock(Card.class);
        Game game = mock(Game.class);
        Cashier cashier = mock(Cashier.class);
        when(cashier.getCardCredit(card)).thenReturn(10.0);
        machine.setCashier(cashier);
        machine.setGame(game);
        machine.connectCard(card);
        // act
        machine.placeBet(card, 1.0);
        machine.placeBet(card, 0.0);
        machine.placeBet(card, 0.0);
        verifyNoMoreInteractions(cashier);
        when(game.getCurrentBettingRound()).thenReturn(null);
        machine.placeBet(card, 1.0);
    }

    /**
     * Validating that a bet can only be made when there is enough credit on the card.
     */
    @Test (expected = InsufficientCreditException.class)
    public void placeBet_WithNotEnoughCreditOnCard_ShouldThrowInsufficientCreditException() {
        // arrange
        Machine machine = new Machine();
        Card card = mock(Card.class);
        Game game = mock(Game.class);
        BettingRound bettingRound = mock(BettingRound.class);
        when(game.getCurrentBettingRound()).thenReturn(bettingRound);
        Cashier cashier = mock(Cashier.class);
        when(cashier.getCardCredit(card)).thenReturn(10.0);
        machine.setCashier(cashier);
        machine.setGame(game);
        machine.connectCard(card);
        // act
        machine.placeBet(card, 20.0);
        //
        verify(cashier).getCardCredit(card);
        verifyNoMoreInteractions(cashier);
    }
}