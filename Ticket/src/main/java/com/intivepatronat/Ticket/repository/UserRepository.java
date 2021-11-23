package com.intivepatronat.Ticket.repository;

import com.intivepatronat.Ticket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.naming.Name;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
}