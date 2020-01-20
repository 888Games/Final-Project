package model;
import org.junit.Test;
import org.mockito.Mock;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

    /**
     * Asserts whether Game's constructor creates a new game when a name string is provided.
     */
    @Test
    public void createGame_WithValidName_ShouldPass() {
        //arrange
        String name = "Bingo";
        //act
        Game game = new Game(name);
        //assert
        assertNotNull("Game is successfully created.", game);
    }

    /**
     * Asserts whether Game's constructor throws IllegalArgumentException in case the name string is empty.
     */
    @Test (expected = IllegalArgumentException.class)
    public void createGame_WithEmptyName_ShouldThrowIllegalArgumentsException() {
        //arrange
        String name = "";
        //act
        Game game = new Game(name);
    }

    @Test (expected = IllegalArgumentException.class)
    public void createGame_WithNullName_ShouldThrowIllegalArgumentsException() {
        //arrange
        String name = null;
        //act
        Game game = new Game(name);
    }

    /**
     * Asserts if gameId has been created in the constructor.
     */
    @Test
    public void gameId_AfterCreation_ShouldNotBeNull() {
        //arrange
        String name = "Bingo";
        //act
        Game game = new Game(name);
        //assert
        assertNotEquals(null, game.getGameId());
    }

    /**
     * Asserts if a list for BettingRounds has been created in the constructor and the first BettingRound was added.
     */
    @Test
    public void bettingRounds_AfterCreation_ShouldContainOneItem() {
        //arrange
        String name = "Bingo";
        //act
        Game game = new Game(name);
        //assert
        assertEquals(1, game.getBettingRounds().size());
    }

    /**
     * Asserts if gameLog has been created in the constructor.
     */
    @Test
    public void gameLog_AfterCreation_ShouldNotBeNull() {
        //arrange
        String name = "Bingo";
        //act
        Game game = new Game(name);
        //assert
        assertNotEquals(null, game.getGameLog());
    }

    /**
     * Asserts whether Game returns a BettingRound which hasn't ended yet.
     * Indirect inputs (test stubs)
     */
    @Test
    public void getCurrentBettingRound_IfThereIsAnActiveBettingRound_ShouldReturnThatBettingRound() {
        //arrange
        String name = "Bingo";
        Game game = new Game(name);
        BettingRound br1 = mock(BettingRound.class);
        when(br1.getEndedAt()).thenReturn(ZonedDateTime.of(2020, 01, 01, 0, 0, 0, 0, ZoneId.of("UTC")));
        //act
        game.getBettingRounds().add(br1);
        //assert
        assertEquals(game.getCurrentBettingRound(), game.getBettingRounds().get(0));
    }

    /**
     * Asserts whether Game returns null if all existing BettingRounds ended.
     * Indirect inputs (test stubs)
     */
    @Test
    public void getCurrentBettingRound_IfThereIsNoActiveBettingRound_ShouldReturnNull() {
        //arrange
        String name = "Bingo";
        Game game = new Game(name);
        BettingRound br1 = mock(BettingRound.class);
        BettingRound br2 = mock(BettingRound.class);
        game.getBettingRounds().get(0).setEndedAt(ZonedDateTime.of(2020, 01, 01, 0, 0, 0, 0, ZoneId.of("UTC")));
        when(br1.getEndedAt()).thenReturn(ZonedDateTime.of(2020, 01, 01, 0, 0, 0, 0, ZoneId.of("UTC")));
        when(br2.getEndedAt()).thenReturn(ZonedDateTime.of(2020, 01, 11, 0, 0, 0, 0, ZoneId.of("UTC")));
        //act
        game.getBettingRounds().add(br1);
        game.getBettingRounds().add(br2);
        //assert
        assertNull(game.getCurrentBettingRound());
    }


}