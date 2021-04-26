package com.zoo.exception;

public class AnimalDuplicateException extends RuntimeException{
    public AnimalDuplicateException(String message) {
        super(message);
    }
}
