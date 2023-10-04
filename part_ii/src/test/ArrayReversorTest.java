package test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {

    @Test
    public void testReverseArrayWithValidInput() {
        // Arrange
        ArrayFlattenerService mockFlattenerService = mock(ArrayFlattenerService.class);
        when(mockFlattenerService.flattenArray(any())).thenReturn(new int[]{1, 3, 0, 4, 5, 9});

        ArrayReversor reversor = new ArrayReversor(mockFlattenerService);

        // Act
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] result = reversor.reverseArray(input);

        // Assert
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        assertArrayEquals(expectedOutput, result);

        // Verify that the flattener service was indeed invoked
        verify(mockFlattenerService).flattenArray(input);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        // Arrange
        ArrayFlattenerService mockFlattenerService = mock(ArrayFlattenerService.class);
        ArrayReversor reversor = new ArrayReversor(mockFlattenerService);

        // Act
        int[][] input = null;
        int[] result = reversor.reverseArray(input);

        // Assert
        assertNull(result);

        // Verify that the flattener service was not invoked for null input
        verify(mockFlattenerService, never()).flattenArray(any());
    }
}
