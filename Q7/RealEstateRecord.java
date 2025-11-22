package _27089.Q7;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord() {}

    // Formula: (price × commissionRate)/100
    public double calculateCommission() {
        return (getPrice() * getCommissionRate()) / 100.0;
    }
}