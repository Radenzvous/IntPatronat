package com.intivepatronat.Ticket.repository;

import com.intivepatronat.Ticket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}