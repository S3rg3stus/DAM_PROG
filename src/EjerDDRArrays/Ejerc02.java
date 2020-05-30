package EjerDDRArrays;

import java.util.Scanner;

/**
 * Crea un array de números donde le indicamos por teclado el tamaño del array,
 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra
 * por pantalla el valor de cada posición y la suma de todos los valores. Haz un
 * método para rellenar el array (que tenga como parámetros los números entre
 * los que tenga que generar), para mostrar el contenido y la suma del array y
 * un método privado para generar número aleatorio (lo puedes usar para otros
 * ejercicios).
 *
 * @author sergioyana
 */
public class Ejerc02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros;

        System.out.print("Dame el tamaño del array: ");
        numeros = input.nextInt();

        int[] array = new int[numeros];

        rellenaArray(array, 0, 9);
        muestraArray(array);
    }

    public static void rellenaArray(int[] array, int minimo, int maximo) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio(minimo, maximo);
            suma += array[i];
        }
        System.out.println("La suma es: " + suma);
    }

    public static void muestraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int numeroAleatorio(int maximo, int minimo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
