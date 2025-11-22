package _27089.Q2;

import java.time.LocalDate;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher() {}

    public Teacher(String teacherName, String subject, String teacherEmail, String phone) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public Teacher(int id, LocalDate createdDate, LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone) {
        super(id, createdDate, updatedDate, phoneNumber, email, address, schoolName, departmentName, departmentCode);
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }



    public String getTeacherName() { return teacherName; }
    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) {
        if(subject == null || subject.isEmpty()){
            throw new IllegalArgumentException("Subject cannot be empty");
        }
        this.subject = subject;
    }

    public String getTeacherEmail() { return teacherEmail; }
    public void setTeacherEmail(String teacherEmail) {
        if (!teacherEmail.contains("@")) {
            throw new IllegalArgumentException("Teacher email must contain '@'.");
        }
        this.teacherEmail = teacherEmail;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {
        // Valid phone check
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be 10 digits.");
        }
        this.phone = phone;
    }
}