package com.chelsea;

import Account.BankAccount;
import Account.CheckingAccount;
import Account.SavingAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount myAcct = new BankAccount(100000, "Phil", "1234", "Account");
        CheckingAccount myChecking = new CheckingAccount(20000, "Chelsea", "9876", 10000);
        SavingAccount mySavings = new SavingAccount(100000, "Will", "3333", 5);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings);
        myAcct.deposit(1000);
        myChecking.deposit(2000);
        mySavings.deposit(10000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings);
        myAcct.withdraw(10000);
        myChecking.withdraw(5000);
        mySavings.withdraw(5000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings);

        mySavings.applyInterest();
        System.out.println(mySavings);
        mySavings.applyInterest();
        System.out.println(mySavings);
        mySavings.applyInterest();
        System.out.println(mySavings);
        mySavings.applyInterest();
        System.out.println(mySavings);

        System.out.println((int) 2.9);

//        myAcct.withdraw(100000000);
//        myChecking.withdraw(6000);
//        myChecking.withdraw(4000);
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking.toString());
    }
}
