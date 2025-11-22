package _27089.Q10;

import java.time.LocalDate;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;

    public Category() {}

    public Category(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email, String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, storeName, address, email);
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getCategoryCode() { return categoryCode; }
    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || categoryCode.length() < 3)
            throw new ShoppingDataException("Category code must be >= 3 chars");
        this.categoryCode = categoryCode;
    }
}