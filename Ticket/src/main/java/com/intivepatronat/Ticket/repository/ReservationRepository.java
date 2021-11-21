package com.intivepatronat.Ticket.repository;

import com.intivepatronat.Ticket.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
