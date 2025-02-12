import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class OrdenamientoCubetasTest {
    @Test
    void testOrdenamientoCubetas() {
        int[] datos = {5, 3, 8, 1, 2};
        int[] esperado = {1, 2, 3, 5, 8};
        OrdenamientoCubetas sorter = new OrdenamientoCubetas();
        sorter.organizar(datos);
        assertArrayEquals(esperado, datos);
    }
}

