package MatricesDDR;

import java.util.Scanner;

/**
 * Crea una matriz de números de 3*3, pidiendo cada numero. Al final recorre la
 * matriz y muéstrala.
 *
 * @author sergioyana
 */
public class matrizTresPorTres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];

        rellenaMatriz(array);
        muestraMatriz(array);
    }

    public static void rellenaMatriz(int[][] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("El valor de " + i + "-" + j + " : ");
                array[i][j] = input.nextInt();
            }
        }
    }

    public static void muestraMatriz(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
