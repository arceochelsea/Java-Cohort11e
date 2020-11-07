package BankTools;

import Account.CheckingAccount;
import Account.InvestmentAccount;
import Account.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class DebitCard {
    private CheckingAccount primary;
    private String securityCode;
    private String cardNum;
    private String pin;
    //private Calendar expDate;
    private String cardOwner;
    private List<CheckingAccount> atmCheckingAccounts = new ArrayList<>(); //interface
    private List<SavingAccount> atmSavingAccounts;
    private List<InvestmentAccount> atmInvestmentAccounts = new ArrayList<>();

    public DebitCard(String cardNum, String pin, String securityCode, String cardOwner, CheckingAccount primary){
        //array: atmCheckingAccounts[3]
        //array: atmCheckingAccounts.push() <- does not exist!!!
        //list: atmCheckingAccounts.get(3);
        //list: atmCheckingAccounts.add() == .push()
        this.cardNum = cardNum;
        this.pin = pin;
        this.securityCode = securityCode;
        this.cardOwner = cardOwner;
        this.primary = primary;
        this.atmSavingAccounts = new ArrayList<>();

    }

    public void addCheckingAccount(CheckingAccount account) {
        atmCheckingAccounts.add(account);
    }

    public void addSavingsAccount(SavingAccount account) {
        atmSavingAccounts.add(account);
    }

    public boolean charge(int amt, String pin) {

        if (this.pin.equals(pin) && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

}
