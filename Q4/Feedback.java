package _27089.Q4;

import java.time.LocalDate;

public class Feedback extends Bill {
    private int rating;
    private String comments;

    public Feedback() {}

    public Feedback(int id, LocalDate createdDate, LocalDate updatedDate, String hotelName, String address, String phoneNumber, String email, String roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, String bookingDate, String checkInDate, String checkOutDate, String serviceName, double serviceCost, String paymentMethod, String paymentDate, double roomCharge, double serviceCharge, int rating, String comments) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge);
        this.rating = rating;
        this.comments = comments;
    }

    public int getRating() { return rating; }
    public void setRating(int rating) {
        if (rating < 1 || rating > 5) throw new HotelDataException("Rating must be between 1 and 5");
        this.rating = rating;
    }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}