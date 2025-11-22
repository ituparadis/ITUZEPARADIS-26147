package _27089.Q1;

import java.time.LocalDate;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department() {}

    // The Full Chain Constructor
    public Department(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String email, String phoneNumber, String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, hospitalName, address, email, phoneNumber);
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) {
        if(departmentCode == null || departmentCode.length() < 3) 
            throw new HospitalDataException("Code must be >= 3 characters");
        // Alphanumeric check
        if (!departmentCode.matches("^[a-zA-Z0-9 ]+$")) 
            throw new HospitalDataException("Code must be alphanumeric");
        this.departmentCode = departmentCode;
    }
}