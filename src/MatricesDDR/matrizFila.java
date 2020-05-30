package MatricesDDR;

/**
 *
 * @author sergioyana
 */
public class matrizFila {

    public static void main(String[] args) {
        int[][] array
                = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };

        rellenaMatriz(array, 1);
    }

    public static void rellenaMatriz(int[][] array, int fila) {
        if (fila >= 0 && fila < array.length) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[fila][j]);
            }
        } else {
            System.out.println("La fila no es correcta.");
        }

    }

}
