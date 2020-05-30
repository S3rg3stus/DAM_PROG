package ArrayDDR;

/**
 *
 * @author sergioyana
 */
public class arrayAleatorio {

    public static void main(String[] args) {
        int[] array = new int[10];
        int minimo, maximo;
        minimo = 0;
        maximo = 5;
        rellenaArray(array, minimo, maximo);
        mostrarArray(array);
    }

    public static int numeroAleatorio(int maximo, int minimo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }

    public static void rellenaArray(int[] array, int maximo, int minimo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio(maximo, minimo);
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
