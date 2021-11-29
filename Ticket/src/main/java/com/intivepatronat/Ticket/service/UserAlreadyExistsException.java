package com.intivepatronat.Ticket.service;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(final String errorMessage) {
        super(errorMessage);
    }
}