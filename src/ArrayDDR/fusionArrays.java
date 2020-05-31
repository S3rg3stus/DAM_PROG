package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class fusionArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Introduce el tamaño del primer array: ");
        numero = input.nextInt();

        int[] array = new int[numero];

        rellenaArray1(array);

        System.out.print("Introduce el tamaño del segundo array: ");
        numero = input.nextInt();

        int[] array2 = new int[numero];

        rellenaArray1(array2);

        recorreArray(array, array2);

        muestraArray(recorreArray(array, array2));
    }

    public static int[] recorreArray(int[] array, int[] array2) {
        int[] fusionArray = new int[array.length + array2.length];

        for (int i = 0; i < array.length; i++) {
            fusionArray[i] = array[i];
        }
        for (int i = array.length, j = 0; i < fusionArray.length; i++, j++) {
            fusionArray[i] = array2[j];
        }
        return fusionArray;
    }

    public static void rellenaArray1(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posición " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static void muestraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
