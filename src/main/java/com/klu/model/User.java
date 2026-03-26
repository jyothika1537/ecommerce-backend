package com.klu.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role;

    public User() {}

    public String getEmail() { return email; }
    public String getPassword() { return password; }
}