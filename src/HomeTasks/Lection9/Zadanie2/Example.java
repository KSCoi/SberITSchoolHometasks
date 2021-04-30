package HomeTasks.Lection9.Zadanie2;

import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
    SpiralMatrix aMatrix = new SpiralMatrix(5,5);
    aMatrix.randMatrix();
    aMatrix.printMatrix();
        for(var el : aMatrix)
            System.out.print(el + " ");
        System.out.println();

    SpiralMatrix bMatrix = new SpiralMatrix(2,5);
    bMatrix.randMatrix();
    bMatrix.printMatrix();
    for(var el: bMatrix)
        System.out.print(el + " ");
        System.out.println();

    SpiralMatrix cMatrix = new SpiralMatrix(5,3);
    cMatrix.randMatrix();
    cMatrix.printMatrix();
    for(var el : cMatrix)
        System.out.print(el + " ");
    }



}
