package com.intivepatronat.Ticket.dto;

public class ReservationRemovalDTO {
    private final Long number;
    private final Long level;


    private ReservationRemovalDTO(final Long number, final Long level) {
        this.number = number;
        this.level = level;
    }

    public Long getNumber() {
        return number;
    }

    public Long getLevel() {
        return level;
    }


}
