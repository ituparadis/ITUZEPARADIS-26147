package _27089.Q5;

import java.time.LocalDate;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company() {}

    public Company(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber) {
        super(id, createdDate, updatedDate);
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) throw new RentalDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}