package MatricesDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class filasColumnas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros;
        System.out.print("Determina el tamanio de las columnas: ");
        numeros = input.nextInt();

        int[][] matriz = new int[5][numeros];

        recorrerMatriz(matriz);
    }

    public static void recorrerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numeroAleatorio(0, 9);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int numeroAleatorio(int maximo, int minimo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
