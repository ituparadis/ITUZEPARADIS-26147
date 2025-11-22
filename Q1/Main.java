package _27089.Q1;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   HOSPITAL MANAGEMENT SYSTEM (ID: 27089)");
        System.out.println("==========================================");

        try {
            System.out.println("--- STEP 1: BILLING INITIALIZATION ---");
            System.out.print("Enter Diagnosis: ");
            String diagnosis = sc.nextLine();

            System.out.print("Enter Treatment Given: ");
            String treatmentGiven = sc.nextLine();

            System.out.print("Enter Treatment Cost: ");
            int treatmentCost = sc.nextInt();

            System.out.print("Enter Medicine Cost: ");
            int medicineCost = sc.nextInt();

            System.out.print("Enter Doctor Fee: ");
            double doctorFee = sc.nextDouble();

            System.out.print("Enter Room Charges: ");
            int roomCharges = sc.nextInt();
            sc.nextLine();


            HospitalRecord record = new HospitalRecord(
                    diagnosis, treatmentGiven, treatmentCost,
                    medicineCost, doctorFee, roomCharges
            );


            System.out.println("\n--- STEP 2: PATIENT DETAILS ---");
            System.out.print("Patient Name: ");
            record.setPatientName(sc.nextLine());

            System.out.print("Age: ");
            record.setAge(sc.nextInt());
            sc.nextLine(); 

            System.out.print("Gender (Male/Female/Other): ");
            record.setGender(sc.nextLine());

            System.out.print("Contact Number: ");
            record.setContactNumber(sc.nextLine());

            System.out.println("\n--- STEP 3: STAFF DETAILS ---");
            System.out.print("Doctor Name: ");
            record.setDoctorName(sc.nextLine());

            System.out.print("Specialization: ");
            record.setSpecialization(sc.nextLine());

            System.out.print("Doctor Email: ");
            record.setDoctorEmail(sc.nextLine());

            System.out.print("Doctor Phone: ");
            record.setPhone(sc.nextLine());

            System.out.print("Assign Nurse Name: ");
            record.setNurseName(sc.nextLine());

            System.out.print("Shift (Day/Night): ");
            record.setShift(sc.nextLine());

            System.out.print("Years of Experience: ");
            record.setYearsOfExperience(sc.nextInt());

            record.setAdmissionDate(LocalDate.now());
            record.setHospitalName("Kacyiru Hospital");

            System.out.println("\n==========================================");
            System.out.println("           FINAL HOSPITAL RECORD (ID: 27089)");
            System.out.println("==========================================");
            System.out.println("Hospital: " + record.getHospitalName());
            System.out.println("Date:     " + record.getAdmissionDate());
            System.out.println("------------------------------------------");
            System.out.println("PATIENT:  " + record.getPatientName() + " | Age: " + record.getAge() + " | Sex: " + record.getGender());
            System.out.println("DOCTOR:   " + record.getDoctorName());
            System.out.println("NURSE:    " + record.getNurseName());
            System.out.println("------------------------------------------");
            System.out.println("DIAGNOSIS: " + record.getDiagnosis());
            System.out.println("TREATMENT: " + record.getTreatmentGiven());
            System.out.println("------------------------------------------");
            System.out.println("BILL BREAKDOWN:");
            System.out.println("  Room Charges:   FRW " + record.getRoomCharges());
            System.out.println("  Treatment Cost: FRW " + record.getTreatmentCost());
            System.out.println("  Medicine Cost:  FRW " + record.getMedicineCost());
            System.out.println("  Doctor Fee:     FRW " + record.getDoctorFee());
            System.out.println("==========================================");
            System.out.println("TOTAL PAYABLE:    FRW " + record.generateBill());
            System.out.println("==========================================");

        } catch (HospitalDataException e) {
            System.err.println("DATA ERROR: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("INPUT ERROR: You entered text where a number was expected.");
        } catch (Exception e) {
            System.err.println("UNKNOWN ERROR: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}