package prueba;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class MuestraFila {

    public static void main(String[] args) {
        /*
          i= FILAS
          j= COLUMNAS
         */

        Scanner input = new Scanner(System.in);

        int[][] matriz
                = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9,}
                };
        muestraFilaMatriz(matriz,-1);
    }

    public static void muestraFilaMatriz(int[][] matriz, int fila) {

        if (fila >= 0 && fila < matriz.length) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[fila][j]);
            }
        } else {
            System.out.println("La fila no es correcta.");
        }

    }

}
