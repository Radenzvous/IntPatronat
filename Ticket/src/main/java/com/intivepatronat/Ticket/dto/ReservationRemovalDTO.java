package com.intivepatronat.Ticket.dto;

public final class ReservationRemovalDTO {
    private Long number;
    private Long level;


    private ReservationRemovalDTO(Long number, Long level) {
        this.number = number;
        this.level = level;
    }

    public Long getNumber() {
        return number;
    }

    public Long getLevel() {
        return level;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setLevel(Long level) {
        this.level = level;
    }


}
