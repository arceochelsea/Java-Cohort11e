package Account;

public class InvestmentAccount extends BankAccount {
    private int investment;
    private int period = 3;

    public InvestmentAccount(int balance, String owner, String accountNum, int investment){
        super(balance, owner, accountNum, "Investment");
        this.investment = investment;
    }

    public void applyInvestment() {
        int appliedInvestment = balance * (investment / 100);
    }

}
