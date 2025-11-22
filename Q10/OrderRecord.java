package _27089.Q10;

public final class OrderRecord extends Invoice {

    public OrderRecord() {}

    // Formula: price + shippingCost
    public double calculateTotalAmount() {
        return getPrice() + getShippingCost();
    }
}