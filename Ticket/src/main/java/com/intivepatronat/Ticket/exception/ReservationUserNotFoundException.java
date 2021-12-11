package com.intivepatronat.Ticket.exception;

public class ReservationUserNotFoundException extends RuntimeException {
    public ReservationUserNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}