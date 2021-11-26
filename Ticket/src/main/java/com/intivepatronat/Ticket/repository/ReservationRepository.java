package com.intivepatronat.Ticket.repository;

import com.intivepatronat.Ticket.model.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Optional <Reservation> findById(Long parkingSpaceNumber);


}
