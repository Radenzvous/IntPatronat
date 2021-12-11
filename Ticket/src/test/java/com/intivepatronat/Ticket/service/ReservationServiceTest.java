package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.exception.ReservationNotFoundException;
import com.intivepatronat.Ticket.repository.ParkingSpaceRepository;
import com.intivepatronat.Ticket.repository.ReservationRepository;
import com.intivepatronat.Ticket.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ReservationServiceTest {
    private ReservationService reservationService;

    @Test
    public void removeReservation_shouldReturnReservationNotFoundException() {
        ReservationRepository reservationRepository = Mockito.mock(ReservationRepository.class);
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        ParkingSpaceRepository parkingSpaceRepository = Mockito.mock(ParkingSpaceRepository.class);
        reservationService = new ReservationService(reservationRepository, userRepository, parkingSpaceRepository);
        final Exception exception = assertThrows(ReservationNotFoundException.class, () -> reservationService.removeReservation(1L));
        final String expectedMessage = "There is no such reservation found in the database";
        final String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));



    }

}