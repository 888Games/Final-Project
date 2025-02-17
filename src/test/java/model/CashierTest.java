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
        assertNotNull("Cashier instance should not null", cashier);
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
        assertEquals("Cashier instances are different", cashier1, cashier2);
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
        assertNotNull("Card should not be null", card);
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
        assertNotNull("Card should not be null", card);
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
        assertNotNull("Credit should not be null", credit);
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
        assertEquals("Credit should stay the same", credit, initialCredit);
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
     * cashOutCard WithoutUpdatingCredit ShouldReturnInitialCredit
     */
    @Test
    public void cashOutCard_WithoutUpdatingCredit_ShouldReturnInitialCredit() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double credit = cashier.cashOutCard(card);

        // assert
        assertEquals(initialCredit, credit, 0.0);
    }

    /**
     * cashOutCard AfterCall CreditShouldBeZero
     */
    @Test
    public void cashOutCard_AfterCall_CreditShouldBeZero() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double outCredit = cashier.cashOutCard(card);
        Double credit = cashier.getCardCredit(card);

        // assert
        assertEquals(0.0, credit, 0.0);
    }

    /**
     * cashOutCard WithNullCard ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void cashOutCard_WithNullCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act
        Double outCredit = cashier.cashOutCard(null);

        // assert

    }

    /**
     * cashOutCard WithACardNotCreatedByTheCashier ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void cashOutCard_WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Card card = new Card();

        // act
        Double outCredit = cashier.cashOutCard(card);

        // assert
    }


    /**
     * updateCardCredit Always ShouldPass
     */
    @Test
    public void updateCardCredit_ShouldPass() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double creditVariation = 5.0;
        cashier.updateCardCredit(card, creditVariation);

        // assert

    }

    /**
     * updateCardCredit WithNullCard ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void updateCardCredit_WithNullCard_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();

        // act
        Double creditVariation = 5.0;
        cashier.updateCardCredit(null, creditVariation);

        // assert

    }

    /**
     * updateCardCredit WithNullCredit ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void updateCardCredit_WithNullCredit_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        cashier.updateCardCredit(card, null);

        // assert

    }

    /**
     * updateCardCredit WithPositiveCredit ShouldReturnSum
     */
    @Test
    public void updateCardCredit_WithPositiveCredit_ShouldReturnSum() {
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
     * updateCardCredit WithZeroCredit ShouldReturnOldCredit
     */
    @Test
    public void updateCardCredit_WithZeroCredit_ShouldOldCredit() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double creditVariation = 0.0;
        cashier.updateCardCredit(card, creditVariation);
        Double credit = cashier.getCardCredit(card);

        // assert
        assertEquals(initialCredit, credit, 0.0);
    }

    /**
     * updateCardCredit WithNegativeCredit ShouldReturnSubtraction
     */
    @Test
    public void updateCardCredit_WithNegativeCredit_ShouldReturnSubtraction() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double creditVariation = -5.0;
        cashier.updateCardCredit(card, creditVariation);
        Double credit = cashier.getCardCredit(card);

        // assert
        assertEquals(initialCredit + creditVariation, credit, 0.0);
    }

    /**
     * updateCardCredit WithACardThatDoesntHaveEnoughCredit ShouldThrowInsufficientCreditException
     */
    @Test (expected = InsufficientCreditException.class)
    public void updateCardCredit_WithACardThatDoesntHaveEnoughCredit_ShouldThrowInsufficientCreditException() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Double initialCredit = 10.0;
        Card card = cashier.createCard(initialCredit);

        // act
        Double creditVariation = -15.0;
        cashier.updateCardCredit(card, creditVariation);

        // assert
    }

    /**
     * updateCardCredit WithACardNotCreatedByTheCashier ShouldThrowIllegalArgumentsException
     */
    @Test (expected = IllegalArgumentException.class)
    public void updateCardCredit_WithACardNotCreatedByTheCashier_ShouldThrowIllegalArgumentsException() {
        // arrange
        Cashier cashier = Cashier.getInstance();
        Card card = new Card();

        // act
        Double creditVariation = 5.0;
        cashier.updateCardCredit(card, creditVariation);

        // assert
    }
}