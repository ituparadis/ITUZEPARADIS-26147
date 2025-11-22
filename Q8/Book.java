package _27089.Q8;

import java.time.LocalDate;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book() {}

    public Book(int id, LocalDate createdDate, LocalDate updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) {
        if (ISBN == null || ISBN.length() < 10) throw new LibraryDataException("ISBN must be >= 10 chars");
        this.ISBN = ISBN;
    }
}