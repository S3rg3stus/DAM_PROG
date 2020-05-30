package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class numeroInvertido {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Declara el tamaño del array: ");
        numero = input.nextInt();

        int[] array = new int[numero];
        int aux[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("El valor de " + i + " es: ");
            array[i] = input.nextInt();
        }
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            aux[j] = array[i];
            System.out.println(aux[j]);
        }
    }
}
