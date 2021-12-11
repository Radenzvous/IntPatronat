package com.intivepatronat.Ticket.exception;

public class ParkingSpaceAlreadyExistsException extends RuntimeException {
    public ParkingSpaceAlreadyExistsException(final String errorMessage) {
        super(errorMessage);
    }
}