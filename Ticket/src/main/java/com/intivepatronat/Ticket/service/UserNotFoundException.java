package com.intivepatronat.Ticket.service;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}