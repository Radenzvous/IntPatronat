package com.intivepatronat.Ticket.dto;

public final class ReservationDetailsDTO {
    private String userName;
    private Long parkingSpaceNumber;
    private Long parkingSpaceLevel;
    private Boolean parkingSpaceImpaired;
    private Long id;

    public ReservationDetailsDTO(final String userName, final Long parkingSpaceNumber, final Long parkingSpaceLevel, final Boolean parkingSpaceImpaired, Long id) {
        this.userName = userName;
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.parkingSpaceLevel = parkingSpaceLevel;
        this.parkingSpaceImpaired = parkingSpaceImpaired;
        this.id = id;
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

    public Long getid() {
        return id;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public void setParkingSpaceNumber(final Long parkingSpaceNumber) {
        this.parkingSpaceNumber = parkingSpaceNumber;
    }

    public void setParkingSpaceLevel(final Long parkingSpaceLevel) {
        this.parkingSpaceLevel = parkingSpaceLevel;
    }

    public void setParkingSpaceImpaired(final Boolean parkingSpaceImpaired) {
        this.parkingSpaceImpaired = parkingSpaceImpaired;
    }
}

