package Account;

public class InvestmentAccount extends BankAccount {
    private int investment;
    private int period = 3;

    public InvestmentAccount(int balance, String owner, String accountNum, int investment){
        super(balance, owner, accountNum, "Investment");
        this.investment = investment;
    }

    public InvestmentAccount(int balance, String owner, String accountNum, int investment, String type) {
        super(balance, owner, accountNum, type);
        this.investment = investment;
    }

    public void applyInvestment() {
        int appliedInvestment = (int) (balance * (investment / 100.0));
        balance += appliedInvestment;
    }

    @Override
    public void withdraw(int amt) {
        super.withdraw(amt + 1000);
    }

}