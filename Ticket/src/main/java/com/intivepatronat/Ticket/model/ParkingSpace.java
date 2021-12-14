package com.intivepatronat.Ticket.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long number;
    private long level;
    private boolean impaired;

    public ParkingSpace() {
    }

    public ParkingSpace(final long number, final long level, final boolean impaired) {
        this.number = number;
        this.level = level;
        this.impaired = impaired;
    }

}
