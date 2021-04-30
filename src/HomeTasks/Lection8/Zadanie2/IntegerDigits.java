package HomeTasks.Lection8.Zadanie2;

import java.util.ArrayList;

/*ДЗ 7 (Comparator):
1. Создать класс целых чисел MyInteger с порядком на основе количества простых делителей.
Покажите на примере 4-5 чисел.
*/
public class IntegerDigits implements Comparable<IntegerDigits>{
    private int integer;

    public IntegerDigits(int integer) {
        this.integer = integer;
    }

    public void printPrimeFactors() {
        for (var e : factorize()) {
            System.out.printf(e + " ");
        }
    }

    public ArrayList<Integer> factorize() {
        var primeFactors = new ArrayList<Integer>();
        int tmp = Math.abs(integer);
        int count;
        for (int i = 2; i<=tmp ; i++) {
            count=0;
            while (tmp%i==0)    {
                primeFactors.add(i);
                tmp/=i;
                count++;
            }
            if(count==0)
                continue;

        }
        return primeFactors;

    }

    @Override
    public int compareTo(IntegerDigits o) {
        int result = Integer.compare(this.factorize().size(), o.factorize().size());
        if(result == 0)
            return Integer.compare(this.integer,o.integer);
        return result;
    }

    @Override
    public String toString() {
        return Integer.toString(integer);
    }
}

