package com.intivepatronat.Ticket.dto;


import lombok.Value;

import javax.validation.constraints.Min;


@Value
public class ParkingSpaceDTO {
    @Min(value = 1L, message = "Has to be higher or equal 1")

    Long number;
    Long level;
    Boolean impaired;


}
