package com.zoo.enclosure;

import com.zoo.animal.Animal;
import com.zoo.exception.AnimalDuplicateException;
import com.zoo.exception.EnclosureNotFoundException;
import com.zoo.exception.EnclosureSizeException;
import com.zoo.exception.ZooFullEnclosuresException;

import java.util.LinkedHashMap;
import java.util.Map;

public class EnclosuresInZoo {
    private int enclosuresMaxCount;
    private LinkedHashMap<String, Enclosure> enclosureMap;

    public EnclosuresInZoo(int enclosuresCount) {
        this.enclosuresMaxCount = enclosuresCount;
        this.enclosureMap= new LinkedHashMap<>(enclosuresCount);
    }

    public EnclosuresInZoo() {
        this(5);
    }
    public void addEnclosure(String name, int size) throws ZooFullEnclosuresException {
        if(enclosureMap.size()>size)
            throw new ZooFullEnclosuresException("Zoo is full");
        else enclosureMap.put(name, new Enclosure(size));
    }

    public void addEnclosure(String name) throws ZooFullEnclosuresException {
        if(enclosureMap.size()>enclosuresMaxCount)
            throw new ZooFullEnclosuresException("Zoo is full");
        else enclosureMap.put(name, new Enclosure());
    }


    public void addAnimal(String enclosureName, Animal animal) throws AnimalDuplicateException,
            EnclosureSizeException, EnclosureNotFoundException {
        if(!enclosureMap.containsKey(enclosureName))
            throw new EnclosureNotFoundException("Enclosure with name :" + enclosureName + " does not exists");
        for(Map.Entry<String, Enclosure> entry:enclosureMap.entrySet()) {
            if(entry.getValue().contains(animal))
                throw new AnimalDuplicateException("This animal is already in enclosure with name <<" + enclosureName +">>");
        }
        enclosureMap.get(enclosureName).addNewAnimal(animal);
    }
    public void printEnclosuresInfo() {
        for(var entry : enclosureMap.entrySet())    {
            System.out.println("Enclosure " + entry.getKey() );
            entry.getValue().printAllAnimals();
        }
    }
}
