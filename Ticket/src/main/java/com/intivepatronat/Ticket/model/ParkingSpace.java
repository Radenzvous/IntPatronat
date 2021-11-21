package com.intivepatronat.Ticket.model;

import javax.persistence.Entity;

@Entity
public class ParkingSpace {
    private long id;
    private int number;
    private int level;
    private boolean impaired;
}
