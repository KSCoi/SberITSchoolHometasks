package HomeTasks.Lection8.Zadanie2;

import java.util.TreeSet;

public class Example {

    public static void main(String[] args) {
        testMyIntegerDigits();

    }

    public static void testMyIntegerDigits()    {
        IntegerDigits int1 = new IntegerDigits(12);
        IntegerDigits int2 = new IntegerDigits(123);
        IntegerDigits int3 = new IntegerDigits(1234);
        IntegerDigits int4 = new IntegerDigits(-1234);
        IntegerDigits int5 = new IntegerDigits(21);
        IntegerDigits int6 = new IntegerDigits(123);
        IntegerDigits int7 = new IntegerDigits(1568);

        TreeSet<IntegerDigits> set = new TreeSet<>();
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
            elem.printPrimeFactors();
            System.out.println();
        }

    }
}
