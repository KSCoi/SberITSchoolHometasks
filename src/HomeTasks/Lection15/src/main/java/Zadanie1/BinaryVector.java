package Zadanie1;

public class BinaryVector {

    public static void main(String[] args) {
        System.out.println(maxOfOneByte(-100011110));
    }
    public static int maxOfOneByte(int a) {
        String s = Integer.toString(a);
        char [] elements = s.toCharArray();

        if(elements[0] == '-')
            elements[0] ='0';

        int max = 0;
        int count = 0;

        for (Character el : elements)    {
            if(!(el=='1' || el=='0'))
                throw new IllegalArgumentException("Illegal Argument");

            if(el == '1')   {
                count++;
                max = max<count? count : max;
            }
            else {
                count = 0;
            }
        }
        return max;
    }
}
