package model;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Tests for BettingRound model.
 */
public class BettingRoundTest {

    /**
     * validating the bettingRound constructor. No parameters.
     */
    @Test
    public void createBettingRound_Always_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();

        //assert
        assertTrue(bettingRound != null);
    }

    /**
     * Validating that a bet can be placed on a bettingRound if it has not been resolved yet.
     */
    @Test
    public void placeBet_WithNotResolvedBet_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();
        Bet bet = mock(Bet.class);
        when(bet.isResolved()).thenReturn(Boolean.FALSE);

        //act
        bettingRound.placeBet(bet);

    }

    /**
     * Validating that placing a bet which has already been resolved on a bettingRound is not allowed.
     */
    @Test(expected = IllegalArgumentException.class)
    public void placeBet_WithResolvedBet_ShouldThrowIllegalArgumentsException(){
        //arrange
        BettingRound bettingRound = new BettingRound();
        Bet bet = mock(Bet.class);
        when(bet.isResolved()).thenReturn(Boolean.TRUE);

        //act
        bettingRound.placeBet(bet);
    }

    /**
     * Validating that the authority is called when resolving bets of a BettingRound.
     */
    @Test
    public void resolveBets_CallingAuthority_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();
        AuthorityGateway authorityGateway = mock(AuthorityGateway.class);
        when(authorityGateway.randomInt("")).thenReturn(1);
        Bet bet1 = mock(Bet.class);
        Bet bet2 = mock(Bet.class);

        //act
        bettingRound.setAuthorityGateway(authorityGateway);
        bettingRound.placeBet(bet1);
        bettingRound.placeBet(bet2);
        bettingRound.resolveBets();

        //assert
        verify(authorityGateway).randomInt("");
    }

    /**
     * Validating that when resolving bets form a betting round, results of those bets are updated in consequence.
     */
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