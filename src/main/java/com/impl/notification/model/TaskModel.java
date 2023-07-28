package com.impl.notification.model;

import com.impl.notification.enums.TaskStatusEnum;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "task")
public class TaskModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private TaskStatusEnum status;

    @ManyToOne
    @JoinColumn(name = "assignee")
    private UserModel assignee;

}
