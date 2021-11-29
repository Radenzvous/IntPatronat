package com.intivepatronat.Ticket.service;

public class ReservationUserNotFoundException extends RuntimeException {
    public ReservationUserNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}