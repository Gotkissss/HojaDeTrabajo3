import java.io.*;
import java.util.*;

public class CreadorDatos {
    public static int[] crearDatosAleatorios(int cantidad, int maximo) {
        Random generador = new Random();
        int[] datos = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            datos[i] = generador.nextInt(maximo) + 1;  // Asegura que no haya números negativos
        }
        return datos;
    }

    public static void almacenarDatos(int[] datos, String archivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
            for (int num : datos) {
                escritor.write(num + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}