package HomeTasks.Lection11.Zadanie3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FiveFunctionalExamples {
    public static <T,R> List<R> map (List <T> origin, Function<T,R> mapper) {
        var resultList = new ArrayList<R>();
        for( T element : origin)    {
            resultList.add(mapper.apply(element));
        }
        return resultList;
    }

    public static <T> List<T> filter(List<T> origin, Predicate<T> predicate)    {
        Iterator<T> iterator = origin.iterator();
        while (iterator.hasNext())  {
            T element = iterator.next();
            if(!predicate.test(element))    {
                iterator.remove();
            }
        }
        return origin;
    }
    public static <T> T foldLeft(List<T> origin, BinaryOperator<T> binaryOperator)  {
        var result = (T)null;
        Iterator<T> iterator = origin.iterator();
        if(iterator.hasNext())
            result=iterator.next();

        while(iterator.hasNext())   {
            result = binaryOperator.apply(result, iterator.next());
        }

        return result;
    }
    public static <T> T foldRight(List<T> origin, BinaryOperator<T> binaryOperator)  {
        var result = (T) null;
        var iterator = origin.listIterator(origin.size());

        if(iterator.hasPrevious())
            result=iterator.previous();

        while(iterator.hasPrevious())
            result = binaryOperator.apply(result,iterator.previous());

        return result;
    }
    public static <T> void forEach(List<T> origin, Consumer<T> consumer)  {
        for(var elem : origin)  {
            consumer.accept(elem);
        }
    }
    public static <T> long count(List<T> origin, Predicate<T> predicate)  {
        long count = 0;
        for(var el : origin)    {
            if(predicate.test(el))
                count++;
        }
        return count;
    }

    public static <T> void print(List<T> origin)    {
        String s = origin.toString().replaceAll("[\\[.\\]]", "");
        System.out.println(s);
    }
}
