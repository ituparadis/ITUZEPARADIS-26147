package _27089.Q5;

import java.time.LocalDate;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;

    public Charge() {}

    public Charge(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber, String rentalDate, String returnDate, int rentalDays, double rentalCharge, double penaltyCharge) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays);
        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }

    public double getRentalCharge() { return rentalCharge; }
    public void setRentalCharge(double rentalCharge) {
        if (rentalCharge < 0) throw new RentalDataException("Rental charge cannot be negative");
        this.rentalCharge = rentalCharge;
    }

    public double getPenaltyCharge() { return penaltyCharge; }
    public void setPenaltyCharge(double penaltyCharge) {
        if (penaltyCharge < 0) throw new RentalDataException("Penalty charge cannot be negative");
        this.penaltyCharge = penaltyCharge;
    }
}