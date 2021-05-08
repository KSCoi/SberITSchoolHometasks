package HomeTasks.Lection12.Zadanie2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class AverageWeight {
    static Map<String,Double> map = new HashMap<>();
    static {
        map.put("Kostya", 69.0);
        map.put("Dream",75.0);
        map.put("Femen",150.0);
    }

    public static void main(String[] args) {
        System.out.println(averageWeight(map).get());
    }
    static Optional<Double> averageWeight(Map<String ,Double> map)  {
        if(map.isEmpty() || map.equals(null))
            return Optional.empty();
        return Optional.of(map.entrySet().stream().map(a->a.getValue()).reduce(0d,(a,b)->a+b/map.size()));
    }
}
