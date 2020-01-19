package model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void createCard_Always_ShouldPass(){
        Card card = new Card();
    }

    @Test
    public void addBetIdToCard_WithValidValue_ShouldPass(){
        Card card = new Card();

        //act
        card.addBetId("25");
        card.addBetId("23");
        List<String> expect = new ArrayList<>();
        expect.add("25");
        expect.add("23");

        Assert.assertEquals(expect,card.getBetIds());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addBetId_WithNullValue_ShouldThrowIllegalArgumentsException(){
        //arrange
        Card card = new Card();

        //act
        card.addBetId(null);
    }

}