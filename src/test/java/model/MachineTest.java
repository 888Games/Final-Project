package model;

import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class MachineTest {

    @Test
    public void createMachine_Always_ShouldPass() {
        // arrange
        Machine machine = new Machine();
        //assert
        assertTrue(machine != null);
    }

    @Test
    public void connectCard_ShouldPass() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.connectCard(card);
    }

    @Test
    public void connectMultipleCards_ShouldPass() {
        // arrange
        Card card1 = mock(Card.class);
        Card card2 = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.connectCard(card1);
        machine.connectCard(card2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void connectCard_WithNullCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Machine machine = new Machine();
        // act
        machine.connectCard(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void connectCard_WithAlreadyConnectedCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.connectCard(card);
        machine.connectCard(card);
    }

    @Test
    public void disconnectCard_ShouldPass() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        machine.connectCard(card);
        // act
        machine.disconnectCard(card);
    }

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
    }

    @Test (expected = IllegalArgumentException.class)
    public void disconnectCard_WithNullCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        machine.connectCard(card);
        // act
        machine.disconnectCard(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void disconnectCard_WithNotConnectedCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Card card = mock(Card.class);
        Machine machine = new Machine();
        // act
        machine.disconnectCard(card);
    }
}