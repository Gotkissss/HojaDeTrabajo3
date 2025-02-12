import java.io.*;
import java.util.*;

public class LectorDatos {
    public static int[] cargarDatos(String archivo) {
        List<Integer> lista = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lista.add(Integer.parseInt(linea));
            }
        } catch (IOException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        return lista.stream().mapToInt(i -> i).toArray();
    }
}