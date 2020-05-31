package MatricesDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class sumaArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros;

        System.out.print("Determina el tamanio de las columnas: ");
        numeros = input.nextInt();

        int[][] matriz1 = new int[numeros][numeros];
        int[][] matriz2 = new int[numeros][numeros];

        int[][] resultado = new int[numeros][numeros];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.println("Pon fila " + i + " y columna de " + j + " : ");
                matriz1[i][j] = input.nextInt();
                System.out.println("Pon fila " + i + " y columna de " + j + " : ");
                matriz2[i][j] = input.nextInt();
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("=====");
        recorrerMatriz(matriz1);
        System.out.println("======");
        recorrerMatriz(matriz2);
        System.out.println("======");
        recorrerMatriz(resultado);
    }
    public static void recorrerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
