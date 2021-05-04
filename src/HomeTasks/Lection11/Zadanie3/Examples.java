package HomeTasks.Lection11.Zadanie3;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        var list2 = new ArrayList<String>();
        for (int i = -5; i < 6; i++) {
            list.add(i);
            list2.add(i+"");
        }
        System.out.println("COUNT");
        System.out.println(FiveFunctionalExamples.count(list, a->a%2==0));

        System.out.println("FILTER");
        Predicate<Integer> predicate = a -> a%2==0;
        FiveFunctionalExamples.print(FiveFunctionalExamples.filter(list,predicate));


        System.out.println("MAP");
        Function<String, Integer> plusFive = a -> Integer.valueOf(a)+5;
        FiveFunctionalExamples.print(FiveFunctionalExamples.map(list2, plusFive));
        System.out.println("ForEach");
        FiveFunctionalExamples.forEach(FiveFunctionalExamples.map(list2,plusFive),System.out::println);

        System.out.println("foldLeft");
        BinaryOperator<Integer> binaryOperator = (a,b) -> a-b;
        System.out.println(FiveFunctionalExamples.foldLeft(list,binaryOperator));
        System.out.println("foldRight");
        System.out.println(FiveFunctionalExamples.foldRight(list,binaryOperator));
    }
}
