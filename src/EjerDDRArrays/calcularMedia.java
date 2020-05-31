package EjerDDRArrays;

import java.util.Scanner;

/**
 * Calcula la media de una serie de números que se leen por teclado.
 * @author sergioyana
 */
public class calcularMedia {

    public static void main(String[] args) {
        
        /**
         * CREAMOS LA CLASE PARA INTRODUCIR POR TECLADO EL TAMAÑO DEL ARRAY
         */
        Scanner input = new Scanner(System.in);

        /**
         * ESTABLECEMOS LAS VARIABLES QUE CORRESPONDEN.
         */
        int numeros;

        /**
         * PEDIMOS POR TECLADO EL TAMAÑO DEL ARRAY.
         */
        System.out.print("Introduce el tamaño del array: ");
        numeros = input.nextInt();

        /**
         * INICIALIZAMOS EL ARRAY ESTABLECEMOS EL TAMAÑO.
         */
        int[] array = new int[numeros];

        /**
         * LLAMAMOS AL MÉTODO PARA RELLENAR EL ARRAY.
         */
        rellenaArray(array);

        mediaArray(array);
    }

    /**
     * CREAMOS MÉTODO PARA RECORRER ARRAY
     *
     * @param array
     */
    public static void rellenaArray(int[] array) {
        /**
         * CREAMOS LA CLASE PARA PEDIR LOS VALORES DEL ARRAY POR TECLADO
         */
        Scanner input = new Scanner(System.in);

        /**
         * BUCLE PARA RECORRER EL ARRAY.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posición " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    /**
     * METODO PARA HALLAR LA MEDIA.
     * @param array 
     */
    public static void mediaArray(int[] array) {
        int suma = 0, media;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        media = suma / array.length;

        System.out.println("La media del array es: " + media);
    }
}
