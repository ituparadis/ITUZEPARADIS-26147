package _27089.Q2;

public class Result extends Exam {
    private int obtainedMarks;
    private String remarks;

    public Result() {}

    public Result(int obtainedMarks, String remarks) {
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public Result(String examName, int maxMarks, String examDate, int obtainedMarks, String remarks) {
        super(examName, maxMarks, examDate);
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public Result(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber, String courseName, String courseCode, int creditHours, String examName, int maxMarks, String examDate, int obtainedMarks, String remarks) {
        super(id, createdDate, updatedDate, phoneNumber, email, address, schoolName, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, examDate);
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }




    public int getObtainedMarks() { return obtainedMarks; }
    public void setObtainedMarks(int obtainedMarks) {
        if (obtainedMarks < 0) throw new SchoolDataException("Obtained marks cannot be negative.");
        this.obtainedMarks = obtainedMarks;
    }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) {
        if(remarks == null || remarks.isEmpty()) throw new SchoolDataException("Remarks cannot be empty");
        this.remarks = remarks;
    }
}