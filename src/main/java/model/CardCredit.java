package model;

public class CardCredit {
    private Double credit;
    private Double initialCredit;

    public CardCredit(Double initialCredit) {
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
