package com.zoo.exception;

public class NegativeValueException extends Exception{
    private int age;
    public int getAge()
    {
        return this.age;
    }
    public NegativeValueException(String message, int age)
    {
        super(message);
        this.age = age;
    }
}
