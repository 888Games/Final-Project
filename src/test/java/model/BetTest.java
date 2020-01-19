package model;

import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import static org.junit.Assert.*;

public class BetTest {

    @Test
    public void createBet_WithNonNullValues_ShouldPass(){
        //arrange
        Card card = mock(Card.class);
        Machine machine = mock(Machine.class);

        //act
        Bet bet = new Bet(2.0,machine,card);

        //assert
        assertTrue(bet != null);

    }


    @Test(expected = IllegalArgumentException.class)
    public void createBet_WithNullValues_ShouldThrowIllegalArgumentsException(){
        //arrange
        Card card = mock(Card.class);

        //act
        Bet bet = new Bet(2.0,null,card);
    }

    @Test
    public void resolveBet_WithZeroOutValue_ShouldPass(){

    }

    @Test
    public void resolveBet_WithPositiveOutValue_ShouldPass(){

    }

    @Test(expected = IllegalArgumentException.class)
    public void resolveBet_WithNegativeOutValue_ShouldThrowIllegalArgumentsException(){

    }

    @Test(expected = IllegalArgumentException.class)
    public void resolveBet_WithNullOutValue_ShouldThrowIllegalArgumentsException(){

    }


}