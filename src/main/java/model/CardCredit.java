package model;

/**
 * Represents the current and the initial card credit
 */
public class CardCredit {
    private Double credit;
    private Double initialCredit;

    /**
     * Sets the initial credit and the credit
     * @param initialCredit first amount of money
     */
    public CardCredit(Double initialCredit) {
        this.credit = initialCredit;
        this.initialCredit = initialCredit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getInitialCredit() {
        return initialCredit;
    }
}
