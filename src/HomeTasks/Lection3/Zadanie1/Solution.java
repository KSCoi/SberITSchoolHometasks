package HomeTasks.Lection3.Zadanie1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void printSpaces(int length){
        for (int i = 0; i < length - 2; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter width");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Enter word: ");
        String work = reader.readLine();
        if (a <= (work.length() + 3) || b < 3){
            System.out.printf("Inappropriate length/width");
        }
        else{
            for (int i = 0; i <b ; i++) {
                for (int j = 0; j <a ; j++) {
                    if(i==0 || i==b-1)//первая и последняя строки это просто "*"
                        System.out.printf("*");
                    else if(i==b/2-(b-1)%2)//Проверка на середину рамки, если середина, то надо писать слово
                    {
                        System.out.printf("* ");
                        printSpaces((a-work.length())/2+(a-work.length())%2);
                        if((a-work.length())%2==0){
                            System.out.printf(work+" ");}
                        else if((a-work.length()) % 2==1)
                            System.out.printf(work);
                        printSpaces((a-work.length())/2+(a-work.length())%2);
                        System.out.printf("*");
                        break;
                    }
                    else {
                        System.out.printf("*");
                        printSpaces(a);
                        System.out.printf("*");
                        break;

                    }
                }
                System.out.println();
            }
        }
    }
}

