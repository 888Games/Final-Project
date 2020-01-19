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
     * getCardCredit Always ShouldPass
     */
    @Test
    public void getCardCredit_ShouldPass() {

    }

    /**
     * getCardCredit AfterUpdatingCredit ShouldUpdateTheReturnValue
     */
    @Test
    public void getCardCredit_AfterUpdatingCredit_ShouldUpdateTheReturnValue() {

    }

    /**
     * getCardCredit WithNullCard ShouldThrowIllegalArgumentsException
     */
    @Test
    public void getCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * getCardCredit WithACardNotCreatedByTheCashier ShouldThrowIllegalArgumentsException
     */
    @Test
    public void getCardCredit__WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException() {

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