package com.intivepatronat.Ticket.model;

import javax.persistence.*;

@Entity

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @OneToOne
    @JoinColumn(name = "parkingSpaceId")
    private ParkingSpace parkingSpace;

    public Reservation() {
    }

    public Reservation(final User user, final ParkingSpace parkingSpace) {
        this.user = user;
        this.parkingSpace = parkingSpace;
    }

    public Reservation(final Long parkingSpaceNumber) {
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }


    public void setParkingSpace(final ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }


    public void setUser(final User user) {
        this.user = user;
    }
}
