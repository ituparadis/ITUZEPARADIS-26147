package _27089.Q8;

import java.time.LocalDate;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section() {}

    public Section(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }

    public String getSectionName() { return sectionName; }
    public void setSectionName(String sectionName) { this.sectionName = sectionName; }

    public String getSectionCode() { return sectionCode; }
    public void setSectionCode(String sectionCode) {
        if (sectionCode == null || sectionCode.length() < 3) throw new LibraryDataException("Section Code must be >= 3 chars");
        this.sectionCode = sectionCode;
    }
}