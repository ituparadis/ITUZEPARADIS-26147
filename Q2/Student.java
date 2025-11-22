package _27089.Q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student() {}

    public Student(String studentName, int rollNumber, String grade, String contactNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public Student(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber) {
        super(id, createdDate, updatedDate, phoneNumber, email, address, schoolName, departmentName, departmentCode, teacherName, subject, teacherEmail, phone);
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }



    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) {
        if (rollNumber <= 0) throw new SchoolDataException("Roll number must be positive.");
        this.rollNumber = rollNumber;
    }

    public String getGrade() { return grade; }
    public void setGrade(String grade) {
        if (grade == null || grade.isEmpty()) throw new SchoolDataException("Grade cannot be empty.");
        this.grade = grade;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) {
        // Basic validation for digits
        if (!contactNumber.matches("\\d+")) throw new SchoolDataException("Contact number must contain digits only.");
        this.contactNumber = contactNumber;
    }
}