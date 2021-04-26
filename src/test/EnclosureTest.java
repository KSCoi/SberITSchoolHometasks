package test;

import com.zoo.animal.cat.Cat;
import com.zoo.animal.eagle.Eagle;
import com.zoo.animal.seal.Seal;
import com.zoo.enclosure.Enclosure;
import com.zoo.exception.AnimalDuplicateException;
import com.zoo.exception.EnclosureSizeException;

public class EnclosureTest {
    public void test(){
        /* TESTING ENCLOSURES*/
        Enclosure enclosure = new Enclosure();
        Cat cat = new Cat("Cat1", 10);
        Eagle eagle = new Eagle("eagle1",3);
        Seal seal = new Seal("seal1",15);
        enclosure.addNewAnimal(cat);
        enclosure.addNewAnimal(eagle);
        enclosure.addNewAnimal(seal);

        enclosure.printAllAnimals();

        enclosure.removeAnimal(eagle);

        enclosure.printAllAnimals();

        Enclosure enclosure2 = new Enclosure(2);
        try {
            enclosure2.addNewAnimal(seal);
            enclosure2.addNewAnimal(cat);
            enclosure2.addNewAnimal(eagle);
        }
        catch (EnclosureSizeException e){
            System.out.println(e.getMessage());
        }

        Enclosure enclosure3 = new Enclosure();
        try{
            enclosure3.addNewAnimal(seal);
            enclosure3.addNewAnimal(seal);
        }
        catch (AnimalDuplicateException e){
            System.out.println(e.getMessage());
        }
    }
}
