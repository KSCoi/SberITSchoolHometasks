package com.zoo.animal.tiger;

import com.zoo.animal.Animal;
import com.zoo.animal.Moveable;

public class Tiger extends Animal implements Moveable {


    public void move(){

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
    public void say()
    {
        System.out.println("I am " + this.getClass().getSimpleName());
    }
}
