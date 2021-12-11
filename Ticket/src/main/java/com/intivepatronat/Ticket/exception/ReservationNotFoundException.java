package com.intivepatronat.Ticket.exception;

public class ReservationNotFoundException extends RuntimeException {
    public ReservationNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}