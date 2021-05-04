package HomeTasks.Lection11.Zadanie2;

public class Example {
    public static void main(String[] args) {
        TriFunction<Integer,Integer,Integer,String> sum= (a,b,c) -> Integer.toString(a+b+c);
        System.out.println(sum.apply(5,6,7));
        QuadFunction<Integer,Integer,Integer,Integer,Boolean> isLesser = (a,b,c,d) -> a*b<c*d;
        System.out.println(isLesser.apply(1,2,3,4));
    }
}
