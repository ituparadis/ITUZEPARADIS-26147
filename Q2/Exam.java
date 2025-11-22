package _27089.Q2;

public class Exam extends Course {
    private String examName;
    private int maxMarks;
    private String examDate;

    public Exam() {}
    public Exam(String examName, int maxMarks, String examDate) {
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public Exam(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber, String courseName, String courseCode, int creditHours, String examName, int maxMarks, String examDate) {
        super(id, createdDate, updatedDate, phoneNumber, email, address, schoolName, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }



    public String getExamName() { return examName; }
    public void setExamName(String examName) { this.examName = examName; }

    public int getMaxMarks() { return maxMarks; }
    public void setMaxMarks(int maxMarks) {
        if (maxMarks <= 0) throw new SchoolDataException("Max marks must be > 0.");
        this.maxMarks = maxMarks;
    }

    public String getExamDate() { return examDate; }
    public void setExamDate(String examDate) {
        if(examDate == null || examDate.isEmpty()) throw new SchoolDataException("Date cannot be empty");
        this.examDate = examDate;
    }
}