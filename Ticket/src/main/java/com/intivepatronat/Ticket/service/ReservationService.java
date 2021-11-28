package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.dto.ReservationDTO;
import com.intivepatronat.Ticket.dto.ReservationDetailsDTO;
import com.intivepatronat.Ticket.dto.UserDTO;
import com.intivepatronat.Ticket.mapper.ReservationMapper;
import com.intivepatronat.Ticket.model.ParkingSpace;
import com.intivepatronat.Ticket.model.Reservation;
import com.intivepatronat.Ticket.model.User;
import com.intivepatronat.Ticket.repository.ParkingSpaceRepository;
import com.intivepatronat.Ticket.repository.ReservationRepository;
import com.intivepatronat.Ticket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final UserRepository userRepository;
    private final ParkingSpaceRepository parkingSpaceRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, UserRepository userRepository, ParkingSpaceRepository parkingSpaceRepository) {
        this.reservationRepository = reservationRepository;
        this.userRepository = userRepository;
        this.parkingSpaceRepository = parkingSpaceRepository;
    }

    public ReservationDTO createReservation(final ReservationDTO reservationDTO) {

        User user = userRepository.findByName(reservationDTO.getUserName()).orElseThrow(() ->

                new IllegalArgumentException("This user was not found in the database"));


        ParkingSpace parkingSpace = parkingSpaceRepository.findByNumberAndLevel(reservationDTO.getParkingSpaceNumber(), reservationDTO.getParkingSpaceLevel()).orElseThrow(() ->

                new IllegalArgumentException("error"));

        Optional<Reservation> reservation = reservationRepository.findByParkingSpace(parkingSpace);


        if (reservation.isPresent()) {
            throw new IllegalArgumentException("This reservation already exists");
        } else {

            Reservation newReservation = new Reservation(user, parkingSpace);
            reservationRepository.save(newReservation);
        }
        return reservationDTO;


    }


    public void removeReservation(final Long reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId).orElseThrow(() ->


                new IllegalArgumentException("There is no such reservation found in the database")

        );


        //ParkingSpace parkingSpace = parkingSpaceRepository.findByNumberAndLevel(reservationRemovalDTO.getNumber(), reservationRemovalDTO.getLevel()).orElseThrow(() ->


        //new IllegalArgumentException("There is no such combination of parking space number and parking space level/elevation found in the database"));

        reservationRepository.delete(reservation);
    }


    public List<ReservationDetailsDTO> listReservationsByUserName(final String userName) {
        User user = userRepository.findByName(userName).orElseThrow(() ->
                new IllegalArgumentException("Cannot find the user")
        );

        ReservationMapper reservationMapper = new ReservationMapper();
        List<Reservation> reservations = reservationRepository.findAllByUser(user);
        return reservationMapper.mapToReservationDetailsDTOs(reservations);

    }


}

