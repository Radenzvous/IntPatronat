package com.intivepatronat.Ticket.dto;

public class ReservationDetailsDTO {
    private final String userName;
    private final Long parkingSpaceNumber;
    private final Long parkingSpaceLevel;
    private final Boolean parkingSpaceImpaired;
    private final Long id;

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

}

