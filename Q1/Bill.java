package _27089.Q1;

import java.time.LocalDate;

public class Bill extends Treatment {
    private double doctorFee;
    private int medicineCost;
    
    // Note: totalBill is calculated, no need for a setter usually, but we will return it.

    public Bill() {}

    // Full Chain
    public Bill(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender, String contactNumber, LocalDate admissionDate, int roomNumber, int roomCharges, String diagnosis, String treatmentGiven, int treatmentCost, double doctorFee, int medicineCost) {
        super(id, createdDate, updatedDate, hospitalName, address, email, phoneNumber, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
    }

    // Overloaded for Main class convenience (partial data)
    public Bill(String diagnosis, String treatmentGiven, int treatmentCost, int medicineCost, double doctorFee) {
        setDiagnosis(diagnosis);
        setTreatmentGiven(treatmentGiven);
        setTreatmentCost(treatmentCost);
        setMedicineCost(medicineCost);
        setDoctorFee(doctorFee);
    }

    public int getMedicineCost() { return medicineCost; }
    public void setMedicineCost(int medicineCost) {
        if (medicineCost <= 0) throw new HospitalDataException("Medicine cost must be positive.");
        this.medicineCost = medicineCost;
    }

    public double getDoctorFee() { return doctorFee; }
    public void setDoctorFee(double doctorFee) {
        if (doctorFee <= 0) throw new HospitalDataException("Doctor fee must be positive.");
        this.doctorFee = doctorFee;
    }
}