package _27089.Q3;

import java.time.LocalDate;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department() {}

    public Department(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) {
        if (departmentCode == null || departmentCode.length() < 3)
            throw new EmployeeDataException("Dept Code must be >= 3 chars");

        if (!departmentCode.matches("^[a-zA-Z0-9 ]+$"))
            throw new EmployeeDataException("Dept Code must be alphanumeric");
        this.departmentCode = departmentCode;
    }
}