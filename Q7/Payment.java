package _27089.Q7;

import java.time.LocalDate;

public class Payment extends Agreement {
    private double paymentAmount;
    private String paymentDate;

    public Payment() {}

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail, String agreementDate, String terms, double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms);
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) {
        if (paymentAmount <= 0) throw new RealEstateDataException("Payment must be > 0");
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }
}