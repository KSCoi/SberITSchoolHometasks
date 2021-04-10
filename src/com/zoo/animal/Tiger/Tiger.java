package com.zoo.animal.Tiger;

import com.zoo.animal.Animal;
import com.zoo.animal.Moveable;

public class Tiger extends Animal implements Moveable {
    public void move(){

    }
    @Override
    public void beSlave()
    {
        System.out.println("I am in jail");
    }

    @Override
    public void nothing() {
        System.out.println("I do nothing");
    }

}
