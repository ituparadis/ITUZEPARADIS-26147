package _27089.Q1;

import java.time.LocalDate;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor() {}

    // The Full Chain Constructor
    public Doctor(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone) {
        super(id, createdDate, updatedDate, hospitalName, address, email, phoneNumber, departmentName, departmentCode);
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.isEmpty()) throw new HospitalDataException("Specialization cannot be empty.");
        this.specialization = specialization;
    }

    public String getDoctorEmail() { return doctorEmail; }
    public void setDoctorEmail(String doctorEmail) {
        if(!doctorEmail.contains("@")) throw new HospitalDataException("Doctor Email invalid.");
        this.doctorEmail = doctorEmail;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {
        if(phone.length() != 10) throw new HospitalDataException("Doctor Phone must be 10 digits.");
        this.phone = phone;
    }
}