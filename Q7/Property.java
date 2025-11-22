package _27089.Q7;

import java.time.LocalDate;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;

    public Property() {}

    public Property(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }

    public String getPropertyCode() { return propertyCode; }
    public void setPropertyCode(String propertyCode) { this.propertyCode = propertyCode; }

    public String getPropertyType() { return propertyType; }
    public void setPropertyType(String propertyType) { this.propertyType = propertyType; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price <= 0) throw new RealEstateDataException("Price must be > 0");
        this.price = price;
    }
}