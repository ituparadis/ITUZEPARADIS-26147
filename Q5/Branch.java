package _27089.Q5;

import java.time.LocalDate;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch() {}

    public Branch(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        this.branchName = branchName;
        this.locationCode = locationCode;
    }

    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }

    public String getLocationCode() { return locationCode; }
    public void setLocationCode(String locationCode) {
        if (locationCode == null || locationCode.length() < 3)
            throw new RentalDataException("Location Code must be >= 3 chars");
        this.locationCode = locationCode;
    }
}