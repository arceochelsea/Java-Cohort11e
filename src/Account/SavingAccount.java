package Account;

public class SavingAccount extends BankAccount {
    private int interest;

    public SavingAccount(int balance, String owner, String accountNum, int interest) {
        super(balance, owner, accountNum, "Savings");
        this.interest = interest;
    }

    public void applyInterest() {
//        int amount = (int) (balance * (interest / 100.0));
        balance += (int) (balance * (interest / 100.0));
//        balance += (balance * interest) / 100;
    }
}
