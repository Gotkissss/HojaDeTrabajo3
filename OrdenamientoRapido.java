public class OrdenamientoRapido implements Ordenador {
    public void organizar(int[] arreglo) {
        ordenarRapido(arreglo, 0, arreglo.length - 1);
    }

    private void ordenarRapido(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = dividir(arreglo, inicio, fin);
            ordenarRapido(arreglo, inicio, indicePivote - 1);
            ordenarRapido(arreglo, indicePivote + 1, fin);
        }
    }

    private int dividir(int[] arreglo, int inicio, int fin) {
        int referencia = arreglo[fin];
        int posicion = inicio;

        for (int i = inicio; i < fin; i++) {
            if (arreglo[i] <= referencia) {
                intercambiar(arreglo, i, posicion);
                posicion++;
            }
        }
        intercambiar(arreglo, posicion, fin);
        return posicion;
    }

    private void intercambiar(int[] arreglo, int i, int j) {
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
}
