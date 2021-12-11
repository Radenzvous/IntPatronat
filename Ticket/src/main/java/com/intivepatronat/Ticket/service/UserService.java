package com.intivepatronat.Ticket.service;

import com.intivepatronat.Ticket.dto.UserDTO;
import com.intivepatronat.Ticket.exception.UserAlreadyExistsException;
import com.intivepatronat.Ticket.exception.UserNotFoundException;
import com.intivepatronat.Ticket.model.User;
import com.intivepatronat.Ticket.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO createUser(final UserDTO userDTO) {


        final Optional<User> user = userRepository.findByName(userDTO.getName());
        if (user.isEmpty()) {
            final User newUser = new User(userDTO.getName());
            userRepository.save(newUser);

        } else {

            throw new UserAlreadyExistsException("Error - user already exists in the database");
        }


        return userDTO;
    }

    public void removeUser(final String userName) {
        final User user = userRepository.findByName(userName).orElseThrow(() ->


                new UserNotFoundException("There is no such user found in the database")

        );


        userRepository.delete(user);
    }


}
