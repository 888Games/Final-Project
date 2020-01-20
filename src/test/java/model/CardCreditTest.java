package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardCreditTest {

    @Test
    public void generatedCode_Always_ShouldPass() {
        // arrange

        // act
        CardCredit cardCredit = new CardCredit(10.0);
        Double credit = cardCredit.getCredit();
        Double initialCredit = cardCredit.getInitialCredit();
        cardCredit.setCredit((credit+initialCredit)/2);

        // assert
    }
}