package HomeTasks.Lection11.Zadanie2;

import java.util.function.Function;

public interface QuadFunction <T,U,S,V,R> {

    R apply(T t, U u, S s, V v);
}