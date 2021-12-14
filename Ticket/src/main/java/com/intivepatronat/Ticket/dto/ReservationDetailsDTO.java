package com.intivepatronat.Ticket.dto;

import lombok.Value;

@Value
public class ReservationDetailsDTO {
    String userName;
    Long parkingSpaceNumber;
    Long parkingSpaceLevel;
    Boolean parkingSpaceImpaired;
    Long id;


}

