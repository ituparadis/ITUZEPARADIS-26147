package _27089.Q9;

import java.time.LocalDate;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    public Ticket() {}

    public Ticket(int id, LocalDate createdDate, LocalDate updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType);
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price <= 0) throw new AirlineDataException("Price must be > 0");
        this.price = price;
    }
}