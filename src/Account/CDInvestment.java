package Account;

// extends Investment yup
// has a private field string of timePeriod that uses "M" "Q" sorta?
// can't be withdrawn from. yup

public class CDInvestment extends InvestmentAccount {

    private String timePeriod;

    public CDInvestment(int balance, String owner, String accountNum, String timePeriod) {
        super(balance, owner, accountNum, investment);
        this.timePeriod = timePeriod;
    }

    public void withdraw() {
        throw new UnsupportedOperationException();
        //this will override the specific method and disable the operation!
        //creating another parent class is also an option.
        //one that would allow withdraws & perhaps another that doesnt allow withdraws
    }

}