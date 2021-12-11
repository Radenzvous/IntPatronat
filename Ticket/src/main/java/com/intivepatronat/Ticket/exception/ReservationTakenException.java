package com.intivepatronat.Ticket.exception;

public class ReservationTakenException extends RuntimeException {
    public ReservationTakenException(final String errorMessage) {
        super(errorMessage);
    }
}