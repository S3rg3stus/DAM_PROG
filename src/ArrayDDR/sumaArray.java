package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class sumaArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.print("Establece el tamaño del array: ");
        numero = input.nextInt();

        int[] array = new int[numero];
        establecerValores(array);
        mediaArray(array);
    }

    public static void establecerValores(int[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Establece el valor del indice " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static void mediaArray(int[] array) {

        int suma = 0;
        double media;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("La suma es: " + suma);

        media = (double) suma / array.length;

        System.out.println("La media es: " + media);
    }
}
