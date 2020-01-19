package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    /**
     * getInstance_Always_ShouldPass
     */
   @Test
    public void getInstance_Always_ShouldPass() {

    }

    /**
     * getInstance_Twice_ShouldReturnTheSameInstance
     */
    @Test
    public void getInstance_Twice_ShouldReturnTheSameInstance() {

    }


    /**
     * createCard_WithPositiveInitialBalance_ShouldPass
     */
    @Test
    public void createCard_WithPositiveInitialBalance_ShouldPass() {

    }

    /**
     * createCard_WithZeroInitialBalance_ShouldPass
     */
    @Test
    public void createCard_WithZeroInitialBalance_ShouldPass() {

    }

    /**
     * createCard_WithNegativeInitialBalance_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void createCard_WithNegativeInitialBalance_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * createCard_WithNullInitialBalance_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void createCard_WithNullInitialBalance_ShouldThrowIllegalArgumentsException() {

    }


    /**
     * getCardCredit_ShouldPass
     */
    @Test
    public void getCardCredit_ShouldPass() {

    }

    /**
     * getCardCredit_AfterUpdatingCredit_ShouldUpdateTheReturnValue
     */
    @Test
    public void getCardCredit_AfterUpdatingCredit_ShouldUpdateTheReturnValue() {

    }

    /**
     * getCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void getCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * getCardCredit__WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void getCardCredit__WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException() {

    }


    /**
     * cashOutCard_ShouldPass
     */
    @Test
    public void cashOutCard_ShouldPass() {

    }

    /**
     * cashOutCard__WithNullCard_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void cashOutCard__WithNullCard_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * cashOutCard__WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void cashOutCard__WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException() {

    }


    /**
     * updateCardCredit_ShouldPass
     */
    @Test
    public void updateCardCredit_ShouldPass() {

    }

    /**
     * updateCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void updateCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * updateCardCredit_WithNullCredit_ShouldThrowIllegalArgumentsException
     */
    @Test
    public void updateCardCredit_WithNullCredit_ShouldThrowIllegalArgumentsException() {

    }

    /**
     * updateCardCredit_WithPositiveCredit_ShouldPass
     */
    @Test
    public void updateCardCredit_WithPositiveCredit_ShouldPass() {

    }

    /**
     * updateCardCredit_WithZeroCredit_ShouldPass
     */
    @Test
    public void updateCardCredit_WithZeroCredit_ShouldPass() {

    }

    /**
     * updateCardCredit_WithNegativeCredit_ShouldPass
     */
    @Test
    public void updateCardCredit_WithNegativeCredit_ShouldPass() {

    }

    /**
     * updateCardCredit_WithACardThatDoesntHaveEnoughCredit_ShouldThrowInsufficientCreditException
     */
    @Test
    public void updateCardCredit_WithACardThatDoesntHaveEnoughCredit_ShouldThrowInsufficientCreditException() {

    }
}