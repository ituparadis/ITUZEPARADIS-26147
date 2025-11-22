package _27089.Q8;

import java.time.LocalDate;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library() {}

    public Library(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber) {
        super(id, createdDate, updatedDate);
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryName() { return libraryName; }
    public void setLibraryName(String libraryName) { this.libraryName = libraryName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) throw new LibraryDataException("Phone must be 10 digits");
        if (!phoneNumber.matches("\\d+")) throw new LibraryDataException("Phone must contain only numbers");
        this.phoneNumber = phoneNumber;
    }
}