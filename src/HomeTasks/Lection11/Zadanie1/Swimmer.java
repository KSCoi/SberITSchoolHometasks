package HomeTasks.Lection11.Zadanie1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Swimmer {

     String name;
     int age;

    public Swimmer()    {}

    public Swimmer(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void swim(Consumer<String> c)    {
        c.accept(this.name + " is swimming");
    }

    public static void main(String[] args) {
        Swimmer swimmer1 = new Swimmer("Vladimir", 56);
        swimmer1.swim(System.out::println);

        Supplier<String> c3 = () -> swimmer1.getName();
        System.out.println(c3.get());

        Swimmer swimmer2 = new Swimmer();
        BiConsumer<String,Integer> c2 = (name,age) -> {swimmer2.setName(name);swimmer2.setAge(98);};
        c2.accept("Valera", 92);
        System.out.println("name: " + swimmer2.getName() + ", age: " + swimmer2.getAge());
    }
}
