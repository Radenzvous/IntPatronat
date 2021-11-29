package com.intivepatronat.Ticket.service;

public class ReservationNotFoundException extends RuntimeException {
    public ReservationNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}