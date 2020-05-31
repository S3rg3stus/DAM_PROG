package ArrayDDR;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 11.) Indica si dos arrays creados por ti son iguales con Equals de Arrays.
 *
 * @author sergioyana
 */
public class metodoEquals {

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
        System.out.print("Dame el tamaño del array: ");
        numeros = input.nextInt();

        /**
         * INSTANCIAMOS EL ARRAY.
         */
        int[] array = new int[numeros];

        recorrerArray(array);

        /**
         * PEDIMOS EL TAMAÑO DEL ARRAY.
         */
        System.out.print("Dame el tamaño del array 2: ");
        numeros = input.nextInt();

        /**
         * INSTANCIAMOS EL ARRAY.
         */
        int[] array2 = new int[numeros];

        /**
         * RECORREMOS EL ARRAY2
         */
        recorrerArray(array2);

        /**
         * MOSTRAMOS EL PRIMER ARRAY
         */
        muestraArray(array);
        System.out.println("");
        /**
         * MOSTRAMOS EL SEGUNDO ARRAY
         */
        muestraArray(array2);
        System.out.println("");

        /**
         * LLAMAMOS AL METODO QUE LOS COMPARA.
         */
        compararArray(array, array2);
    }

    /**
     * RECORREMOS EL PRIMER ARRAY.
     *
     * @param array
     */
    public static void recorrerArray(int[] array) {

        /**
         * INTRODUCIMOS LOS DATOS POR TECLADO.
         */
        Scanner input = new Scanner(System.in);

        /**
         * RECORREMOS EL ARRAY MEDIANTE EL FOR.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor del array " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static void muestraArray(int[] array) {

        /**
         * RECORREMOS EL ARRAY MEDIANTE EL FOR.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static int[] compararArray(int[] array, int[] array2) {
        /**
         * CREAMOS UN IF PARA COMPARARLOS MEDIANTE EQUALS Y VER SI SON IGUALES O
         * NO.
         */
        if (Arrays.equals(array, array2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos.");
        }
        return array;
    }
}
