package com.example.tasks.exceptions;

public class DateExecuteMinException extends RuntimeException {
    public DateExecuteMinException(){
        super("Срок исполнения задачи не должен быть меньше текущей даты.");
    }
}
