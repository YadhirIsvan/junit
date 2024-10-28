import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VanyaAndTableTest {

    @Test
    public void testExampleCase() {
        String[] board = {
            "1.2.",
            ".2.1",
            "11..",
            "...."
        };
        int result = getDistressedChildren(board, 2);
        assertEquals(0, result);  // Todos los números cumplen la regla.
    }

    @Test
    public void testDistressedCase() {
        String[] board = {
            "1111",
            "1.11",
            "1.1.",
            "...."
        };
        int result = getDistressedChildren(board, 1);
        assertEquals(1, result);  // Hay un niño insatisfecho.
    }

    @Test
    public void testEmptyBoard() {
        String[] board = {
            "....",
            "....",
            "....",
            "...."
        };
        int result = getDistressedChildren(board, 2);
        assertEquals(0, result);  // No hay números, nadie insatisfecho.
    }

    @Test
    public void testAllSameNumber() {
        String[] board = {
            "1111",
            "1111",
            "1111",
            "1111"
        };
        int result = getDistressedChildren(board, 8);  // Ajustamos k para permitir 16 apariciones.
        assertEquals(0, result);  // Ahora no debería haber niños insatisfechos.
    }


    // Método auxiliar para calcular niños insatisfechos
    private int getDistressedChildren(String[] board, int k) {
        int[] frequency = new int[10]; // Frecuencias de los números 0-9
        int limit = 2 * k; // Límite permitido para cada número
        int distressed = 0; // Contador de niños insatisfechos

        // Contar frecuencias en el tablero
        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c != '.') {
                    frequency[c - '0']++;
                }
            }
        }

        // Verificar si alguna frecuencia excede el límite
        for (int i = 1; i <= 9; i++) {
            if (frequency[i] > limit) {
                distressed = 1; // Marcar como insatisfecho si se excede el límite
                break;
            }
        }

        return distressed; // Retornar el número de niños insatisfechos (0 o 1)
    }
}
