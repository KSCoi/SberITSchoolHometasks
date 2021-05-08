package HomeTasks.Lection12.Zadanie1;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PosStream {
    public static void main(String[] args) {
        Stream<Integer> infStream = Stream.generate(()-> (int)(Math.random()*200-100));
        Set<Integer> set = infStream.filter(x->x%2==1 && x>0)
                .map(x->x*2)
                .peek(x-> System.out.print(x+" "))
                .limit(15)
                .collect(Collectors.toSet());
        System.out.println();
        System.out.println(set);

        System.out.println(set.stream().reduce(0, (a,b)->(a+b)));
    }
}
