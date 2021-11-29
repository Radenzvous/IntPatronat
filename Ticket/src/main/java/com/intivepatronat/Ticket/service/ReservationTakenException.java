package com.intivepatronat.Ticket.service;

public class ReservationTakenException extends RuntimeException {
    public ReservationTakenException(final String errorMessage) {
        super(errorMessage);
    }
}