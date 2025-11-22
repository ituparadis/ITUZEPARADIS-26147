package _27089.Q10;

import java.time.LocalDate;

public class Product extends Category {
    private String productName;
    private String productCode;
    private double price;

    public Product() {}

    public Product(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price) {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) { this.productCode = productCode; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price <= 0) throw new ShoppingDataException("Price must be > 0");
        this.price = price;
    }
}