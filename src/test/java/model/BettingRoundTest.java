package model;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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

    @Test
    public void resolveBets_CallingAuthority_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();
        AuthorityGateway authorityGateway = mock(AuthorityGateway.class);


        //act
        bettingRound.setAuthorityGateway(authorityGateway);
        bettingRound.resolveBets();

        //assert
        verify(authorityGateway).randomInt("");
    }

    @Test
    public void resolveBets_ResolvingSingleBet_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();
        AuthorityGateway authorityGateway = mock(AuthorityGateway.class);
        Bet bet1 = mock(Bet.class);
        Bet bet2 = mock(Bet.class);
        Bet bet3 = mock(Bet.class);
        when(authorityGateway.randomInt("")).thenReturn(2);

        //act
        bettingRound.setAuthorityGateway(authorityGateway);
        when(bet1.getInValue()).thenReturn(5.5);
        when(bet2.getInValue()).thenReturn(2.0);
        when(bet3.getInValue()).thenReturn(2.5);
        bettingRound.placeBet(bet1);
        bettingRound.placeBet(bet2);
        bettingRound.placeBet(bet3);
        bettingRound.resolveBets();

        //assert
        verify(bet1).resolve(0.0);
        verify(bet2).resolve(10.0);
        verify(bet3).resolve(0.0);

    }




}