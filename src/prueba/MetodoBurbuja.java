package prueba;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class MetodoBurbuja {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arreglo = new int[5];
        int auxiliar = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduce el valor de la posicion " + i + " : ");
            arreglo[i] = input.nextInt();
            System.out.println("");
        }

        //METODO DE LA BURBUJA
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

}
