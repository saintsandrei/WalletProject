package com.example.walletproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique=true, nullable=false, length=20, updatable=false)
    private String username;
    @Column(nullable = false, length=20)
    private String password;
    @Column(nullable=false, length=50)
    private String email;
    @Column(nullable=false, length=11)
    private String phone;
}
