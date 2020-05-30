package ArrayDDR;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 12.) Ordena un arrays de números con sort Arrays.
 *
 * @author sergioyana
 */
public class metodoSort {

    public static void main(String[] args) {
        /**
         * INTRODUCIMOS LOS DATOS POR TECLADO.
         */
        Scanner input = new Scanner(System.in);

        /**
         * INTRODUCIMOS VARIABLES QUE NOS PUDIERAN HACER FALTA.
         */
        int numeros;

        /**
         * PEDIMOS EL TAMAÑO DEL ARRAY.
         */
        System.out.print("Introduce el tamaño del array: ");
        numeros = input.nextInt();

        /**
         * INSTANCIAMOS EL ARRAY.
         */
        int[] array = new int[numeros];

        /**
         * PEDIMOS LOS DATOS DEL ARRAY.
         */
        recorreArray(array);

        /**
         * ORDENAMOS EL ARRAY CON EL SORT
         */
        Arrays.sort(array);

        /**
         * MOSTRAMOS EL ARRAY
         */
        muestraArray(array);
    }

    /**
     * RECORREMOS EL ARRAY.
     * @param array 
     */
    public static void recorreArray(int[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    /**
     * METODO PARA MOSTRARLO.
     * @param array 
     */
    public static void muestraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
