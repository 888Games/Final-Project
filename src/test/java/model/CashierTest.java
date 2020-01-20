package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    /**
     * getInstance Always ShouldNotBeNull
     */
    @Test
    public void getInstance_Always_ShouldNotBeNull() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act


        // assert
        assertNotNull(cashier);
    }

    /**
     * getInstance Twice ShouldReturnTheSameInstance
     */
    @Test
    public void getInstance_Twice_ShouldReturnTheSameInstance() {
        // arrange
        Cashier cashier1 = Cashier.getInstance();
        Cashier cashier2 = Cashier.getInstance();

        // act


        // assert
        assertEquals(cashier1, cashier2);
    }


    /**
     * createCard WithPositiveInitialBalance ShouldNotBeNull
     */
    @Test
    public void createCard_WithPositiveInitialBalance_ShouldNotBeNull() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act
        Card card = cashier.createCard(10.0);

        // assert
        assertNotNull(card);
    }

    /**
     * createCard WithZeroInitialBalance ShouldNotBeNull
     */
    @Test
    public void createCard_WithZeroInitialBalance_ShouldNotBeNull() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act
        Card card = cashier.createCard(0.0);

        // assert
        assertNotNull(card);
    }

    /**
     * createCard WithNegativeInitialBalance ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void createCard_WithNegativeInitialBalance_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act
        Card card = cashier.createCard(-10.0);

        // assert

    }

    /**
     * createCard WithNullInitialBalance ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void createCard_WithNullInitialBalance_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act
        Card card = cashier.createCard(null);

        // assert

    }


    /**
     * getCardCredit Always ShouldNotBeNull
     */
    @Test
    public void getCardCredit_ShouldNotBeNull() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double credit = cashier.getCardCredit(card);

        // assert
        assertNotNull(credit);
    }

    /**
     * getCardCredit WithoutUpdatingCredit ShouldReturnInitialCredit
     */
    @Test
    public void getCardCredit_WithoutUpdatingCredit_ShouldReturnInitialCredit() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double credit = cashier.getCardCredit(card);

        // assert
        assertEquals(credit, initialCredit);
    }

    /**
     * getCardCredit AfterUpdatingCredit ShouldUpdateTheReturnValue
     */
    @Test
    public void getCardCredit_AfterUpdatingCredit_ShouldUpdateTheReturnValue() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double creditVariation = 5.0;
        cashier.updateCardCredit(card, creditVariation);
        Double credit = cashier.getCardCredit(card);

        // assert
        assertEquals(initialCredit + creditVariation, credit, 0.0);
    }

    /**
     * getCardCredit WithNullCard ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void getCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act
        Double credit = cashier.getCardCredit(null);

        // assert

    }

    /**
     * getCardCredit WithACardNotCreatedByTheCashier ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void getCardCredit_WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Card card = new Card();

        // act
        Double credit = cashier.getCardCredit(card);

        // assert

    }


    /**
     * cashOutCard Always ShouldPass
     */
    @Test
    public void cashOutCard_ShouldPass() {

    }

    /**
     * cashOutCard WithNullCard ShouldThrowIllegalArgumentsException
     */
    @Test
    public void cashOutCard__WithNullCard_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * cashOutCard WithACardNotCreatedByTheCashier ShouldThrowIllegalArgumentsException
     */
    @Test
    public void cashOutCard__WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException() {

    }


    /**
     * updateCardCredit Always ShouldPass
     */
    @Test
    public void updateCardCredit_ShouldPass() {

    }

    /**
     * updateCardCredit WithNullCard ShouldThrowIllegalArgumentsException
     */
    @Test
    public void updateCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * updateCardCredit WithNullCredit ShouldThrowIllegalArgumentsException
     */
    @Test
    public void updateCardCredit_WithNullCredit_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * updateCardCredit WithPositiveCredit ShouldPass
     */
    @Test
    public void updateCardCredit_WithPositiveCredit_ShouldPass() {

    }

    /**
     * updateCardCredit WithZeroCredit ShouldPass
     */
    @Test
    public void updateCardCredit_WithZeroCredit_ShouldPass() {

    }

    /**
     * updateCardCredit WithNegativeCredit ShouldPass
     */
    @Test
    public void updateCardCredit_WithNegativeCredit_ShouldPass() {

    }

    /**
     * updateCardCredit WithACardThatDoesntHaveEnoughCredit ShouldThrowInsufficientCreditException
     */
    @Test
    public void updateCardCredit_WithACardThatDoesntHaveEnoughCredit_ShouldThrowInsufficientCreditException() {

    }
}