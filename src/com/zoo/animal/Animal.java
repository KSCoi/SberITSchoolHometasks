package com.zoo.animal;

import com.zoo.exception.ColorException;
import com.zoo.exception.NegativeValueException;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws ColorException{
        if(color==null)
            throw new ColorException("Color is null");
        this.color = color;
    }

    public Animal(){

    }

    public Animal(String name, String color) throws ColorException
    {
        this.name = name;
        if(color==null)
            throw new ColorException("Color is null");
        this.color = color;
    }

    public Animal(String name, int age) throws NegativeValueException {
        this.name = name;
        this.age = age;
        if(age<0)
            throw new NegativeValueException("The number is less than 0",age);
    }


    public void setAge(int age) throws NegativeValueException {
        if(age<0)   {
           throw new NegativeValueException("The number is less than 0",age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void say();

    public abstract void Eat();

    public abstract void getHungry();



}
