package com.intivepatronat.Ticket.repository;

import com.intivepatronat.Ticket.model.ParkingSpace;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParkingSpaceRepository extends JpaRepository <ParkingSpace, Long> {
    Optional<ParkingSpace> findByNumber(Long number);
    Optional<ParkingSpace> findByNumberAndLevel(Long number, Long level);
}
