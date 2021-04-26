package com.zoo.enclosure;


import com.zoo.animal.Animal;
import com.zoo.exception.AnimalDuplicateException;
import com.zoo.exception.EnclosureSizeException;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Enclosure {
    private static int enclosuresCount = 0;
    private int ID;
    private int size;
    private Set<Animal> enclosureAnimals;

    public static int getEnclosureCount() {
        return enclosuresCount;
    }

    public Enclosure(int size) {
        this.size = size;
        this.enclosureAnimals = new LinkedHashSet<>(size);
        this.ID = ++enclosuresCount;
    }

    public Enclosure(){
        this(5);
    }

    public int getID() {
        return this.ID;
    }

    public void addNewAnimal(Animal animal) throws EnclosureSizeException, AnimalDuplicateException{
        if(this.enclosureAnimals.size() >= size) {
            throw new EnclosureSizeException("Enclosure with ID " + this.ID + " is full");
        }
        else if (!this.enclosureAnimals.add(animal)){
                  throw new AnimalDuplicateException("This animal is already in Enclosure");
        }
    }
    public void removeAnimal(Animal animal) {
        if(enclosureAnimals.contains(animal))
            enclosureAnimals.remove(animal);
        else System.out.println("No such animal in enclosure with ID " + this.ID);
    }

    public boolean contains(Animal animal) {
        for (Animal animal1 : enclosureAnimals)
            if(animal1.equals(animal))
                return true;
        return false;
    }
    public void printAllAnimals() {
        System.out.println("Enclosure with ID " + this.ID + "has this animals: ");
        if(enclosureAnimals.isEmpty())
            System.out.println("EMPTY ENCLOSURE");
        for (var animal : enclosureAnimals) {
            System.out.println(animal.getName());
        }
    }
}
