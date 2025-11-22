package _27089.Q4;

import java.time.LocalDate;

public class Booking extends Customer {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking() {}

    public Booking(int id, LocalDate createdDate, LocalDate updatedDate, String hotelName, String address, String phoneNumber, String email, String roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, String bookingDate, String checkInDate, String checkOutDate) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber);
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingDate() { return bookingDate; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }

    public String getCheckInDate() { return checkInDate; }
    public void setCheckInDate(String checkInDate) {
        if (checkInDate == null || checkInDate.isEmpty()) throw new HotelDataException("Check-in date required");
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(String checkOutDate) {
        if (checkOutDate == null || checkOutDate.isEmpty()) throw new HotelDataException("Check-out date required");
        this.checkOutDate = checkOutDate;
    }
}