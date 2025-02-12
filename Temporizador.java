import java.util.Arrays;

public class Temporizador {
    public static void medirTiempo(Ordenador algoritmo, int[] datos, String nombre) {
        int[] copia = Arrays.copyOf(datos, datos.length);
        long inicio = System.nanoTime();
        algoritmo.organizar(copia);
        long fin = System.nanoTime();
        double tiempo = (fin - inicio) / 1e6; // Convertir a milisegundos

        System.out.printf("%s tomó %.3f ms.%n", nombre, tiempo);
    }
}

