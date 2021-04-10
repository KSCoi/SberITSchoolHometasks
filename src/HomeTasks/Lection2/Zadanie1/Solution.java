package HomeTasks.Lection2.Zadanie1;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var k = scanner.nextLong();
        int capacity = digitCapacity(k);
        int tmp = capacity-1;
        while (tmp>0)
            k-=function(tmp--); //отнимаем количество всех символов меньшего порядка
        long number1 = getNum(capacity, k);//
        System.out.println(number1);
        System.out.println(getDigit(number1, capacity, k));

    }
    public static int getDigit(long number, long capacity, long k) // функция получения цифры лежащей на k-ой позиции числа number поряка capacity
    {
        long digitNumber =k%capacity;
        digitNumber = capacity - digitNumber-1; //определяем порядок цифры в числе number
        for (long i = 0; i <digitNumber ; i++) { //делим число до данного порядка
            number/=10;
        }
        return (int)(number%10); // возвращаем цифру
    }
    public static long getNum(int capacity,long k)//функция вычисления числа порядка capacity, лежащего на k-ой позиции
    {
        return power(10,capacity-1)+k/capacity; //прибавляем к минимальному числу порядка capacity искомое число.
                                                     // k/capacity это количество чисел от минимального до искомого
    }

    public static int digitCapacity(long k) // функция подсчета порядка k-го символа бесконечной строки
    {
        int capacity=1;
        long funct = 0;
        while(true)
        {
            funct+=function(capacity);
            if(k-funct<0)
                break;
            capacity++;
        }
        return capacity;
    }

    public static long function(int n) // функция расчета максимального количества символов в числе состоящем из n цифр.
    {
        long result;
        result=9*n*power(10,n-1);
        return result;
    }
    public static long power(int a,int b)//функция возведения в степень
    {
        long result =1;
        for (int i = 0; i < b; i++) {
            result*=a;
        }
        return result;
    }
}
