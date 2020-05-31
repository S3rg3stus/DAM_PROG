package EjerciciosDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class Ejer02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe un numero de columnas: ");
        int columnas = input.nextInt();

        int[][] matriz = new int[5][columnas];
        rellenarColumnas(matriz);
    }

    public static void rellenarColumnas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=aleatorio(0,9);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static int aleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
