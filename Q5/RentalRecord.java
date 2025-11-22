package _27089.Q5;

public final class RentalRecord extends Invoice {

    public RentalRecord() {}

    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
}