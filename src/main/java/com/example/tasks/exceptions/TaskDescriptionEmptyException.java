package com.example.tasks.exceptions;

public class TaskDescriptionEmptyException extends RuntimeException {
    public TaskDescriptionEmptyException(){
        super("Поле \"Комментарий\" обязательно для заполнения.");
    }
}
