package model;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class BettingRoundTest {

    @Test
    public void createBettingRound_Always_ShouldPass(){
        //arrange
        BettingRound bettingRound = new BettingRound();

        //assert
        assertTrue(bettingRound != null);
    }
}