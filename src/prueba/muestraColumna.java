package prueba;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class muestraColumna {

    public static void main(String[] args) {
        /*
            i=FILA
            j=COLUMNA
         */

        Scanner input = new Scanner(System.in);

        int[][] matriz
                = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
        muestraColumna(matriz, 2);

    }

    public static void muestraColumna(int[][] matriz, int columna) {
        
        if (columna >= 0 && columna < matriz.length) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.println(matriz[i][columna]);
            }
        } else {
            System.out.println("El dato no es correcto.");
        }

    }

}
