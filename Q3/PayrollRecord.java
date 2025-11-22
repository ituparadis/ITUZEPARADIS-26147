package _27089.Q3;

public final class PayrollRecord extends Salary {

    public PayrollRecord() {}

//     Net = Basic + Allowances - Deductions
    public double calculateNetSalary() {
        double totalAllowances = getHousingAllowance() + getTransportAllowance();
        double totalDeductions = getTaxDeduction() + getLoanDeduction();
        return getBasicSalary() + totalAllowances - totalDeductions;
    }
}