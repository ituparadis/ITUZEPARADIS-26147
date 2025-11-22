package _27089.Q9;

import java.time.LocalDate;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;

    public Baggage() {}

    public Baggage(int id, LocalDate createdDate, LocalDate updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price);
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }

    public double getBaggageWeight() { return baggageWeight; }
    public void setBaggageWeight(double baggageWeight) {
        if (baggageWeight < 0) throw new AirlineDataException("Weight cannot be negative");
        this.baggageWeight = baggageWeight;
    }

    public double getBaggageFee() { return baggageFee; }
    public void setBaggageFee(double baggageFee) {
        if (baggageFee < 0) throw new AirlineDataException("Baggage Fee cannot be negative");
        this.baggageFee = baggageFee;
    }
}