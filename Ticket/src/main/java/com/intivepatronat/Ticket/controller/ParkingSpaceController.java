package com.intivepatronat.Ticket.controller;

import com.intivepatronat.Ticket.dto.ParkingSpaceDTO;
import com.intivepatronat.Ticket.model.ParkingSpace;
import com.intivepatronat.Ticket.service.ParkingSpaceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/parking-space")
public class ParkingSpaceController {
    private final ParkingSpaceService parkingSpaceService;


    public ParkingSpaceController(ParkingSpaceService parkingSpaceService) {
        this.parkingSpaceService = parkingSpaceService;
    }


    @PostMapping
    public ResponseEntity<ParkingSpaceDTO> saveParkingSpace(
            @RequestBody final ParkingSpaceDTO parkingSpaceDTO) {
        final var response = parkingSpaceService.createParkingSpace(parkingSpaceDTO);
        return ResponseEntity.status(CREATED).body(response);

    }

    @GetMapping("/free")
    public ResponseEntity<List<ParkingSpaceDTO>> listFreeParkingSpaces() {
        List<ParkingSpaceDTO> parkingSpaces = parkingSpaceService.listFreeParkingSpaces();
        return ResponseEntity.status(OK).body(parkingSpaces);


    }

}
