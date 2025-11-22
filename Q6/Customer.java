package _27089.Q6;

import java.time.LocalDate;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer() {}

    public Customer(int id, LocalDate createdDate, LocalDate updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        if (!email.contains("@")) throw new BankingDataException("Invalid Email format");
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) throw new BankingDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}