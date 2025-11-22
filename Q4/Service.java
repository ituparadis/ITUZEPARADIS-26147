package _27089.Q4;

import java.time.LocalDate;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service() {}

    public Service(int id, LocalDate createdDate, LocalDate updatedDate, String hotelName, String address, String phoneNumber, String email, String roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, String bookingDate, String checkInDate, String checkOutDate, String serviceName, double serviceCost) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate);
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public double getServiceCost() { return serviceCost; }
    public void setServiceCost(double serviceCost) {
        if (serviceCost < 0) throw new HotelDataException("Service cost cannot be negative");
        this.serviceCost = serviceCost;
    }
}