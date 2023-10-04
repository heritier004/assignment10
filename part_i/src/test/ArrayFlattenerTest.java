package test;

// ArrayFlattenerTest.java
import main.ArrayFlattener;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        int[] result = ArrayFlattener.flattenArray(input);

        assertArrayEquals(expectedOutput, result);

        System.out.println("Expected output "+ Arrays.toString(expectedOutput));
        System.out.println("Result "+ Arrays.toString(result));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] input = null;
        assertNull(ArrayFlattener.flattenArray(input));
    }
}
