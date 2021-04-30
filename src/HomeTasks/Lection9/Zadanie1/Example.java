package HomeTasks.Lection9.Zadanie1;

import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        DecimalSequence2 mySequence2 = new DecimalSequence2(-12345678);


        for(Iterator<Integer> iterator = mySequence2.iterator();iterator.hasNext();)
            System.out.print(iterator.next()+", ");
    }
}
