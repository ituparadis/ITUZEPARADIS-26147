package _27089.Q6;

import java.time.LocalDate;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account() {}

    public Account(int id, LocalDate createdDate, LocalDate updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance) {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) {
        if (balance < 0) throw new BankingDataException("Balance cannot be negative");
        this.balance = balance;
    }
}