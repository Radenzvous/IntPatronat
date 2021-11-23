package com.intivepatronat.Ticket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int number;
    private int level;
    private boolean impaired;

    public ParkingSpace(int number, int level, boolean impaired) {
        this.number = number;
        this.level = level;
        this.impaired = impaired;
    }

    public long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getLevel() {
        return level;
    }

    public boolean isImpaired() {
        return impaired;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setImpaired(boolean impaired) {
        this.impaired = impaired;
    }
}
