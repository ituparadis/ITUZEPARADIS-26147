package _27089.Q6;

import java.time.LocalDate;

public class Deposit extends Transaction {
    private double depositAmount;
    private String depositDate;

    public Deposit() {}

    public Deposit(int id, LocalDate createdDate, LocalDate updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, String depositDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount);
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }

    public double getDepositAmount() { return depositAmount; }
    public void setDepositAmount(double depositAmount) {
        if (depositAmount <= 0) throw new BankingDataException("Deposit amount must be > 0");
        this.depositAmount = depositAmount;
    }

    public String getDepositDate() { return depositDate; }
    public void setDepositDate(String depositDate) { this.depositDate = depositDate; }
}