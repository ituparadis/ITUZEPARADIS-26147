package _27089.Q7;

import java.time.LocalDate;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent() {}

    public Agent(int id, LocalDate createdDate, LocalDate updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) { this.agentName = agentName; }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (!email.contains("@")) throw new RealEstateDataException("Invalid Email");
        this.email = email;
    }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
}