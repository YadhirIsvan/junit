import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FreeIceCreamTest {

    @Test
    public void testExampleCase() {
        String[] operations = {"+ 10", "- 5", "- 7"};
        long result = getDistressedChildren(operations, 15);
        assertEquals(0, result);  // Un niño insatisfecho por falta de helado.
    }

    @Test
    public void testNoDistress() {
        String[] operations = {"+ 5", "- 2", "+ 3", "- 1"};
        long result = getDistressedChildren(operations, 10);
        assertEquals(0, result);  // No hay niños insatisfechos.
    }

    @Test
    public void testAllDistressed() {
        String[] operations = {"- 3", "- 2", "- 1"};
        long result = getDistressedChildren(operations, 0);
        assertEquals(3, result);  // Todos los niños insatisfechos.
    }

    @Test
    public void testSingleOperation() {
        String[] operations = {"+ 100"};
        long result = getDistressedChildren(operations, 0);
        assertEquals(0, result);  // No hay niños insatisfechos.
    }

    private long getDistressedChildren(String[] operations, long initialIceCream) {
        long x = initialIceCream; // Inventario inicial de helado
        long distressedChildren = 0; // Contador de niños insatisfechos

        // Procesar las operaciones
        for (String operation : operations) {
            char op = operation.charAt(0); // Tipo de operación (+ o -)
            long amount = Long.parseLong(operation.substring(2).trim()); // Cantidad

            if (op == '+') {
                x += amount; // Incrementar inventario
            } else if (op == '-') {
                if (x >= amount) {
                    x -= amount; // Reducir inventario
                } else {
                    distressedChildren++; // Contar niño insatisfecho
                }
            }
        }

        return distressedChildren;
    }
}
