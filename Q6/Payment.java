package _27089.Q6;

import java.time.LocalDate;

public class Payment extends Loan {
    private double paymentAmount;
    private String paymentDate;

    public Payment() {}

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, String depositDate, double withdrawalAmount, String withdrawalDate, double loanAmount, double interestRate, int duration, double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) {
        if (paymentAmount <= 0) throw new BankingDataException("Payment amount must be > 0");
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }
}