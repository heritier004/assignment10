package main;

// ArrayReversor.java
public class ArrayReversor {
    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] input) {
        if (input == null) {
            return null;
        }

        int[] flattenedArray = flattenerService.flattenArray(input);
        int length = flattenedArray.length;

        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = flattenedArray[length - i - 1];
        }

        return reversedArray;
    }
}
