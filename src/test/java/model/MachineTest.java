package model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void createMachine_Always_ShouldPass() {
        // arrange
        Machine machine = new Machine();
        //assert
        assertTrue(machine != null);
    }
}