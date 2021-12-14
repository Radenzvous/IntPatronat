package com.intivepatronat.Ticket.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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



}
