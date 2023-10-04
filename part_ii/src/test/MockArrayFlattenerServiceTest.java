import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockArrayFlattenerServiceTest {

    @Test
    public void testFlattenArray() {
        // Arrange
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        MockArrayFlattenerService mockFlattenerService = new MockArrayFlattenerService();

        // Act
        int[] result = mockFlattenerService.flattenArray(input);

        // Assert
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testFlattenArrayWithEmptyInput() {
        // Arrange
        int[][] input = {};
        MockArrayFlattenerService mockFlattenerService = new MockArrayFlattenerService();

        // Act
        int[] result = mockFlattenerService.flattenArray(input);

        // Assert
        // Since the input is empty, the result should also be an empty array
        assertArrayEquals(new int[0], result);
    }

    // Add more test cases as needed to cover various scenarios
}
