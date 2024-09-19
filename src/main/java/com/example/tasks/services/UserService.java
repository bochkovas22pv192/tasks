package com.example.tasks.services;



import com.example.tasks.State;
import com.example.tasks.models.Task;
import com.example.tasks.repository.TaskRepository;
import com.example.tasks.exceptions.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final TaskRepository repository;

    public UserService(TaskRepository taskRepository){
        this.repository = taskRepository;
    }

    public Optional<Task> getTasksById(Long id){
        return repository.findById(id);
    }

    public List<Task> getTasksAll(){
        return repository.findAll();
    }

    public Task putTask(Task newTask, Long id){
        if(newTask.getName().isEmpty()){
            throw new TaskNameEmptyException();
        }

        if(newTask.getName().isBlank()){
            throw new TaskNameWhitespaceException();
        }

        if(newTask.getDescription().isEmpty()){
            throw new TaskDescriptionEmptyException();
        }

        if(newTask.getDescription().isBlank()){
            throw new TaskDescriptionWhitespaceException();
        }

        if(newTask.getDate().isBefore(LocalDate.now())){
            throw new DateExecuteMinException();
        }

        if(newTask.getEmailExecutor().isEmpty()){
            throw new TaskEmailExecutorEmptyException();
        }

        newTask.setTimeUpdate(LocalDateTime.now());
        return repository.findById(id)
                .map(task -> {
                    task.setEmail(newTask.getEmail());
                    task.setName(newTask.getName());
                    task.setDate(newTask.getDate());
                    task.setEmailExecutor(newTask.getEmailExecutor());
                    task.setDescription(newTask.getDescription());
                    task.setPriority(newTask.getPriority());
                    return repository.save(task);
                })
                .orElseGet(() -> {
                    newTask.setState(State.NEW);
                    newTask.setTimeCreate(LocalDateTime.now());
                    return repository.save(newTask);
                });
    }
    public void deleteTask(Long id){
        repository.deleteById(id);
    }
}
