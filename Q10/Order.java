package _27089.Q10;

import java.time.LocalDate;

public class Order extends Customer {
    private String orderDate;
    private String orderId;

    public Order() {}

    public Order(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, String orderDate, String orderId) {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress);
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) {
        if (orderDate == null || orderDate.isEmpty()) throw new ShoppingDataException("Order Date required");
        this.orderDate = orderDate;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) {
        if (orderId == null || orderId.isEmpty()) throw new ShoppingDataException("Order ID required");
        this.orderId = orderId;
    }
}