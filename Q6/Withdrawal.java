package _27089.Q6;

import java.time.LocalDate;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private String withdrawalDate;

    public Withdrawal() {}

    public Withdrawal(int id, LocalDate createdDate, LocalDate updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, String depositDate, double withdrawalAmount, String withdrawalDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate);
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
    public void setWithdrawalAmount(double withdrawalAmount) {
        if (withdrawalAmount <= 0) throw new BankingDataException("Withdrawal amount must be > 0");
        this.withdrawalAmount = withdrawalAmount;
    }

    public String getWithdrawalDate() { return withdrawalDate; }
    public void setWithdrawalDate(String withdrawalDate) { this.withdrawalDate = withdrawalDate; }
}