package _27089.Q10;

import java.time.LocalDate;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store() {}

    public Store(int id, LocalDate createdDate, LocalDate updatedDate, String storeName, String address, String email) {
        super(id, createdDate, updatedDate);
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }

    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (!email.contains("@")) throw new ShoppingDataException("Invalid Email Format");
        this.email = email;
    }
}