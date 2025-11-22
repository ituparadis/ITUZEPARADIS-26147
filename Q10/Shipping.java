package _27089.Q10;

import java.time.LocalDate;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping() {}

    public Shipping(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, String orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost) {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus);
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) {
        if (shippingAddress == null || shippingAddress.isEmpty()) throw new ShoppingDataException("Shipping Address required");
        this.shippingAddress = shippingAddress;
    }

    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) {
        if (shippingCost < 0) throw new ShoppingDataException("Shipping Cost cannot be negative");
        this.shippingCost = shippingCost;
    }
}