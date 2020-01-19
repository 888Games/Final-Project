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
     * createCard WithPositiveInitialBalance ShouldPass
     */
    @Test
    public void createCard_WithPositiveInitialBalance_ShouldPass() {

    }

    /**
     * createCard WithZeroInitialBalance ShouldPass
     */
    @Test
    public void createCard_WithZeroInitialBalance_ShouldPass() {

    }

    /**
     * createCard WithNegativeInitialBalance ShouldThrowIllegalArgumentsException
     */
    @Test
    public void createCard_WithNegativeInitialBalance_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * createCard WithNullInitialBalance ShouldThrowIllegalArgumentsException
     */
    @Test
    public void createCard_WithNullInitialBalance_ShouldThrowIllegalArgumentsException() {

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