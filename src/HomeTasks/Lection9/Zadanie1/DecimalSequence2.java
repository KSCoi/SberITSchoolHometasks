package HomeTasks.Lection9.Zadanie1;

import java.util.Iterator;


public class DecimalSequence2 implements Iterable<Integer> {
    public Integer number;

    public DecimalSequence2(Integer number) {
        this.number = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new DigitIterator();
    }

    public class DigitIterator implements Iterator<Integer> {
        private int orderOfCurrentDigit;

        public DigitIterator() {
            orderOfCurrentDigit = 0;
        }

        @Override
        public boolean hasNext() {
            int digitsOfCurrentInt = 0;
            for (int i = Math.abs(number); i >= 1;) {
                i /= 10;
                digitsOfCurrentInt++;
            }

                if (orderOfCurrentDigit < digitsOfCurrentInt) {
                    orderOfCurrentDigit++;
                    return true;
                }
                else {
                    orderOfCurrentDigit = 0;
                }
            return false;
        }

        @Override
        public Integer next() {
            return (int)((Math.abs(number)/Math.pow(10,orderOfCurrentDigit-1))%10);
        }
    }
}