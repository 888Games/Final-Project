package model;

import org.junit.Test;


import static org.mockito.Mockito.mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Test for Bet model
 */
public class BetTest {

    /**
     * validating the Bet constructor. No parameters
     */
    @Test
    public void createBet_WithNonNullValues_ShouldPass(){
        //arrange
        Card card = mock(Card.class);
        Machine machine = mock(Machine.class);

        //act
        Bet bet = new Bet(2.0,machine,card);

        //assert
        assertTrue("Bet has not been created correctly",bet != null);

    }


    /**
     * Validating that Bet with null values are not allowed.
     */
    @Test(expected = IllegalArgumentException.class)
    public void createBet_WithNullValues_ShouldThrowIllegalArgumentsException(){
        //arrange
        Card card = mock(Card.class);

        //act
        Bet bet = new Bet(2.0,null,card);
    }

    /**
     * Validating that Bet can have an outValue of 0.
     */
    @Test
    public void resolveBet_WithZeroOutValue_ShouldPass(){
        Card card = mock(Card.class);
        Machine machine = mock(Machine.class);

        //act
        Bet bet = new Bet(2.0,machine,card);
        bet.resolve(0.0);
    }

    /**
     * Validating that the outValue of a bet can be positive.
     */
    @Test
    public void resolveBet_WithPositiveOutValue_ShouldPass(){
        Card card = mock(Card.class);
        Machine machine = mock(Machine.class);

        //act
        Bet bet = new Bet(2.0,machine,card);
        bet.resolve(5.2);
    }

    /**
     * Validating that the outValue of a Bet must not be negative.
     */
    @Test(expected = IllegalArgumentException.class)
    public void resolveBet_WithNegativeOutValue_ShouldThrowIllegalArgumentsException(){
        //arrange
        Card card = mock(Card.class);
        Machine machine = mock(Machine.class);
        //act
        Bet bet = new Bet(2.0,machine,card);
        bet.resolve(-3.2);
    }

    /**
     * Validating that the outValue of a Bet must not be null.
     */
    @Test(expected = NullPointerException.class)
    public void resolveBet_WithNullOutValue_ShouldThrowIllegalArgumentsException(){
        //arrange
        Card card = mock(Card.class);
        Machine machine = mock(Machine.class);
        //act
        Bet bet = new Bet(2.0,machine,card);
        bet.resolve(null);
    }

    /**
     * Validating that when resolving a Bet, it is updated to the Cashier through the machine.
     */
    @Test
    public void resolveBet_ShouldCallGivePrizeMethodOfMachine(){
        //arrange
        Card card = mock(Card.class);
        Machine machine = mock(Machine.class);

        //act
        Bet bet = new Bet(2.0,machine,card);
        bet.resolve(5.2);

        //assert
        verify(machine).givePrize(bet);
    }
    }


