package com.zoo.animal.tiger;

import com.zoo.animal.Animal;
import com.zoo.animal.Moveable;
import com.zoo.exception.NegativeValueException;

public class Tiger extends Animal implements Moveable {

    Tiger(){}
    Tiger(String name) {
        super(name);
    }
    Tiger(String name, int age) throws NegativeValueException {
        super(name,age);
    }

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
