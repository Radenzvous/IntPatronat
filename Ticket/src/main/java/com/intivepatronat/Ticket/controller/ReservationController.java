package com.intivepatronat.Ticket.controller;

import com.intivepatronat.Ticket.dto.ReservationDTO;
import com.intivepatronat.Ticket.dto.ReservationDetailsDTO;
import com.intivepatronat.Ticket.service.ReservationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final String statusMessageSuccess = "Successfully created the thing";
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @PostMapping
    public ResponseEntity<ReservationDTO> saveReservation(
            @RequestBody final ReservationDTO userReservationDTO) {
        final var response = reservationService.createReservation(userReservationDTO);
        return ResponseEntity.status(CREATED).body(response);
    }

    @DeleteMapping("/{reservationId}")
    public ResponseEntity<Void> deleteReservation(
            @PathVariable final Long reservationId) {
        reservationService.removeReservation(reservationId);
        return ResponseEntity.status(OK).body(null);

    }

    @GetMapping
    public ResponseEntity<List<ReservationDetailsDTO>> listAllReservations() {
        List<ReservationDetailsDTO> reservations = reservationService.listAllReservations();
        return ResponseEntity.status(OK).body(reservations);

    }


    @GetMapping("/user/{userName}")
    public ResponseEntity<List<ReservationDetailsDTO>> listReservationsByUserName(
            @PathVariable final String userName) {
        List<ReservationDetailsDTO> reservations = reservationService.listReservationsByUserName(userName);
        return ResponseEntity.status(OK).body(reservations);

    }


}






