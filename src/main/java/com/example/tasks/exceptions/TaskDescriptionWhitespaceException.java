package com.example.tasks.exceptions;

public class TaskDescriptionWhitespaceException extends RuntimeException {
    public TaskDescriptionWhitespaceException(){
        super("Введено недопустимое значение поля \"Описание задачи\"");
    }
}
