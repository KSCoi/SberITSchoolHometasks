package HomeTasks.Lection8.Zadanie1;

import HomeTasks.Lection8.Zadanie2.IntegerDigits;

import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
    testMyIntegerDecimal();


    }
    public static void testMyIntegerDecimal()   {
        MyIntegerDecimal int1 = new MyIntegerDecimal(12);
        MyIntegerDecimal int2 = new MyIntegerDecimal(123);
        MyIntegerDecimal int3 = new MyIntegerDecimal(1234);
        MyIntegerDecimal int4 = new MyIntegerDecimal(-1234);
        MyIntegerDecimal int5 = new MyIntegerDecimal(21);
        MyIntegerDecimal int6 = new MyIntegerDecimal(123);
        MyIntegerDecimal int7 = new MyIntegerDecimal(1568);

        TreeSet<MyIntegerDecimal> set = new TreeSet<>();
        set.add(int1);
        set.add(int2);
        set.add(int3);
        set.add(int4);
        set.add(int5);
        set.add(int6);
        set.add(int7);

        System.out.println("MyIntegerDifferentDigitsOrder sorted:");
        for (var elem : set) {
            System.out.print(elem + "-> different digit(s): ");
            elem.printDigits();
        }

    }


}
