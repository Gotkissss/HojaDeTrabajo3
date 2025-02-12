public class OrdenamientoInsercion implements Ordenador
{
    public void organizar(int[] elementos)
    {
        for (int i = 1; i < elementos.length; i++)
        {
            int valorActual = elementos[i];
            int j = i - 1;
            while (j >= 0 && elementos[j] > valorActual)
            {
                elementos[j + 1] = elementos[j];
                j--;
            }
            elementos[j + 1] = valorActual;
        }
    }
}