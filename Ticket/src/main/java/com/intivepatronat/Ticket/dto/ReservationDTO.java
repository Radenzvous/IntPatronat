package com.intivepatronat.Ticket.dto;

public final class ReservationDTO {
    private String userName;
    private Long parkingSpaceNumber;
    private Long parkingSpaceLevel;


    private ReservationDTO(String userName, Long parkingSpaceNumber, Long parkingSpaceLevel) {
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


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setParkingSpaceNumber(Long parkingSpaceNumber) {
        this.parkingSpaceNumber = parkingSpaceNumber;
    }

    public void setParkingSpaceLevel(Long parkingSpaceLevel) {
        this.parkingSpaceLevel = parkingSpaceLevel;
    }


}

