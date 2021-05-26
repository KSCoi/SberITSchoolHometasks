package Zadanie1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BinaryVectorTest {
    @Test
    public void testVectorOfZeros()throws Exception {
        int a = BinaryVector.maxOfOneByte(0000);
        Assertions.assertEquals(0, a);
    }
    @Test
    public void testVectorOfOne()throws Exception {
        int a = BinaryVector.maxOfOneByte(1111);
        Assertions.assertEquals(4, a);
    }

    @Test
    public void testVectorWithSize10() throws Exception {
        int a = BinaryVector.maxOfOneByte(1010001100);
        Assertions.assertEquals(2, a);
    }
    @Test
    public void testVector()    {
        int a = BinaryVector.maxOfOneByte(1011110111);
        Assertions.assertEquals(4,a);
    }
    @Test
    public void testNegativeVector()    {
        int a = BinaryVector.maxOfOneByte(-100011110);
        Assertions.assertEquals(4,a);
    }
    @Test
    public void exceptionTest()     {
        Exception thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> BinaryVector.maxOfOneByte(123456),
                "Throws");
        Assertions.assertEquals("Illegal Argument",thrown.getMessage());
    }

}
