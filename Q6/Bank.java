package _27089.Q6;

import java.time.LocalDate;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank() {}

    public Bank(int id, LocalDate createdDate, LocalDate updatedDate, String bankName, String branchCode, String address) {
        super(id, createdDate, updatedDate);
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }

    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) {
        if (branchCode == null || branchCode.length() < 3)
            throw new BankingDataException("Branch code must be >= 3 chars");
        this.branchCode = branchCode;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}