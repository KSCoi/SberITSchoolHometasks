package HomeTasks.Lection2.Zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var x = in.nextLong();
        ArrayList<Long> var = sequenceOfFibonacci(x);
        ArrayList<Long> b = sequenceOfZeckendorf(x,var);
        b=fill_with_zeros(var,b);
        for (int i = 0; i <var.size() ; i++) {
            if(var.get(i)>b.get(i))
                System.out.print("0");
            else
                System.out.print("1");
        }

    }

    public static ArrayList<Long> sequenceOfFibonacci(long x)
    {
        ArrayList<Long> tmpArray = new ArrayList<>();
        long max =1;
        long previous = 0;
        while(x-max>=0)
        {
            long tmp=max;
            max +=previous;
            previous=tmp;
            tmpArray.add(max-(max-previous));
        }
        tmpArray.remove(0);
        Collections.reverse(tmpArray);
       return tmpArray;
    }
    public static ArrayList<Long> sequenceOfZeckendorf(long x,ArrayList<Long> Fibonacci)
    {
        ArrayList<Long> tmp = new ArrayList<>();
        long max = Fibonacci.get(0);
        while (x>0)
        {
            if(x>=max){
                tmp.add(max);
            }
            else {
                tmp.add(0L);
            }
            x=x-max;
            max=maxofFibonacchi(x);

        }

        return tmp;
    }
        public static long maxofFibonacchi(long x)
    {
        long max =1;
        long previous = 0;
        while(x-max>=0)
        {
            long tmp=max;
            max +=previous;
            previous=tmp;

        }
        return max-(max-previous);
    }
    public static ArrayList<Long> fill_with_zeros(ArrayList<Long> a, ArrayList<Long> b) {
        // ArrayList<Long> tmp = new ArrayList<>(a.size());
        try {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    b.add(i+1,b.get(i));
                    b.set(i, 0L);
                }
            }
        }
        catch (IndexOutOfBoundsException e)
        {
            while(a.size()!=b.size())
                b.add(0L);
        }
        return b;
    }
}



