import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class OrdenamientoRadixTest {
    @Test
    void testOrdenamientoRadix() {
        int[] datos = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] esperado = {2, 24, 45, 66, 75, 90, 170, 802};
        OrdenamientoRadix sorter = new OrdenamientoRadix();
        sorter.organizar(datos);
        assertArrayEquals(esperado, datos);
    }
}