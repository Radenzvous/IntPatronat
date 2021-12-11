package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.dto.ParkingSpaceDTO;
import com.intivepatronat.Ticket.exception.ParkingSpaceAlreadyExistsException;
import com.intivepatronat.Ticket.mapper.ParkingSpaceMapper;
import com.intivepatronat.Ticket.model.ParkingSpace;
import com.intivepatronat.Ticket.repository.ParkingSpaceRepository;
import com.intivepatronat.Ticket.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ParkingSpaceService {


    private final ReservationRepository reservationRepository;
    private final ParkingSpaceRepository parkingSpaceRepository;


    public ParkingSpaceService(final ReservationRepository reservationRepository, final ParkingSpaceRepository parkingSpaceRepository) {
        this.reservationRepository = reservationRepository;
        this.parkingSpaceRepository = parkingSpaceRepository;
    }


    public ParkingSpaceDTO createParkingSpace(final ParkingSpaceDTO parkingSpaceDTO) {

        final Optional<ParkingSpace> parkingSpace = parkingSpaceRepository.findByNumberAndLevel(parkingSpaceDTO.getNumber(), parkingSpaceDTO.getLevel());


        if (parkingSpace.isPresent()) {
            throw new ParkingSpaceAlreadyExistsException("Parking space number and level already exist in the database");
        } else {
            final ParkingSpace newParkingSpace = new ParkingSpace(parkingSpaceDTO.getNumber(), parkingSpaceDTO.getLevel(), parkingSpaceDTO.getImpaired());
            parkingSpaceRepository.save(newParkingSpace);
        }
        return parkingSpaceDTO;
    }

    public List<ParkingSpaceDTO> listFreeParkingSpaces() {
        final List<ParkingSpace> parkingSpaces = parkingSpaceRepository.findAll();
        final List<ParkingSpace> freeParkingSpaces = parkingSpaces.stream().filter(
                (parkingSpace) ->
                        reservationRepository.findByParkingSpace(parkingSpace).isEmpty()
        ).collect(Collectors.toList());
        final ParkingSpaceMapper parkingSpaceMapper = new ParkingSpaceMapper();
        return parkingSpaceMapper.mapToParkingSpaceDTOs(freeParkingSpaces);

    }
}
