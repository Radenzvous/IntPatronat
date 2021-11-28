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

    public Reservation(){}
    public Reservation(User user, ParkingSpace parkingSpace) {
        this.user = user;
        this.parkingSpace = parkingSpace;
    }

    public Reservation(Long parkingSpaceNumber) {
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



    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
