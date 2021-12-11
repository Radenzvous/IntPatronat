package com.intivepatronat.Ticket.model;

import javax.persistence.*;

@Entity
@Table
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

    public long getId() {
        return id;
    }

    public long getNumber() {
        return number;
    }

    public long getLevel() {
        return level;
    }

    public boolean isImpaired() {
        return impaired;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public void setLevel(final int level) {
        this.level = level;
    }

    public void setImpaired(final boolean impaired) {
        this.impaired = impaired;
    }
}
