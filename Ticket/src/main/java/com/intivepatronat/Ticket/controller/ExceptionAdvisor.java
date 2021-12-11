package com.intivepatronat.Ticket.controller;

import com.intivepatronat.Ticket.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvisor {


    @ExceptionHandler(value = {ReservationUserNotFoundException.class})
    public ResponseEntity<Object> handleReservationUserNotFoundException(final ReservationUserNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {UserAlreadyExistsException.class})
    public ResponseEntity<Object> handleUserAlreadyExistsException(final UserAlreadyExistsException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<Object> handleUserNotFoundException(final UserNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {ParkingSpaceNotFoundException.class})
    public ResponseEntity<Object> handleParkingSpaceNotFoundException(final ParkingSpaceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {ReservationTakenException.class})
    public ResponseEntity<Object> handleReservationTakenException(final ReservationTakenException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {ReservationNotFoundException.class})
    public ResponseEntity<Object> handleReservationNotFoundException(final ReservationNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {ParkingSpaceAlreadyExistsException.class})
    public ResponseEntity<Object> handleParkingSpaceAlreadyExistsException(final ParkingSpaceAlreadyExistsException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

}


