package _27089.Q1;

import java.time.LocalDate;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String email;
    private String phoneNumber;

    public Hospital() {}

    // The Full Chain Constructor
    public Hospital(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber) {
        super(id, createdDate, updatedDate);
        this.hospitalName = hospitalName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) throws HospitalDataException {
        if(!email.contains("@")) throw new HospitalDataException("Email must have @ format");
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws HospitalDataException {
        if(phoneNumber.length() != 10) throw new HospitalDataException("Phone number must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}