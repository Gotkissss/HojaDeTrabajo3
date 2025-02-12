import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = CreadorDatos.crearDatosAleatorios(10, 10000);
        CreadorDatos.almacenarDatos(numeros, "datos.txt");

        int[] datos = LectorDatos.cargarDatos("datos.txt");

        System.out.println("Aplicando algoritmos de ordenamiento...");

        Ordenador[] algoritmos = {
            new OrdenamientoInsercion(),
            new OrdenamientoMezcla(),
            new OrdenamientoRapido(),
            new OrdenamientoRadix(),
            new OrdenamientoCubetas()
        };

        for (Ordenador algoritmo : algoritmos) {
            Temporizador.medirTiempo(algoritmo, datos, algoritmo.getClass().getSimpleName());
        }
    }
}