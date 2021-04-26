package com.zoo.animal.seal;

import com.zoo.animal.Animal;
import com.zoo.animal.interfaces.Moveable;
import com.zoo.animal.interfaces.Swimable;
import com.zoo.exception.NegativeValueException;

public class Seal extends Animal implements Swimable, Moveable {

    public Seal(String name, int age) throws NegativeValueException
    {
        super(name,age);
    }
    public Seal(){}
    public Seal(String name) {
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
    public void move() {

    }

    @Override
    public void swim() {

    }
    @Override
    public void say()
    {
        System.out.println("I am " + this.getClass().getSimpleName());
    }
}