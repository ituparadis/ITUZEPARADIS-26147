package _27089.Q7;

import java.time.LocalDate;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;

    public Seller() {}

    public Seller(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price);
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }

    public String getSellerName() { return sellerName; }
    public void setSellerName(String sellerName) {
        if (sellerName == null || sellerName.isEmpty()) throw new RealEstateDataException("Seller Name required");
        this.sellerName = sellerName;
    }

    public String getContactNumber() { return contactNumber; }




    public void setContactNumber(String contactNumber) {
        // 1. Check if it is null first (to avoid crashes)
        if (contactNumber == null) {
            throw new RealEstateDataException("Contact number cannot be empty");
        }

        // 2. Check Length (Use the variable 'contactNumber', NOT 'this.contactNumber')
        if (contactNumber.length() != 10) {
            throw new RealEstateDataException("Phone must be 10 digits");
        }

        // 3. Check Content (Digits Only)
        if (!contactNumber.matches("\\d+")) {
            throw new RealEstateDataException("Phone must contain only numbers");
        }

        // 4. If all checks pass, SAVE it to the class field
        this.contactNumber = contactNumber;
    }
}