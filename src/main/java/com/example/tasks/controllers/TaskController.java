package com.example.tasks.controllers;

import com.example.tasks.models.Task;
import com.example.tasks.services.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    private final UserService service;

    TaskController(UserService userService) {
        this.service = userService;
    }

    @GetMapping("/tasks/{id}")
    Optional<Task> tasksById(@PathVariable Long id) {
        return service.getTasksById(id);
    }

    @GetMapping("/tasks")
    List<Task> tasksAll() {
        return service.getTasksAll();
    }

    @PutMapping("/tasks/{id}")
    Task replaceEmployee(@PathVariable Long id, @RequestBody Task newTask) {
        return service.putTask(newTask, id);
    }

    @DeleteMapping("/tasks/{id}")
    void deleteEmployee(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
