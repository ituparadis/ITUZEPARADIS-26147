package _27089.Q1;

import java.time.LocalDate;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse() {}

    // The Full Chain Constructor
    public Nurse(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearsOfExperience) {
        super(id, createdDate, updatedDate, hospitalName, address, email, phoneNumber, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone);
        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() { return nurseName; }
    public void setNurseName(String nurseName) { this.nurseName = nurseName; }

    public String getShift() { return shift; }
    public void setShift(String shift) {
        if (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night")) 
            throw new HospitalDataException("Shift must be 'Day' or 'Night'.");
        this.shift = shift;
    }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) {
        if(yearsOfExperience < 0) throw new HospitalDataException("Experience cannot be negative.");
        this.yearsOfExperience = yearsOfExperience;
    }
}