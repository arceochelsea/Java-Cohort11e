package Account;

// extends Investment
// has a private field string of timePeriod that uses "M" "Q"
// can't be withdrawn from.

public class CDInvestment extends InvestmentAccount {

    private String timePeriod;

    public CDInvestment(int balance, String owner, String accountNum, String timePeriod) {
        super(balance, owner, accountNum, timePeriod);
        this.timePeriod = timePeriod;
    }

}