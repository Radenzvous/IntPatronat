package com.intivepatronat.Ticket.dto;

public class ParkingSpaceDTO {
    private final Long number;
    private final Long level;
    private final Boolean impaired;


    public ParkingSpaceDTO(final Long number, final Long level, final Boolean impaired) {
        this.number = number;
        this.level = level;
        this.impaired = impaired;
    }

    public Long getNumber() {
        return number;
    }

    public Long getLevel() {
        return level;
    }

    public Boolean getImpaired() {
        return impaired;
    }

}
