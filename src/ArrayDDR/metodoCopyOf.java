package ArrayDDR;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 10.) CREA DOS ARRAYS, RELLENAR UNO CON NÚMEROS Y COPIARLO AL OTRO USANDO
 * COPYOF DE ARRAYS.
 *
 * @author sergioyana
 */
public class metodoCopyOf {

    public static void main(String[] args) {
        /**
         * CREAMOS LA CLASE PARA INTRODUCIR POR TECLADO.
         */
        Scanner input = new Scanner(System.in);

        /**
         * INTRODUCIMOS LAS VARIABLES QUE NECESITAMOS.
         */
        int numeros;

        /**
         * CREAMOS LA LLAMADA POR TECLADO.
         */
        System.out.print("Introduce el tamaño del array: ");
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
         * LLAMAMOS AL MÉTODO COPYOF PARA COPIAR CON EL VALOR INTRODUCIDO Y AÑADIR CON CEROS.
         */
        int[] array2 = Arrays.copyOf(array, 6);

        /**
         * HACEMOS LA LLAMADA AL METODO DE MOSTRAR ARRAY.
         */
        muestraArray(array2);
    }

    /**
     * CREAMOS EL MÉTODO QUE RELLENA EL ARRAY.
     *
     * @param array
     */
    public static void rellenaArray(int[] array) {
        /**
         * CREAMOS LA CLASE PARA INTRODUCIR POR TECLADO.
         */
        Scanner input = new Scanner(System.in);

        /**
         * CREAMOS UN BUCLE FOR PARA RECORRER EL ARRAY, PIDIENDO EL DATO POR
         * TECLADO.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor del array " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    /**
     * CREAMOS EL MÉTODO QUE MOSTRAR EL ARRAY.
     *
     * @param array
     */
    public static void muestraArray(int[] array) {

        /**
         * CREAMOS UN BUCLE FOR PARA RECORRER EL ARRAY, PIDIENDO EL DATO POR
         * TECLADO.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
