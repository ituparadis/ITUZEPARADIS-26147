package _27089.Q4;

import java.time.LocalDate;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    // totalBill is calculated in ReservationRecord Class

    public Bill() {}

    public Bill(int id, LocalDate createdDate, LocalDate updatedDate, String hotelName, String address, String phoneNumber, String email, String roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, String bookingDate, String checkInDate, String checkOutDate, String serviceName, double serviceCost, String paymentMethod, String paymentDate, double roomCharge, double serviceCharge) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate);
        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
    }

    public double getRoomCharge() { return roomCharge; }
    public void setRoomCharge(double roomCharge) {
        if (roomCharge <= 0) throw new HotelDataException("Room charge must be > 0");
        this.roomCharge = roomCharge;
    }

    public double getServiceCharge() { return serviceCharge; }
    public void setServiceCharge(double serviceCharge) {
        if (serviceCharge < 0) throw new HotelDataException("Service charge cannot be negative");
        this.serviceCharge = serviceCharge;
    }
}