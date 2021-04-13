package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.animal.cat.Cat;
import com.zoo.exception.ColorException;
import com.zoo.exception.NegativeValueException;

public class Main {

    public static void main(String[] args) {
        try {
            //Animal cat1 = new Cat("Pushok", -3);
            Animal cat2 = new Cat("Vasya", 5);
            Animal cat3 = new Cat("Richard",null);
            System.out.println(cat3.getColor());
        }
        catch (NegativeValueException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getAge());
        }
        catch (ColorException e)  {
            System.out.println(e.getMessage());
        }
    }

}
