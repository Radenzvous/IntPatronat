package com.intivepatronat.Ticket.dto;


import lombok.Value;

import javax.validation.constraints.Pattern;

@Value
public class UserDTO {
    @Pattern.List({
            @Pattern(regexp = "^[\\s\\S]{2,20}", message = "Invalid characters"),
            @Pattern(regexp = "(?!(?:(\\s)\\1*$)$).*", message = "Username cannot be only whitespaces")
    })
    String name;

}


