package _27089.Q3;

import java.time.LocalDate;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction() {}

    public Deduction(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String managerName, String managerEmail, String phone, String employeeName, int employeeId, String designation, String contactNumber, int totalDays, int presentDays, int leaveDays, double housingAllowance, double transportAllowance, double taxDeduction, double loanDeduction) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance);
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }

    public double getTaxDeduction() { return taxDeduction; }
    public void setTaxDeduction(double taxDeduction) {
        if (taxDeduction < 0) throw new EmployeeDataException("Tax Deduction must be >= 0");
        this.taxDeduction = taxDeduction;
    }

    public double getLoanDeduction() { return loanDeduction; }
    public void setLoanDeduction(double loanDeduction) {
        if (loanDeduction < 0) throw new EmployeeDataException("Loan Deduction must be >= 0");
        this.loanDeduction = loanDeduction;
    }
}