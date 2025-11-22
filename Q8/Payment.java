package _27089.Q8;

import java.time.LocalDate;

public class Payment extends Fine {
    private String paymentDate;
    private String paymentMode;

    public Payment() {}

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, String borrowDate, String returnDate, double fineAmount, int daysLate, String paymentDate, String paymentMode) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate);
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) {
        if (paymentDate == null || paymentDate.isEmpty()) throw new LibraryDataException("Payment Date required");
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) {
        if (paymentMode == null || paymentMode.isEmpty()) throw new LibraryDataException("Payment Mode required");
        this.paymentMode = paymentMode;
    }
}