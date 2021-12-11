package com.intivepatronat.Ticket.dto;

public class ReservationDTO {
    private final String userName;
    private final Long parkingSpaceNumber;
    private final Long parkingSpaceLevel;


    private ReservationDTO(final String userName, final Long parkingSpaceNumber, final Long parkingSpaceLevel) {
        this.userName = userName;
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.parkingSpaceLevel = parkingSpaceLevel;

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


}

