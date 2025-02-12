import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[] tamanos = {10, 100, 500, 1000, 3000};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultados.csv"))) {
            writer.write("Cantidad,Algoritmo,Tiempo\n"); // Encabezado CSV

            for (int n : tamanos) {
                int[] numeros = CreadorDatos.crearDatosAleatorios(n, 10000);
                CreadorDatos.almacenarDatos(numeros, "datos.txt");
                int[] datos = LectorDatos.cargarDatos("datos.txt");

                Ordenador[] algoritmos = {
                    new OrdenamientoInsercion(),
                    new OrdenamientoMezcla(),
                    new OrdenamientoRapido(),
                    new OrdenamientoRadix(),
                    new OrdenamientoCubetas()
                };

                for (Ordenador algoritmo : algoritmos) {
                    long inicio = System.nanoTime();
                    algoritmo.organizar(datos.clone()); // Usar una copia para cada algoritmo
                    long fin = System.nanoTime();
                    double tiempo = (fin - inicio) / 1e6;

                    writer.write(n + "," + algoritmo.getClass().getSimpleName() + "," + tiempo + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Error escribiendo el archivo CSV: " + e.getMessage());
        }
    }
}
