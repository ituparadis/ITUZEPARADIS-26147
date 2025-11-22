package _27089.Q8;

import java.time.LocalDate;

public class Borrow extends Member {
    private String borrowDate;
    private String returnDate;

    public Borrow() {}

    public Borrow(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, String borrowDate, String returnDate) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber);
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBorrowDate() { return borrowDate; }
    public void setBorrowDate(String borrowDate) {
        if (borrowDate == null || borrowDate.isEmpty()) throw new LibraryDataException("Borrow Date required");
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) {
        if (returnDate == null || returnDate.isEmpty()) throw new LibraryDataException("Return Date required");
        this.returnDate = returnDate;
    }
}