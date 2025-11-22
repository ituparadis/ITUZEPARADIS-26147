package _27089.Q3;

import java.time.LocalDate;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager() {}

    public Manager(int id, LocalDate createdDate, LocalDate updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String managerName, String managerEmail, String phone) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) {
        if (managerName == null || managerName.isEmpty()) throw new EmployeeDataException("Manager Name cannot be empty");
        this.managerName = managerName;
    }

    public String getManagerEmail() { return managerEmail; }
    public void setManagerEmail(String managerEmail) {
        if (!managerEmail.contains("@")) throw new EmployeeDataException("Manager Email invalid");
        this.managerEmail = managerEmail;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {
        if (phone.length() != 10) throw new EmployeeDataException("Manager Phone must be 10 digits");
        this.phone = phone;
    }
}