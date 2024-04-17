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
    @Column(name = "first_name")
    private String firsNname;
    @Column(name = "flast_name")
    private String lastName;
    @Column(name = "user_name")
    private String  userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private  String phoneNumber;
    @Column(name = "address")
    private String address;


}
