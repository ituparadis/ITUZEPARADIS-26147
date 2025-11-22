package _27089.Q4;

import java.time.LocalDate;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel() {}


    public Hotel(int id, LocalDate createdDate, LocalDate updatedDate, String hotelName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) throw new HotelDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (!email.contains("@")) throw new HotelDataException("Invalid Email");
        this.email = email;
    }
}