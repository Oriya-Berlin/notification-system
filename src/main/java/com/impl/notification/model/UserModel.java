package com.impl.notification.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_model")
public class UserModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name")
    private String name;


    // TODO: 23/07/2023 add here notification version and docs about the trade off when we using it at the same entity
}
