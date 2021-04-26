package com.zoo.exception;

public class AviarySizeException extends Exception {
    private int size;
    public int getSize(){return this.size;}
    public AviarySizeException(String message, int size){
        super(message);
        this.size = size;
    }
}
