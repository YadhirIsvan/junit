import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KefaAndFirstStepsTest {

    @Test
    public void testExampleCase() {
        int[] arr = {2, 2, 1, 3, 4, 4};
        int result = getLongestSubsequence(arr);
        assertEquals(4, result);  // La subsecuencia más larga es {1, 3, 4, 4}
    }

    @Test
    public void testAllEqualElements() {
        int[] arr = {5, 5, 5, 5};
        int result = getLongestSubsequence(arr);
        assertEquals(4, result);  // Todos los elementos son iguales
    }

    @Test
    public void testStrictlyDecreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        int result = getLongestSubsequence(arr);
        assertEquals(1, result);  // No hay subsecuencia creciente
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        int result = getLongestSubsequence(arr);
        assertEquals(1, result);  // Solo un elemento
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int result = getLongestSubsequence(arr);
        assertEquals(0, result);  // No hay elementos
    }

    // Método auxiliar para probar la funcionalidad del código original
    private int getLongestSubsequence(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
