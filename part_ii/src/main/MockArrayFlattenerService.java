package main;

public class MockArrayFlattenerService implements ArrayFlattenerService {
    @Override
    public int[] flattenArray(int[][] input) {
        // A simple mock implementation that flattens the array by concatenating all elements
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
