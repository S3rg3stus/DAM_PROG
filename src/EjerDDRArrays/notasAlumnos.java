package EjerDDRArrays;

import java.util.Scanner;

/**
 * Leer por teclado la nota de los alumnos de una clase y clacular la nota media
 * del grupo.Mostrar los alumnos con notas superiores a la media.
 *
 * @author sergioyana
 */
public class notasAlumnos {

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
        System.out.print("Introduce la cantidad de alumnos: ");
        numeros = input.nextInt();

        /**
         * INICIALIZAMOS EL ARRAY ESTABLECEMOS EL TAMAÑO.
         */
        String[] alumnos = new String[numeros];

        /**
         * LLAMAMOS AL MÉTODO PARA RELLENAR EL ARRAY.
         */
        nombreArray(alumnos);

        /**
         * PEDIMOS POR TECLADO EL TAMAÑO DEL ARRAY.
         */
        System.out.print("Introduce la cantidad notas de alumnos: ");
        numeros = input.nextInt();

        /**
         * INICIALIZAMOS EL ARRAY ESTABLECEMOS EL TAMAÑO.
         */
        int[] notas = new int[numeros];

        /**
         * LLAMAMOS AL MÉTODO PARA RELLENAR EL ARRAY.
         */
        rellenaArray(notas);

        mediaArray(notas);
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
            System.out.print("Introduce la nota del alumno " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
    }

    /**
     * CREAMOS MÉTODO PARA RECORRER ARRAY
     *
     * @param array
     */
    public static void nombreArray(String[] array) {
        /**
         * CREAMOS LA CLASE PARA PEDIR LOS VALORES DEL ARRAY POR TECLADO
         */
        Scanner input = new Scanner(System.in);

        /**
         * BUCLE PARA RECORRER EL ARRAY.
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el nombre del alumno " + (i + 1) + " : ");
            array[i] = input.next();
        }
    }

    /**
     * METODO PARA HALLAR LA MEDIA.
     *
     * @param array
     */
    public static void mediaArray(int[] array) {
        int suma = 0, media;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        media = suma / array.length;

        System.out.println("La media de las notas es: " + media);
    }
}
