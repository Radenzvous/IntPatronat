package com.intivepatronat.Ticket.service;

public class ParkingSpaceAlreadyExistsException extends RuntimeException {
    public ParkingSpaceAlreadyExistsException(final String errorMessage) {
        super(errorMessage);
    }
}