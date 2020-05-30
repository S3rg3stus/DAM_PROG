package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class numeroRepetido {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros;

        System.out.print("Dame el tamaño del array: ");
        numeros = input.nextInt();

        int[] array = new int[numeros];

        rellenaArray(array);
        buscaArray(array);

    }

    public static void rellenaArray(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posición " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static int[] buscaArray(int[] array) {

        int contador = 0;
        int mayor = 0;
        int mayorRepeticiones = 0;
        int numeroBuscado;
        int numeroActual;

        for (int i = 0; i < array.length; i++) {
            numeroBuscado = array[i];
            contador = 0;
            for (int j = 0; j < array.length; j++) {
                numeroActual = array[j];
                if (numeroBuscado == numeroActual) {
                    contador++;
                }
            }

            if (contador >= mayorRepeticiones) {
                mayor = numeroBuscado;
                mayorRepeticiones = contador;
            }
        }

        System.out.println("En numero más repetido: " + mayor + "\n número de repeticiones: " + mayorRepeticiones);
        return array;
    }
}
