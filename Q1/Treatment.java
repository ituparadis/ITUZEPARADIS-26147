package _27089.Q1;

import java.time.LocalDate;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private int treatmentCost;

    public Treatment() {}

    // The Full Chain Constructor
    public Treatment(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender, String contactNumber, LocalDate admissionDate, int roomNumber, int roomCharges, String diagnosis, String treatmentGiven, int treatmentCost) {
        super(id, createdDate, updatedDate, hospitalName, address, email, phoneNumber, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public String getTreatmentGiven() { return treatmentGiven; }
    public void setTreatmentGiven(String treatmentGiven) { this.treatmentGiven = treatmentGiven; }

    public int getTreatmentCost() { return treatmentCost; }
    public void setTreatmentCost(int treatmentCost) {
        if (treatmentCost <= 0) throw new HospitalDataException("Treatment Cost must be > 0");
        this.treatmentCost = treatmentCost;
    }
}