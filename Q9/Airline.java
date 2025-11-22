package _27089.Q9;

import java.time.LocalDate;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline() {}

    public Airline(int id, LocalDate createdDate, LocalDate updatedDate, String airlineName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) {
        if (!contactEmail.contains("@")) throw new AirlineDataException("Invalid Email Address");
        this.contactEmail = contactEmail;
    }
}