package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.dto.ParkingSpaceDTO;
import com.intivepatronat.Ticket.repository.ParkingSpaceRepository;
import com.intivepatronat.Ticket.repository.ReservationRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ParkingSpaceServiceTest {

    @Test
    public void listFreeParkingSpaces_shouldReturnEmptyParkingSpaceList() {
        final ParkingSpaceRepository parkingSpaceRepository = Mockito.mock(ParkingSpaceRepository.class);
        final ReservationRepository reservationRepository = Mockito.mock(ReservationRepository.class);
        final ParkingSpaceService parkingSpaceService = new ParkingSpaceService(reservationRepository, parkingSpaceRepository);
        when(parkingSpaceRepository.findAll()).thenReturn(Collections.emptyList());
        final List<ParkingSpaceDTO> parkingSpaceDTOS = parkingSpaceService.listFreeParkingSpaces();
        verify(parkingSpaceRepository).findAll();
        assertEquals(parkingSpaceDTOS, Collections.emptyList());
    }
}
