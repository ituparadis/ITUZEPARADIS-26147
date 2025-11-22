package _27089.Q8;

import java.time.LocalDate;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;

    public Fine() {}

    public Fine(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, String borrowDate, String returnDate, double fineAmount, int daysLate) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate);
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }

    public double getFineAmount() { return fineAmount; }
    public void setFineAmount(double fineAmount) {
        if (fineAmount < 0) throw new LibraryDataException("Fine amount cannot be negative");
        this.fineAmount = fineAmount;
    }

    public int getDaysLate() { return daysLate; }
    public void setDaysLate(int daysLate) {
        if (daysLate < 0) throw new LibraryDataException("Days late cannot be negative");
        this.daysLate = daysLate;
    }
}