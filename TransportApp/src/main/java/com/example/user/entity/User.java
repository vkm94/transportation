package com.example.user.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firsNname;
    private String lastName;
    private String  userName;
    private String password;
    private String email;
    private  String phoneNumber;
    private String address;


}
