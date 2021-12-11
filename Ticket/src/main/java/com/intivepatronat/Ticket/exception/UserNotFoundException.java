package com.intivepatronat.Ticket.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}