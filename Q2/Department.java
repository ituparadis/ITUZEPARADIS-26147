package _27089.Q2;

import java.time.LocalDate;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department() {
    }

    public Department(String departmentName, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public Department(int id, LocalDate createdDate, LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName, String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, phoneNumber, email, address, schoolName);
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {

        if (departmentCode == null || departmentCode.length() < 3) {
            throw new IllegalArgumentException("Department code must be at least 3 characters long.");
        }

        if (!departmentCode.matches("^[a-zA-Z0-9 ]+$")) {
            throw new IllegalArgumentException("Department code must be alphanumeric (letters, numbers, and spaces allowed).");
        }

        this.departmentCode = departmentCode;
    }
}
