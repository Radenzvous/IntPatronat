package com.intivepatronat.Ticket.exception;

public class ParkingSpaceNotFoundException extends RuntimeException {
    public ParkingSpaceNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}