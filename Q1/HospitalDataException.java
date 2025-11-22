package _27089.Q1;


// CHANGE: extends RuntimeException (instead of Exception)
public class HospitalDataException extends RuntimeException {
    public HospitalDataException(String message) {
        super(message);
    }
}