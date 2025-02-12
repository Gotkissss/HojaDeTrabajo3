import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class LectorDatosTest {
    @Test
    void testLectorDatos() {
        String archivo = "test.txt";
        try (java.io.PrintWriter writer = new java.io.PrintWriter(archivo)) {
            writer.println("3\n1\n4\n1\n5\n9");
        } catch (Exception e) {
            fail("Error al escribir archivo de prueba");
        }
        int[] datos = LectorDatos.cargarDatos(archivo);
        int[] esperado = {3, 1, 4, 1, 5, 9};
        assertArrayEquals(esperado, datos);
        new java.io.File(archivo).delete();
    }
}