import java.util.Arrays;

public class OrdenamientoRadix implements Ordenador {
    public void organizar(int[] elementos) {
        int maximo = obtenerMaximo(elementos);
        for (int exp = 1; maximo / exp > 0; exp *= 10) {
            distribuirPorCifra(elementos, exp);
        }
    }

    private int obtenerMaximo(int[] elementos) {
        return Arrays.stream(elementos).max().orElse(0);
    }

    private void distribuirPorCifra(int[] elementos, int exp) {
        int longitud = elementos.length;
        int[] resultado = new int[longitud];
        int[] frecuencia = new int[10];

        for (int num : elementos) {
            frecuencia[(num / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            frecuencia[i] += frecuencia[i - 1];
        }

        for (int i = longitud - 1; i >= 0; i--) {
            int indice = (elementos[i] / exp) % 10;
            resultado[frecuencia[indice] - 1] = elementos[i];
            frecuencia[indice]--;
        }

        System.arraycopy(resultado, 0, elementos, 0, longitud);
    }
}