package _27089.Q9;

import java.time.LocalDate;

public class Payment extends Baggage {
    private String paymentDate;
    private String paymentMode;

    public Payment() {}

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee, String paymentDate, String paymentMode) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) {
        if (paymentDate == null || paymentDate.isEmpty()) throw new AirlineDataException("Payment Date required");
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) {
        if (paymentMode == null || paymentMode.isEmpty()) throw new AirlineDataException("Payment Mode required");
        this.paymentMode = paymentMode;
    }
}