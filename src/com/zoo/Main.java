package com.zoo;

import com.zoo.animal.cat.Cat;
import com.zoo.animal.eagle.Eagle;
import com.zoo.animal.seal.Seal;
import com.zoo.animal.tiger.Tiger;
import com.zoo.enclosure.Enclosure;
import com.zoo.enclosure.EnclosuresInZoo;
import com.zoo.exception.AnimalDuplicateException;
import com.zoo.exception.EnclosureNotFoundException;
import com.zoo.exception.EnclosureSizeException;
import com.zoo.exception.ZooFullEnclosuresException;
import com.zoo.test.EnclosuresInZooTest;

public class Main {

    public static void main(String[] args) {
        EnclosuresInZoo enclosuresInZoo = new EnclosuresInZoo(2);
        enclosuresInZoo.addEnclosure("1");
        enclosuresInZoo.addEnclosure("2",5);

        Cat cat = new Cat("Cat1", 10);
        Eagle eagle = new Eagle("eagle1",3);
        Seal seal = new Seal("seal1",15);

        enclosuresInZoo.addAnimal("1", cat);
        enclosuresInZoo.addAnimal("2", seal);
        enclosuresInZoo.addAnimal("2", eagle);

        enclosuresInZoo.printEnclosuresInfo();

        try{
            enclosuresInZoo.addEnclosure("3");
        }
        catch (ZooFullEnclosuresException e){
            System.out.println(e.getMessage());
        }

        Tiger tiger = new Tiger();

        try{
            enclosuresInZoo.addAnimal("?", tiger);

        }
        catch (EnclosureNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


}
