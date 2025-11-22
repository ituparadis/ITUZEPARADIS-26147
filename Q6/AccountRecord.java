package _27089.Q6;

public final class AccountRecord extends Payment {

    public AccountRecord() {}

    // Formula: (loanAmount(P) × interestRate(I) × duration(T))/100

    public double calculateInterest() {
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100.0;
    }
}