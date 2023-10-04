package main;

// ArrayFlattener.java
public class ArrayFlattener {
    public static int[] flattenArray(int[][] input) {
        if (input == null) {
            return null;
        }

        int totalLength = 0;
        for (int[] array : input) {
            totalLength += array.length;
        }

        int[] result = new int[totalLength];
        int index = 0;
        for (int[] array : input) {
            for (int value : array) {
                result[index++] = value;
            }
        }

        return result;
    }
}
