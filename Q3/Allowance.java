package _27089.Q3;

import java.time.LocalDate;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;

    public Allowance() {}

    public Allowance(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String managerName, String managerEmail, String phone, String employeeName, int employeeId, String designation, String contactNumber, int totalDays, int presentDays, int leaveDays, double housingAllowance, double transportAllowance) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays);
        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) {
        if (housingAllowance < 0) throw new EmployeeDataException("Housing Allowance must be >= 0");
        this.housingAllowance = housingAllowance;
    }

    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) {
        if (transportAllowance < 0) throw new EmployeeDataException("Transport Allowance must be >= 0");
        this.transportAllowance = transportAllowance;
    }
}
