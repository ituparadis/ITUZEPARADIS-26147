package _27089.Q1;

import java.time.LocalDate;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient() {}

    // The Full Chain Constructor
    public Patient(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender, String contactNumber) {
        super(id, createdDate, updatedDate, hospitalName, address, email, phoneNumber, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience);
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age <= 0) throw new HospitalDataException("Age must be greater than 0");
        this.age = age;
    }

    public String getGender() { return gender; }
    public void setGender(String gender) {
        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other")) 
            throw new HospitalDataException("Gender must be Male/Female/Other");
        this.gender = gender;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) {
        if(contactNumber.length() != 10) throw new HospitalDataException("Patient contact must be 10 digits");
        this.contactNumber = contactNumber;
    }
}