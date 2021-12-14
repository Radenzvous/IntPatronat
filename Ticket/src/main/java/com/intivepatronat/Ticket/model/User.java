package com.intivepatronat.Ticket.model;


import lombok.Getter;

import javax.persistence.*;


@Entity
@Table
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public User() {

    }

    public User(final String name) {
        this.name = name;
    }

}
