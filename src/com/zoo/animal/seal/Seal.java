package com.zoo.animal.seal;

import com.zoo.animal.Animal;
import com.zoo.animal.Moveable;
import com.zoo.animal.Swimable;

public class Seal extends Animal implements Swimable, Moveable {
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
