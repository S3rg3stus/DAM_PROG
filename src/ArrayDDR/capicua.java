package ArrayDDR;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class capicua {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros;

        System.out.print("Indicame el tamaño del array: ");
        numeros = input.nextInt();

        int[] array = new int[numeros];
        int[] aux = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("el valor del array " + i + " es: ");
            array[i] = input.nextInt();
        }
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            aux[j] = array[i];
            System.out.println(aux[j]);
        }

        if (Arrays.equals(array, aux)) {
            System.out.println("Es capicúa.");
        } else {
            System.out.println("No es capicúa.");
        }
    }
}
