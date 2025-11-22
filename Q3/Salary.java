package _27089.Q3;

import java.time.LocalDate;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary() {}

    public Salary(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String managerName, String managerEmail, String phone, String employeeName, int employeeId, String designation, String contactNumber, int totalDays, int presentDays, int leaveDays, double housingAllowance, double transportAllowance, double taxDeduction, double loanDeduction, double basicSalary) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        setBasicSalary(basicSalary);
    }

    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) {
        if (basicSalary <= 0) throw new EmployeeDataException("Basic Salary must be > 0");
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary() {
        return basicSalary + getHousingAllowance() + getTransportAllowance();
    }

    public void setGrossSalary(double grossSalary) { this.grossSalary = grossSalary; }
    public void setNetSalary(double netSalary) { this.netSalary = netSalary; }
}