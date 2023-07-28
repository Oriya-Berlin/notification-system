package com.impl.notification.controller;

import com.impl.notification.model.TaskModel;
import com.impl.notification.service.TaskService;
import com.impl.notification.util.CustomResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;


    @GetMapping
    public CustomResponse getTasks() {
        return new CustomResponse(1, null, null);
    }


    @PostMapping
    public CustomResponse createTask(@RequestBody TaskModel taskModel) {
        return new CustomResponse(1, null, null);
    }

}
