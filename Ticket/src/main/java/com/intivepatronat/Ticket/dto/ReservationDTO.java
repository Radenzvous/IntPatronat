package com.intivepatronat.Ticket.dto;

public class ReservationDTO {
    private String userName;
    private Long parkingSpaceNumber;
    private Long parkingSpaceLevel;
    private Boolean parkingSpaceImpaired;

    public ReservationDTO(String userName, Long parkingSpaceNumber, Long parkingSpaceLevel, Boolean parkingSpaceImpaired) {
        this.userName = userName;
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.parkingSpaceLevel = parkingSpaceLevel;
        this.parkingSpaceImpaired = parkingSpaceImpaired;
    }

    public String getUserName() {
        return userName;
    }

    public Long getParkingSpaceNumber() {
        return parkingSpaceNumber;
    }

    public Long getParkingSpaceLevel() {
        return parkingSpaceLevel;
    }

    public Boolean getParkingSpaceImpaired() {
        return parkingSpaceImpaired;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setParkingSpaceNumber(Long parkingSpaceNumber) {
        this.parkingSpaceNumber = parkingSpaceNumber;
    }

    public void setParkingSpaceLevel(Long parkingSpaceLevel) {
        this.parkingSpaceLevel = parkingSpaceLevel;
    }

    public void setParkingSpaceImpaired(Boolean parkingSpaceImpaired) {
        this.parkingSpaceImpaired = parkingSpaceImpaired;
    }
}

