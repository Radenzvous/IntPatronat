package com.intivepatronat.Ticket.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(final String errorMessage) {
        super(errorMessage);
    }
}