package _27089.Q2;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Main {
    // Global Scanner
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   SCHOOL MANAGEMENT SYSTEM (ID: 27089)");
        System.out.println("===========================================");

        // Instantiate the Record
        StudentRecord record = new StudentRecord();

        // Auto-set hidden fields
        record.setId(101);
        record.setCreatedDate(LocalDate.now());

        // 1. School Details
        System.out.println("--- SCHOOL DETAILS ---");
        getString("School Name:      ", record::setSchoolName);
        getString("Address:          ", record::setAddress);
        getString("Phone:            ", record::setPhoneNumber);
        getString("Email:            ", record::setEmail);

        // 2. Department
        System.out.println("\n--- DEPARTMENT ---");
        getString("Dept Name:        ", record::setDepartmentName);
        getString("Dept Code:        ", record::setDepartmentCode);

        // 3. Teacher
        System.out.println("\n--- TEACHER DETAILS ---");
        getString("Teacher Name:     ", record::setTeacherName);
        getString("Subject:          ", record::setSubject);
        getString("Teacher Email:    ", record::setTeacherEmail);
        getString("Teacher Phone:    ", record::setPhone);

        // 4. Student
        System.out.println("\n--- STUDENT DETAILS ---");
        getString("Student Name:     ", record::setStudentName);
        getInt("Roll No:          ", record::setRollNumber);
        getString("Grade:            ", record::setGrade);
        getString("Contact No:       ", record::setContactNumber);

        // 5. Academic (Course & Exam)
        System.out.println("\n--- ACADEMIC DETAILS ---");
        getString("Course Name:      ", record::setCourseName);
        getString("Course Code:      ", record::setCourseCode);
        getInt("Credit Hours:     ", record::setCreditHours);

        getString("Exam Name:        ", record::setExamName);
        getInt("Max Marks:        ", record::setMaxMarks);
        getInt("Obtained Marks:   ", record::setObtainedMarks);
        getString("Exam Date:        ", record::setExamDate);
        getString("Remarks:          ", record::setRemarks);

        // 6. Fee
        System.out.println("\n--- FEE DETAILS ---");
        getInt("Tuition Fee:      ", record::setTuitionFee);
        getInt("Exam Fee:         ", record::setExamFee);

        // FINAL OUTPUT
        System.out.println("\n===========================================");
        System.out.println("         FINAL STUDENT RECORD (ID: 27089)");
        System.out.println("===========================================");
        System.out.println("SCHOOL:  " + record.getSchoolName());
        System.out.println("DEPT:    " + record.getDepartmentName() + " (" + record.getDepartmentCode() + ")");
        System.out.println("TEACHER: " + record.getTeacherName());
        System.out.println("-------------------------------------------");
        System.out.println("STUDENT: " + record.getStudentName() + " | Roll: " + record.getRollNumber());
        System.out.println("COURSE:  " + record.getCourseName());
        System.out.println("EXAM:    " + record.getExamName() + " on " + record.getExamDate());
        System.out.println("-------------------------------------------");
        System.out.printf("RESULT:  %d / %d  (%.2f%%)\n",
                record.getObtainedMarks(), record.getMaxMarks(), record.calculateAverageMarks());
        System.out.println("REMARKS: " + record.getRemarks());
        System.out.println("-------------------------------------------");
        System.out.println("TOTAL FEE: " + record.getTotalFee());
        System.out.println("===========================================");

        sc.close();
    }

    // =============================================================
    //  HELPER METHODS (Retry Logic)
    // =============================================================

    private static void getString(String prompt, Consumer<String> setter) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                setter.accept(input);
                break;
            } catch (RuntimeException e) {
                System.err.println("  [Error]: " + e.getMessage() + ". Try again.");
            }
        }
    }

    private static void getInt(String prompt, IntConsumer setter) {
        while (true) {
            System.out.print(prompt);
            try {
                // Reads the line as text first, then converts to Int.
                // This automatically handles the "Consume Newline" issue!
                int val = Integer.parseInt(sc.nextLine());
                setter.accept(val);
                break;
            } catch (NumberFormatException e) {
                System.err.println("  [Error]: Invalid number. Try again.");
            } catch (RuntimeException e) {
                System.err.println("  [Error]: " + e.getMessage() + ". Try again.");
            }
        }
    }
}