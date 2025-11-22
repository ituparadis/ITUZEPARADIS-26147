package _27089.Q4;

import java.time.LocalDate;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room() {}

    public Room(int id, LocalDate createdDate, LocalDate updatedDate, String hotelName, String address, String phoneNumber, String email, String roomNumber, String roomType, double pricePerNight) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) {
        if (pricePerNight <= 0) throw new HotelDataException("Price must be > 0");
        this.pricePerNight = pricePerNight;
    }
}