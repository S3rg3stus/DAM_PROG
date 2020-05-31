package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class longitud {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Dame el tamaño del array: ");
        numero = input.nextInt();

        int[] array = new int[numero];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduzca numero entre 0 y 10: ");
            do {
                array[i] = input.nextInt();

                if (!(array[i] >= 0 && array[i] <= 10)) {
                    System.out.println("Error, debe ser un numero etre 0 y 10.");
                    System.out.print("Introduzca numero entre 0 y 10: ");
                }
            } while (!(array[i] >= 0 && array[i] <= 10));
        }
        System.out.println("====================");
        System.out.println("Los número correctos son: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
