package EjerDDRArrays;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class sumaPositivos {

    public static void main(String[] args) {
        /**
         * CLASE SCANNER PARA PEDIR POR TECLADO AL USUARIO.
         */
        Scanner input = new Scanner(System.in);

        /**
         * ESTABLECEMOS LAS VARIABLES CORRESPONDIENTES.
         */
        int numero, pos, neg, sumaPos, sumaNeg;

        /**
         * PEDIMOS EL TAMAÑO DEL ARRAY, QUE SERÁ 10.
         */
        System.out.print("Dame el tamaño del array: ");
        numero = input.nextInt();

        int[] array = new int[numero];

        rellenaArray(array);

        sumaPosNeg(array);
    }

    public static void rellenaArray(int[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("El valor del array " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static void sumaPosNeg(int[] array) {
        int sumaPos = 0, sumaNeg = 0, pos = 0, neg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumaPos += array[i];
                pos++;
            } else if (array[i] < 0) {
                sumaNeg += array[i];
                neg++;
            }
        }
        if (pos != 0) {
            System.out.println("La media de los positivos es: " + sumaPos / pos);
        }
        if (neg != 0) {
            System.out.println("La media de los negativos es: " + sumaNeg / neg);
        }
    }
}
