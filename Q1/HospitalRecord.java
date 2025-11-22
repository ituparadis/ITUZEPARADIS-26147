package _27089.Q1;

// Ensure this is a standalone class, NOT inside Patient
public final class HospitalRecord extends Bill {
    
    public HospitalRecord() {}

    // Convenience Constructor used in Main
    public HospitalRecord(String diagnosis, String treatmentGiven, int treatmentCost, int medicineCost, double doctorFee, int roomCharges) {
        super(diagnosis, treatmentGiven, treatmentCost, medicineCost, doctorFee);
        setRoomCharges(roomCharges);
    }

    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
    }
}