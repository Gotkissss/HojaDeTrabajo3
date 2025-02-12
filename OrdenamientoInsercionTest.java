import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class OrdenamientoInsercionTest {
    @Test
    void testOrdenamientoInsercion() {
        int[] datos = {9, 7, 5, 3, 1};
        int[] esperado = {1, 3, 5, 7, 9};
        OrdenamientoInsercion sorter = new OrdenamientoInsercion();
        sorter.organizar(datos);
        assertArrayEquals(esperado, datos);
    }
