package _27089.Q8;

import java.time.LocalDate;

public class Record extends Payment {
    private double totalFine;

    public Record() {}

    public Record(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, String borrowDate, String returnDate, double fineAmount, int daysLate, String paymentDate, String paymentMode, double totalFine) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        this.totalFine = totalFine;
    }

    public double getTotalFine() { return totalFine; }
    public void setTotalFine(double totalFine) {
        if (totalFine <= 0) throw new LibraryDataException("Total fine must be > 0");
        this.totalFine = totalFine;
    }
}