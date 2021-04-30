package HomeTasks.Lection8.Zadanie1;

/*ДЗ 7 (Comparator):
1. Создать класс целых чисел MyInteger с порядком на основе количества простых делителей.
Покажите на примере 4-5 чисел.
2. Создать класс целых чисел MyInteger с порядком на основе количества различных (!) цифр в десятичном представлении.
Покажите на примере 4-5 чисел.*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyIntegerDecimal implements Comparable<MyIntegerDecimal> {
    private int integer;

    public MyIntegerDecimal(int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }

    private Set<Integer> intToDigitsSet() {
        Set<Integer> digitsSet = new HashSet<>();
        for(char c : Integer.toString(Math.abs(this.integer)).toCharArray())  {
            digitsSet.add(Character.getNumericValue(c));
        }
        return digitsSet;
    }

    public void printDigits() {
        for (var el : intToDigitsSet())
            System.out.print(el + " ");
        System.out.println("");
    }

    @Override
    public int compareTo(MyIntegerDecimal o) {
        int result = Integer.compare(this.intToDigitsSet().size(),o.intToDigitsSet().size());
        if(result==0)
            return Integer.compare(this.integer, o.integer);
        return result;
    }

    @Override
    public String toString() {
        return Integer.toString(integer);
    }
}
