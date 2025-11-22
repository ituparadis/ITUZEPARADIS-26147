package _27089.Q9;

import java.time.LocalDate;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private String departureTime;

    public Flight() {}

    public Flight(int id, LocalDate createdDate, LocalDate updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.isEmpty()) throw new AirlineDataException("Flight Number required");
        this.flightNumber = flightNumber;
    }

    public String getDestination() { return destination; }
    public void setDestination(String destination) {
        if (destination == null || destination.isEmpty()) throw new AirlineDataException("Destination required");
        this.destination = destination;
    }

    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) {
        if (departureTime == null || departureTime.isEmpty()) throw new AirlineDataException("Departure Time required");
        this.departureTime = departureTime;
    }
}