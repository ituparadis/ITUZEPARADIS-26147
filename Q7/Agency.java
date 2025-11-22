package _27089.Q7;

import java.time.LocalDate;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency() {}

    public Agency(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber) {
        super(id, createdDate, updatedDate);
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getAgencyName() { return agencyName; }
    public void setAgencyName(String agencyName) { this.agencyName = agencyName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        // Check 1: Length
        if (phoneNumber.length() != 10) {
            throw new RealEstateDataException("Phone must be 10 digits");
        }

        // Check 2: Content (Digits Only)
        // "\\d+" means "one or more digits"
        if (!phoneNumber.matches("\\d+")) {
            throw new RealEstateDataException("Phone must contain only numbers");
        }

        this.phoneNumber = phoneNumber;
    }
}