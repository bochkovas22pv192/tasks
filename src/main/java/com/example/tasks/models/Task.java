package com.example.tasks.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import com.example.tasks.State;
import jakarta.persistence.*;


@Entity
@Table(name ="tb_task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="email_author", nullable = false)
    private String email;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="priority", nullable = false)
    private String priority;

    @Column(name="email_executor", nullable = false)
    private String emailExecutor;

    @Column(name="date_task", nullable = false)
    private LocalDate date;

    @Column(name="time_create", nullable = false)
    private LocalDateTime timeCreate;

    @Column(name="state", nullable = false)
    private State state;

    @Column(name="time_update", nullable = false)
    private LocalDateTime timeUpdate;

    Task() {}


    public Task(String email, String name, String description, String priority, String emailExecutor, LocalDate date, LocalDateTime timeCreate, State state, LocalDateTime timeUpdate) {
        this.email = email;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.emailExecutor = emailExecutor;
        this.date = date;
        this.timeCreate = timeCreate;
        this.state = state;
        this.timeUpdate = timeUpdate;
    }

    public Task(Long id, String email, String name, String description, String priority, String emailExecutor, LocalDate date, LocalDateTime timeCreate, State state, LocalDateTime timeUpdate) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.emailExecutor = emailExecutor;
        this.date = date;
        this.timeCreate = timeCreate;
        this.state = state;
        this.timeUpdate = timeUpdate;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTimeUpdate() {
        return timeUpdate;
    }

    public State getState() {
        return state;
    }

    public LocalDateTime getTimeCreate() {
        return timeCreate;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getEmailExecutor() {
        return emailExecutor;
    }

    public String getPriority() {
        return priority;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setEmailExecutor(String emailExecutor) {
        this.emailExecutor = emailExecutor;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTimeCreate(LocalDateTime timeCreate) {
        this.timeCreate = timeCreate;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setTimeUpdate(LocalDateTime timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(email, task.email) && Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(priority, task.priority) && Objects.equals(emailExecutor, task.emailExecutor) && Objects.equals(date, task.date) && Objects.equals(timeCreate, task.timeCreate) && state == task.state && Objects.equals(timeUpdate, task.timeUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name, description, priority, emailExecutor, date, timeCreate, state, timeUpdate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", emailExecutor='" + emailExecutor + '\'' +
                ", date=" + date +
                ", timeCreate=" + timeCreate +
                ", state=" + state +
                ", timeUpdate=" + timeUpdate +
                '}';
    }
}