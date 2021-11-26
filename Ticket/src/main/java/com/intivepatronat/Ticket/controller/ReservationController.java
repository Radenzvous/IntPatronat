package com.intivepatronat.Ticket.controller;

import com.intivepatronat.Ticket.dto.ReservationDTO;
import com.intivepatronat.Ticket.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("/reservation")
public class ReservationController {
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


}




