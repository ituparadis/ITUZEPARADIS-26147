package _27089.Q3;

import java.time.LocalDate;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance() {}

    public Attendance(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String managerName, String managerEmail, String phone, String employeeName, int employeeId, String designation, String contactNumber, int totalDays, int presentDays, int leaveDays) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber);
        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    public int getTotalDays() { return totalDays; }
    public void setTotalDays(int totalDays) {
        if (totalDays < 0) throw new EmployeeDataException("Total days must be >= 0");
        this.totalDays = totalDays;
    }

    public int getPresentDays() { return presentDays; }
    public void setPresentDays(int presentDays) {
        if (presentDays < 0) throw new EmployeeDataException("Present days must be >= 0");
        // Validation Logic: Can't be present more days than exist
        if (presentDays > getTotalDays() && getTotalDays() > 0)
            throw new EmployeeDataException("Present days cannot exceed Total days");
        this.presentDays = presentDays;
    }

    public int getLeaveDays() { return leaveDays; }
    public void setLeaveDays(int leaveDays) {
        if (leaveDays < 0) throw new EmployeeDataException("Leave days must be >= 0");
        this.leaveDays = leaveDays;
    }
}
