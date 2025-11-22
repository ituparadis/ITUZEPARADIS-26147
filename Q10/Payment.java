package _27089.Q10;

import java.time.LocalDate;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;

    public Payment() {}

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, String orderDate, String orderId, String paymentMethod, String paymentStatus) {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId);
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.isEmpty()) throw new ShoppingDataException("Payment Method required");
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) {
        if (paymentStatus == null || paymentStatus.isEmpty()) throw new ShoppingDataException("Payment Status required");
        this.paymentStatus = paymentStatus;
    }
}