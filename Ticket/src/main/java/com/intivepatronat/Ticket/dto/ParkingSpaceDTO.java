package com.intivepatronat.Ticket.dto;

public final class ParkingSpaceDTO {
    private Long number;
    private Long level;
    private Boolean impaired;


    public ParkingSpaceDTO(Long number, Long level, Boolean impaired) {
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

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public void setImpaired(Boolean impaired) {
        this.impaired = impaired;
    }
}
