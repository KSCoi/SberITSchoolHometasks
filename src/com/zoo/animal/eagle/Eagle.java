package com.zoo.animal.eagle;

import com.zoo.animal.Animal;
import com.zoo.animal.interfaces.Flyable;
import com.zoo.animal.interfaces.Moveable;
import com.zoo.exception.NegativeValueException;

public class Eagle extends Animal implements Moveable, Flyable {

    public Eagle(String name, int age) throws NegativeValueException
    {
        super(name,age);
    }
    public Eagle(){}
    public Eagle (String name)
    {
        super(name);
    }

    @Override
    public void Eat() {
        System.out.println("I am eating");
    }

    @Override
    public void getHungry() {
        System.out.println("I am hungry");
    }

    @Override
    public void fly() {

    }

    @Override
    public void move() {

    }
    @Override
    public void say()
    {
        System.out.println("I am " + this.getClass().getSimpleName());
    }
}
