package com.zoo.animal;

public abstract class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say()
    {
        System.out.println("Who am I?");
    }

     public abstract void beSlave();
    public abstract void nothing();
}
