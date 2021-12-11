package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.dto.UserDTO;
import com.intivepatronat.Ticket.model.User;
import com.intivepatronat.Ticket.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    public void createUser_shouldCreateUser() {
        final UserRepository userRepository = Mockito.mock(UserRepository.class);
        final UserService userService = new UserService(userRepository);
        final UserDTO userDTO = new UserDTO("test");
        when(userRepository.findByName("test")).thenReturn(Optional.empty());
        final UserDTO user = userService.createUser(userDTO);
        verify(userRepository).save(any(User.class));
        assertEquals(user, userDTO);
    }
}