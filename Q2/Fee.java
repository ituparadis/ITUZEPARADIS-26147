package _27089.Q2;

public class Fee extends Result {
    private int tuitionFee;
    private int examFee;


    public Fee() {}

    public Fee(int tuitionFee, int examFee) {
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }

    public Fee(String examName, int maxMarks, String examDate, int obtainedMarks, String remarks, int tuitionFee, int examFee) {
        super(examName, maxMarks, examDate, obtainedMarks, remarks);
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }

    public Fee(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate, String phoneNumber, String email, String address, String schoolName, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber, String courseName, String courseCode, int creditHours, String examName, int maxMarks, String examDate, int obtainedMarks, String remarks, int tuitionFee, int examFee) {
        super(id, createdDate, updatedDate, phoneNumber, email, address, schoolName, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks);
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }


    public int getTuitionFee() { return tuitionFee; }
    public void setTuitionFee(int tuitionFee) {
        if (tuitionFee <= 0) throw new SchoolDataException("Tuition fee must be positive.");
        this.tuitionFee = tuitionFee;
    }

    public int getExamFee() { return examFee; }
    public void setExamFee(int examFee) {
        if (examFee <= 0) throw new SchoolDataException("Exam fee must be positive.");
        this.examFee = examFee;
    }

    public int getTotalFee() {
        return tuitionFee + examFee;
    }
}