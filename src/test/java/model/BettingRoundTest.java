package model;

import org.junit.Test;
import static org.mockito.Mockito.mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class BettingRoundTest {

    @Test
    public void createBettingRound_Always_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();

        //assert
        assertTrue(bettingRound != null);
    }

    @Test
    public void placeBet_WithNotResolvedBet_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();
        Bet bet = mock(Bet.class);
        when(bet.isResolved()).thenReturn(Boolean.FALSE);

        //act
        bettingRound.placeBet(bet);

    }

    @Test(expected = IllegalArgumentException.class)
    public void placeBet_WithResolvedBet_ShouldThrowIllegalArgumentsException(){
        //arrange
        BettingRound bettingRound = new BettingRound();
        Bet bet = mock(Bet.class);
        when(bet.isResolved()).thenReturn(Boolean.TRUE);

        //act
        bettingRound.placeBet(bet);
    }


}