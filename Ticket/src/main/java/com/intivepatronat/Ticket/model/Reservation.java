package com.intivepatronat.Ticket.model;

import javax.persistence.*;

@Entity

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private long parkingSpaceId;

    public Reservation(long userId, long parkingSpaceId) {
        this.userId = userId;
        this.parkingSpaceId = parkingSpaceId;
    }

    public Reservation(Long parkingSpaceNumber) {
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public long getParkingSpaceId() {
        return parkingSpaceId;
    }



    public void setParkingSpaceId(long parkingSpaceId) {
        this.parkingSpaceId = parkingSpaceId;
    }
}
