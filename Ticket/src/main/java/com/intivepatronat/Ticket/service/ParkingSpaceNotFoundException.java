package com.intivepatronat.Ticket.service;

public class ParkingSpaceNotFoundException extends RuntimeException {
    public ParkingSpaceNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}