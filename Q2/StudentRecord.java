package _27089.Q2;

public final class StudentRecord extends Fee {

    public double calculateAverageMarks() {
        if (getMaxMarks() == 0) return 0.0; // Prevent division by zero
        return ((double) getObtainedMarks() / getMaxMarks()) * 100.0;
    }
}