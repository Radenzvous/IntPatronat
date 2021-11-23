package com.intivepatronat.Ticket.dto;

public class ParkingSpaceDTO {
    private Integer number;
    private Integer level;
    private Boolean impaired;


    public ParkingSpaceDTO(Integer number, Integer level, Boolean impaired) {
        this.number = number;
        this.level = level;
        this.impaired = impaired;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getLevel() {
        return level;
    }

    public Boolean getImpaired() {
        return impaired;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setImpaired(Boolean impaired) {
        this.impaired = impaired;
    }
}
