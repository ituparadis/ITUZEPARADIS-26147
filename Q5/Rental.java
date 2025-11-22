package _27089.Q5;

import java.time.LocalDate;

public class Rental extends Customer {
    private String rentalDate;
    private String returnDate;
    private int rentalDays;

    public Rental() {}

    public Rental(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber, String rentalDate, String returnDate, int rentalDays) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber);
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    public String getRentalDate() { return rentalDate; }
    public void setRentalDate(String rentalDate) { this.rentalDate = rentalDate; }

    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) { this.returnDate = returnDate; }

    public int getRentalDays() { return rentalDays; }
    public void setRentalDays(int rentalDays) {
        if (rentalDays <= 0) throw new RentalDataException("Rental days must be > 0");
        this.rentalDays = rentalDays;
    }
}