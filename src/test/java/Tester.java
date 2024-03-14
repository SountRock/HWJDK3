import org.example.Calculator;
import org.example.Pair;
import org.example.PairClass;
import org.example.СompareArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tester {
    @Test
    void testCalculator(){
        Assertions.assertEquals(3.0,Calculator.sum(1.f, 2));
        Assertions.assertEquals(10.0,Calculator.sum(4, 6));
        Assertions.assertEquals(7.0,Calculator.sum(4, 3.0));

        Assertions.assertEquals(-1.0,Calculator.subtract(1.f, 2));
        Assertions.assertEquals(2.0,Calculator.subtract(6, 4));
        Assertions.assertEquals(1.0,Calculator.subtract(4, 3.0));

        Assertions.assertEquals(2.0,Calculator.multiply(1.f, 2));
        Assertions.assertEquals(24.0,Calculator.multiply(6, 4));
        Assertions.assertEquals(12.0,Calculator.multiply(4, 3.0));

        Assertions.assertEquals(4.0,Calculator.divide(8.f, 2));
        Assertions.assertEquals(1.5,Calculator.divide(6, 4));
        Assertions.assertEquals(Double.NaN,Calculator.divide(4, 0.0));
    }

    @Test
    void testCompareArrays(){
        Integer[] arr1 = new Integer[]{2, 424, 5, 6, 8};
        Integer[] arr2 = new Integer[]{2, 424, 5, 6, 8};
        Assertions.assertEquals(true, СompareArrays.compareArrays(arr1, arr2));

        arr2 = new Integer[]{2, 33};
        Assertions.assertEquals(false, СompareArrays.compareArrays(arr1, arr2));

        String[] arr3 = new String[]{"equals", "true"};
        String[] arr4 = new String[]{"equals", "true"};
        Assertions.assertEquals(true, СompareArrays.compareArrays(arr3, arr4));
        Assertions.assertEquals(true, СompareArrays.compareArrays2(arr3, arr4));

        arr4 = new String[]{"equals", "false"};
        Assertions.assertEquals(true, СompareArrays.compareArrays(arr3, arr4));
        Assertions.assertEquals(false, СompareArrays.compareArrays2(arr3, arr4));

        String[] arr7 = new String[]{"31.0", "2.0"};
        Double[] arr8 = new Double[]{31.0, 2.0};
        Assertions.assertEquals(false, СompareArrays.compareArrays(arr8, arr7));
        Assertions.assertEquals(true, СompareArrays.compareArrays2(arr8, arr7));
    }

    @Test
    void testPair(){
        Pair pair = new Pair<>(1111, "second");
        Assertions.assertEquals(1111, pair.first());
        Assertions.assertEquals("second", pair.second());
        System.out.println(pair);

        PairClass pairC = new PairClass<>("222", 23.09);
        Assertions.assertEquals("222", pairC.getFirst());
        Assertions.assertEquals(23.09, pairC.getSecond());
        System.out.println(pairC);
    }

}
