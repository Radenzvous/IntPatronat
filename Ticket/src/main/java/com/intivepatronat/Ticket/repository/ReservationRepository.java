package com.intivepatronat.Ticket.repository;

import com.intivepatronat.Ticket.model.ParkingSpace;
import com.intivepatronat.Ticket.model.Reservation;

import com.intivepatronat.Ticket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Optional <Reservation> findById(Long parkingSpaceNumber);
    Optional <Reservation> findByParkingSpace(ParkingSpace parkingSpace);
    List<Reservation> findAllByUser(User user);
}
