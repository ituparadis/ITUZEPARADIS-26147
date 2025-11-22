package _27089.Q1;

import java.time.LocalDate;

public class Admission extends Patient {
    private _27089.Q1.LocalDate admissionDate;
    private int roomNumber;
    private int roomCharges;

    public Admission() {}

    // The Full Chain Constructor
    public Admission(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender, String contactNumber, LocalDate admissionDate, int roomNumber, int roomCharges) {
        super(id, createdDate, updatedDate, hospitalName, address, email, phoneNumber, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public LocalDate getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(LocalDate admissionDate) {
        if(admissionDate == null) throw new HospitalDataException("Admission date cannot be null");
        this.admissionDate = admissionDate;
    }

    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }

    public int getRoomCharges() { return roomCharges; }
    public void setRoomCharges(int roomCharges) {
        if(roomCharges <= 0) throw new HospitalDataException("Room charges must be > 0");
        this.roomCharges = roomCharges;
    }
}