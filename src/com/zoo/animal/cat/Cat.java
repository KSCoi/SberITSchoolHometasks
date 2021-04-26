package com.zoo.animal.cat;

import com.zoo.animal.Animal;
import com.zoo.animal.interfaces.Moveable;
import com.zoo.exception.ColorException;
import com.zoo.exception.NegativeValueException;

public class Cat extends Animal implements Moveable {

    public Cat(String name, String color) throws ColorException {
    super(name,color);
    }
    public Cat() {

    }
    public Cat(String name, int age) throws NegativeValueException {
        super(name,age);
    }
    @Override
    public void say()
    {
        System.out.println("I am " + this.getClass().getSimpleName());
    }

    @Override
    public void Eat() {
        System.out.println("I am eating");
    }

    @Override
    public void getHungry() {
        System.out.println("I am hungry");
    }

    public void move(){

    }

}
