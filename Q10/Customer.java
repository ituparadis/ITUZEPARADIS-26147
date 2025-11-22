package _27089.Q10;

import java.time.LocalDate;

public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    // 'address' field exists in Store parent, but Customer specifically has one too.
    // We will use a separate field name to avoid shadowing confusion, or reuse 'address' if logic permits.
    // Prompt says "Customer... address", let's call it customerAddress.
    private String customerAddress;

    public Customer() {}

    public Customer(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress) {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price);
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.isEmpty()) throw new ShoppingDataException("Customer Name required");
        this.customerName = customerName;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || contactNumber.isEmpty()) throw new ShoppingDataException("Contact required");
        this.contactNumber = contactNumber;
    }

    public String getCustomerAddress() { return customerAddress; }
    public void setCustomerAddress(String customerAddress) {
        if (customerAddress == null || customerAddress.isEmpty()) throw new ShoppingDataException("Customer Address required");
        this.customerAddress = customerAddress;
    }
}