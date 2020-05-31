package prueba;

/**
 *
 * @author sergioyana
 */
public class diagonales {

    public static void main(String[] args) {
        
        int[][] matriz
                = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
        
        /*
            i= Fila
            j=COLUMNA
        */
        System.out.println("Diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
            
        }
        System.out.println("Diagonal inversa");
        for (int i = 0, j = matriz[0].length-1; i < matriz.length; i++, j--) {
            System.out.println(matriz[i][j]);
            
        }
    }

}
