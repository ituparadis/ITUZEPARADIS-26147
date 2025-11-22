package _27089.Q2;

public class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course() {}

    public Course(String courseName, String courseCode, int creditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }


    public Course(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber, String courseName, String courseCode, int creditHours) {
        super(id, createdDate, updatedDate, phoneNumber, email, address, schoolName, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber);
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }


    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) {
        if (courseCode == null || courseCode.length() < 3)
            throw new SchoolDataException("Course code must be at least 3 chars.");
        this.courseCode = courseCode;
    }

    public int getCreditHours() { return creditHours; }
    public void setCreditHours(int creditHours) {
        if (creditHours <= 0) throw new SchoolDataException("Credit hours must be positive.");
        this.creditHours = creditHours;
    }
}