package HomeTasks.Lection12.Zadanie2;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntersectOfList {
    static List<Long> list1  = Arrays.asList(123L,145L,167L,189L,123L,123L);
    static List<Long> list2 = Arrays.asList(123L,145L,167L,180L, 189L,123L);

    public static void main(String[] args) {
        ArrayList<Long> tmp = new ArrayList(list2);
        List<Long> intersect = list1.stream()
                .filter(a-> {
                    boolean c = tmp.contains(a);
                    if(c)
                        tmp.remove(a);
                    return c;})
                .collect(Collectors.toList());
        intersect.stream().forEach(System.out::println);
    }



}
