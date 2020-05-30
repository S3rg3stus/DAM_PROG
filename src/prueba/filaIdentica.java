package prueba;

/**
 *
 * @author sergioyana
 */
public class filaIdentica {

    public static void main(String[] args) {

        int[][] matriz
                = {
                    {1, 2, 3},
                    {4, 4, 4},
                    {7, 8, 9}
                };

        /*
            i= Fila
            j=COLUMNA
         */
        System.out.println(muestraFila(matriz, 4));
    }

    public static boolean muestraFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {

            int valor = matriz[fila][0];

            for (int j = 1; j < matriz[0].length; j++) {
                if (valor != matriz[fila][j]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
