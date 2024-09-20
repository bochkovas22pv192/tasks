package com.example.tasks.exceptions;

public class NoTaskException extends RuntimeException {
    public NoTaskException(){
        super("Нет такой задачи.");
    }
}
