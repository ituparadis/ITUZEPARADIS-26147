package _27089.Q9;

import java.time.LocalDate;

public class Invoice extends Payment {
    private double totalFare;

    public Invoice() {}

    public Invoice(int id, LocalDate createdDate, LocalDate updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee, String paymentDate, String paymentMode, double totalFare) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
        this.totalFare = totalFare;
    }

    public double getTotalFare() { return totalFare; }
    public void setTotalFare(double totalFare) {
        if (totalFare <= 0) throw new AirlineDataException("Total Fare must be > 0");
        this.totalFare = totalFare;
    }
}