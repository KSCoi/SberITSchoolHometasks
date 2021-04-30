package HomeTasks.Lection9.Zadanie2;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class SpiralMatrix implements Iterable<Integer> {
    private final int row;
    private final int col;
    private int matrix [][];

    public SpiralMatrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }
    public void randMatrix()    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]= ThreadLocalRandom.current().nextInt(1,9);
            }
        }
    }
    public void printMatrix()   {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void setMatrix() {
        int k=1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=k++;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SpiralMatrixIterator();
    }
    public class SpiralMatrixIterator implements Iterator<Integer>  {

        int currentRow=-1;
        int currentCol=0;
        int steps;

        int colTmp= col;
        int rowTmp=row;


        @Override
        public boolean hasNext() {
            if(steps>=col*row)
                return false;
            steps++;
            if(currentRow<rowTmp-1 && currentCol ==col-colTmp)    {
            currentRow++;
            return true;
            }
            else if (currentCol<colTmp-1 && currentRow==rowTmp-1)    {
            currentCol++;
            return true;
            }
            else if(currentRow > row-rowTmp && currentCol==colTmp-1)   {
            currentRow--;
            return true;
            }
            else if(currentCol<colTmp) {
            currentCol--;
                if(currentCol==col-colTmp+1)   {
                    colTmp--;
                    rowTmp--;
                }
            return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            return matrix[currentRow][currentCol];
        }
    }
}
