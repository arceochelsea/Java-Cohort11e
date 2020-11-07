package Account;

// extends Investment
// has a private field string of timePeriod that uses "M" "Q"
// can't be withdrawn from.

public class CDInvestment extends InvestmentAccount{
    private int timeFrame;
    public CDInvestment(int balance, String owner, String accountNum, int timeFrame ) {
        super(balance, owner, accountNum, 5, "Certificate of Deposit");
        this.timeFrame = timeFrame;
    }
    // TODO: getTimeFrame;

    public void checkIfInterest(int time) {
        if (time <= timeFrame && balance > 0) {
            applyInvestment();
        }
    }

    @Override
    public void withdraw(int amt) {
        return;
    }

}