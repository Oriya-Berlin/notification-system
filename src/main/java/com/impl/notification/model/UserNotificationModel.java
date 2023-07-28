package com.impl.notification.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_notification")
public class UserNotificationModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    // TODO: 23/07/2023 add docs to this
    @NotNull
    @Column(name = "version")
    private Integer version;
}
