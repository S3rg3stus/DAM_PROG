package ArrayDDR;

import java.util.Arrays;
import java.util.Scanner;

/**
 * RELLENAR UN ARRAY DE NÚMEROS USANDO EL MÉTODO FILL DE ARRAYS.
 *
 * @author sergioyana
 */
public class metodoFill {

    public static void main(String[] args) {
        /**
         * PEDIMOS CLASE PARA INTRODUCIR DATOS POR TECLADO
         */
        Scanner input = new Scanner(System.in);

        /**
         * INTRODUCIMOS VARIABLES.
         */
        int numeros;

        /**
         * PEDIMOS EL TAMANHO DEL ARRAY POR TECLADO
         */
        System.out.print("Marca el tamaño del array: ");
        numeros = input.nextInt();

        /**
         * INICIALIZAMOS EL ARRAY.
         */
        int[] array = new int[numeros];

        /**
         * LLAMAMOS AL MÉTODO FILL PARA RELLENAR CON EL VALOR INTRODUCIDO.
         */
        Arrays.fill(array, numeros);

        /**
         * VOLVEMOS A HACER UNA LLAMADA AL MÉTODO FILL.
         */
        Arrays.fill(array, 3, 5, 8);

        /**
         * HACEMOS LA LLAMADA AL MÉTODO MUESTRAARRAY PARA MOSTRARLA.
         */
        muestraArray(array);

    }

    /**
     * Recorremos el array
     *
     * @param array
     */
    public static void recorreArray(int[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("El valor " + i + "del array: ");
            array[i] = input.nextInt();
        }
    }

    /**
     * Mostramos el array
     *
     * @param array
     */
    public static void muestraArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
