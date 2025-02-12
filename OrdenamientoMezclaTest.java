import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class OrdenamientoMezclaTest {
    @Test
    void testOrdenamientoMezcla() {
        int[] datos = {12, 4, 7, 2, 10};
        int[] esperado = {2, 4, 7, 10, 12};
        OrdenamientoMezcla sorter = new OrdenamientoMezcla();
        sorter.organizar(datos);
        assertArrayEquals(esperado, datos);
    }
}