package _27089.Q7;

import java.time.LocalDate;

public class Buyer extends Seller {
    private String buyerName;
    private String buyerEmail; // renamed from 'email' to avoid conflict with Agent's email

    public Buyer() {}

    public Buyer(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber);
        this.buyerName = buyerName;
        this.buyerEmail = buyerEmail;
    }

    public String getBuyerName() { return buyerName; }
    public void setBuyerName(String buyerName) { this.buyerName = buyerName; }

    public String getBuyerEmail() { return buyerEmail; }
    public void setBuyerEmail(String buyerEmail) {
        if (!buyerEmail.contains("@")) throw new RealEstateDataException("Invalid Buyer Email");
        this.buyerEmail = buyerEmail;
    }
}