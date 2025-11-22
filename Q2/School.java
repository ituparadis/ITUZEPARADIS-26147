package _27089.Q2;

import java.time.LocalDate;

public class School extends Entity{
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(){

    }

    public School(int id, LocalDate createdDate, LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName) {
        super(id, createdDate, updatedDate);
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.schoolName = schoolName;
    }

    public School(String phoneNumber, String email, String address, String schoolName) {
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setAddress(address);
        setSchoolName(schoolName);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        if(phoneNumber.length()!= 10){
            throw new SchoolDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if(!email.contains("@")){
            throw new SchoolDataException("Email must have @ format");
        }

        this.email = email;
    }
}

