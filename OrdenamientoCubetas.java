import java.util.*;

public class OrdenamientoCubetas implements Ordenador
{
    public void organizar(int[] elementos)
    {
        if (elementos.length == 0) return;

        int valorMaximo = Arrays.stream(elementos).max().getAsInt();
        int numCubetas = (int) Math.ceil(Math.sqrt(elementos.length));
        List<Integer>[] cubetas = new ArrayList[numCubetas];

        for (int i = 0; i < numCubetas; i++)
        {
            cubetas[i] = new ArrayList<>();
        }

        for (int valor : elementos)
        {
            int indiceCubeta = (valor * numCubetas) / (valorMaximo + 1);
            cubetas[indiceCubeta].add(valor);
        }

        int indice = 0;
        for (List<Integer> cubeta : cubetas)
        {
            Collections.sort(cubeta);
            for (int valor : cubeta)
            {
                elementos[indice++] = valor;
            }
        }
    }
}