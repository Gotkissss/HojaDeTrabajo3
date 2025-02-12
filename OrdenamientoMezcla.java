import java.util.Arrays;

public class OrdenamientoMezcla implements Ordenador {
    public void organizar(int[] elementos) {
        dividirYMezclar(elementos, 0, elementos.length - 1);
    }

    private void dividirYMezclar(int[] elementos, int inicio, int fin) {
        if (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            dividirYMezclar(elementos, inicio, medio);
            dividirYMezclar(elementos, medio + 1, fin);
            mezclar(elementos, inicio, medio, fin);
        }
    }

    private void mezclar(int[] elementos, int inicio, int medio, int fin) {
        int[] temp = Arrays.copyOfRange(elementos, inicio, fin + 1);
        int i = 0, j = medio - inicio + 1, k = inicio;

        while (i <= medio - inicio && j <= fin - inicio) {
            if (temp[i] <= temp[j]) {
                elementos[k++] = temp[i++];
            } else {
                elementos[k++] = temp[j++];
            }
        }

        while (i <= medio - inicio) {
            elementos[k++] = temp[i++];
        }
    }
}