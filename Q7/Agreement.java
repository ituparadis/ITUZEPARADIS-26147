package _27089.Q7;

import java.time.LocalDate;

public class Agreement extends Buyer {
    private String agreementDate;
    private String terms;

    public Agreement() {}

    public Agreement(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail, String agreementDate, String terms) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail);
        this.agreementDate = agreementDate;
        this.terms = terms;
    }

    public String getAgreementDate() { return agreementDate; }
    public void setAgreementDate(String agreementDate) {
        if (agreementDate == null || agreementDate.isEmpty()) throw new RealEstateDataException("Agreement Date required");
        this.agreementDate = agreementDate;
    }

    public String getTerms() { return terms; }
    public void setTerms(String terms) {
        if (terms == null || terms.isEmpty()) throw new RealEstateDataException("Terms required");
        this.terms = terms;
    }
}