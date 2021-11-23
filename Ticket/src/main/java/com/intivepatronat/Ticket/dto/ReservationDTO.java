package com.intivepatronat.Ticket.dto;

public class ReservationDTO {
    private String userName;
    private Integer parkingSpaceNumber;
    private Integer parkingSpaceLevel;
    private Boolean parkingSpaceImpaired;

    public ReservationDTO(String userName, Integer parkingSpaceNumber, Integer parkingSpaceLevel, Boolean parkingSpaceImpaired) {
        this.userName = userName;
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.parkingSpaceLevel = parkingSpaceLevel;
        this.parkingSpaceImpaired = parkingSpaceImpaired;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getParkingSpaceNumber() {
        return parkingSpaceNumber;
    }

    public Integer getParkingSpaceLevel() {
        return parkingSpaceLevel;
    }

    public Boolean getParkingSpaceImpaired() {
        return parkingSpaceImpaired;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setParkingSpaceNumber(Integer parkingSpaceNumber) {
        this.parkingSpaceNumber = parkingSpaceNumber;
    }

    public void setParkingSpaceLevel(Integer parkingSpaceLevel) {
        this.parkingSpaceLevel = parkingSpaceLevel;
    }

    public void setParkingSpaceImpaired(Boolean parkingSpaceImpaired) {
        this.parkingSpaceImpaired = parkingSpaceImpaired;
    }
}

