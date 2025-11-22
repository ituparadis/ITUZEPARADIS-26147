package _27089.Q7;

import java.time.LocalDate;

public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount; // Field requested by prompt

    public Commission() {}

    public Commission(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail, String agreementDate, String terms, double paymentAmount, String paymentDate, double commissionRate, double commissionAmount) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate);
        this.commissionRate = commissionRate;
        this.commissionAmount = commissionAmount;
    }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0) throw new RealEstateDataException("Rate cannot be negative");
        this.commissionRate = commissionRate;
    }

    public double getCommissionAmount() { return commissionAmount; }
    public void setCommissionAmount(double commissionAmount) { this.commissionAmount = commissionAmount; }
}