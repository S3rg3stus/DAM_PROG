package EjerDDRArrays;

import java.util.Scanner;

/**
 * 1.) Crea un array de 10 posiciones con valores pedidos por teclado. Muestra
 * por consola el indice y el valor al que corresponde. Haz dos métodos, uno
 * para rellenar valores y otro para mostrar.
 *
 * @author sergioyana
 */
public class Ejerc01 {

    public static void main(String[] args) {

        int[] array = new int[10];
        rellenaArray(array);
        muestraArray(array);
    }

    public static void rellenaArray(int[] array) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("El valor " + i + " del array es: ");
            array[i] = input.nextInt();
        }
    }

    public static void muestraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
