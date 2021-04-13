package com.zoo.animal;

public class Cat extends Animal{

    @Override
    public void say()
    {
        System.out.println("I am " + this.getClass().getName());
    }

    @Override
    public void Eat() {
        System.out.println("I am eating");
    }

    @Override
    public void GetHungry() {

    }


}
