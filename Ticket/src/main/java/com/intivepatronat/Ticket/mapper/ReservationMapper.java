package com.intivepatronat.Ticket.mapper;

import com.intivepatronat.Ticket.dto.ReservationDetailsDTO;
import com.intivepatronat.Ticket.model.Reservation;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


public class ReservationMapper {
    public List<ReservationDetailsDTO> mapToReservationDetailsDTOs(final List<Reservation> reservations) {
        final var reservationDetailsDTOs = new ArrayList<ReservationDetailsDTO>();

        if (!CollectionUtils.isEmpty(reservations)) {
            reservations.forEach(reservation -> {
                ReservationDetailsDTO reservationDetailsDTO = new ReservationDetailsDTO(reservation.getUser().getName(), reservation.getParkingSpace().getNumber(), reservation.getParkingSpace().getLevel(), reservation.getParkingSpace().isImpaired(), reservation.getId());
                reservationDetailsDTOs.add(reservationDetailsDTO);


            });
        }

        return reservationDetailsDTOs;
    }


}
