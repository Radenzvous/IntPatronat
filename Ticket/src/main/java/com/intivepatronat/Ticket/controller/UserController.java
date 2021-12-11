package com.intivepatronat.Ticket.controller;


import com.intivepatronat.Ticket.dto.UserDTO;
import com.intivepatronat.Ticket.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<UserDTO> saveUser(
            @RequestBody @Valid final UserDTO userDTO) {
        final var response = userService.createUser(userDTO);
        return ResponseEntity.status(CREATED).body(response);
    }

    @DeleteMapping("/{userName}")
    public ResponseEntity<Void> deleteUser(
            @PathVariable final String userName) {
        userService.removeUser(userName);
        return ResponseEntity.ok().build();
    }


}