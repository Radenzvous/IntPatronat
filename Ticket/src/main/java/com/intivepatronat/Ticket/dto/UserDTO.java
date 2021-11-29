package com.intivepatronat.Ticket.dto;


import javax.validation.constraints.Pattern;

public class UserDTO {
    @Pattern.List({
            @Pattern(regexp = "^[\\s\\S]{2,20}", message = "Invalid characters"),
            @Pattern(regexp = "(?!(?:(\\s)\\1*$)$).*", message = "Username cannot be only whitespaces")
    })
    private String name;

    public UserDTO() {
    }

    public UserDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
