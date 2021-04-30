package HomeTasks.Lection8.Zadanie3;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        CircularBuffer myBuffer = new CircularBuffer();

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            myBuffer.operateWithBuffer(sc.nextLine());
        }

    }


}