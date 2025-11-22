package _27089.Q8;

import java.time.LocalDate;

public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member() {}

    public Member(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN);
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }

    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }

    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) {
        if (memberId <= 0) throw new LibraryDataException("Member ID must be > 0");
        this.memberId = memberId;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) {
        if (contactNumber.length() != 10) throw new LibraryDataException("Contact must be 10 digits");
        if (!contactNumber.matches("\\d+")) throw new LibraryDataException("Contact must contain only numbers");
        this.contactNumber = contactNumber;
    }
}