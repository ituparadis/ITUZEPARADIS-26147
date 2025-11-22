package _27089.Q9;

import java.time.LocalDate;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType;

    public Seat() {}

    public Seat(int id, LocalDate createdDate, LocalDate updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public String getSeatType() { return seatType; }
    public void setSeatType(String seatType) {

        if (!seatType.equalsIgnoreCase("Economy") && !seatType.equalsIgnoreCase("Business")) {
            throw new AirlineDataException("Seat Type must be 'Economy' or 'Business'");
        }
        this.seatType = seatType;
    }
}