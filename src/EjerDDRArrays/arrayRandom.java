package EjerDDRArrays;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class arrayRandom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros, minimo = 0, maximo = 8;

        System.out.print("Dame el tamaño del array: ");
        numeros = input.nextInt();

        int[] array = new int[numeros];

        rellenaArray(array, minimo, maximo);
        muestraArray(array);
    }

    public static void rellenaArray(int[] array, int maximo, int minimo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio(maximo, minimo);
        }
    }

    public static void muestraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int numeroAleatorio(int maximo, int minimo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
