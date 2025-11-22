package _27089.Q10;

import java.time.LocalDate;

public class Invoice extends Shipping {
    private double totalAmount;

    public Invoice() {}

    public Invoice(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, String orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost, double totalAmount) {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) {
        if (totalAmount <= 0) throw new ShoppingDataException("Total Amount must be > 0");
        this.totalAmount = totalAmount;
    }
}