package prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class movimientoTorreAjedrez {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] matriz = new char[8][8];

        final char ALFIL = 'O', VACIO = 'X';
        int posInicialAlfilX = aleatorio(0, matriz.length - 1), posAntiguaAlfilX, dirX = 0;
        int posInicialAlfilY = aleatorio(0, matriz[0].length - 1), posAntiguaAlfilY, dirY = 0;
        rellenarTablero(matriz, VACIO);
        matriz[posInicialAlfilX][posInicialAlfilY] = ALFIL;

        int opcion = 0;
        boolean salir = false;

        while (!salir) {
            muestraMatriz(matriz);

            System.out.println("1.- Arriba.");
            System.out.println("2.- Derecha.");
            System.out.println("3.- Abajo.");
            System.out.println("4.- Izquierda.");
            System.out.println("5.- Salir.");

            try {

                System.out.println("Elige una opción: ");
                opcion = input.nextInt();

                posAntiguaAlfilX = posInicialAlfilX;
                posAntiguaAlfilY = posInicialAlfilY;

                switch (opcion) {
                    case 1:
                        dirX = -1;
                        dirY = 0;
                        break;
                    case 2:
                        dirX = 0;
                        dirY = 1;
                        break;
                    case 3:
                        dirX = 1;
                        dirY = 0;
                        break;
                    case 4:
                        dirX = 0;
                        dirY = -1;
                        break;
                    case 5:
                        salir = true;
                        break;
                }
                while (limiteMatriz(matriz.length, matriz[0].length, posInicialAlfilX + dirX, posInicialAlfilY + dirY)) {
                    posInicialAlfilX += dirX;
                    posInicialAlfilY += dirY;
                }
                matriz[posAntiguaAlfilX][posAntiguaAlfilY] = VACIO;
                matriz[posInicialAlfilX][posInicialAlfilY] = ALFIL;

            } catch (InputMismatchException e) {
                System.out.println("Dato no correcto.");
                input.next();
            }

        }

    }

    public static void muestraMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenarTablero(char[][] matriz, char casillas) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = casillas;
            }
        }
    }

    public static boolean limiteMatriz(int longitud, int longitudColumnas, int x, int y) {
        return x >= 0 && x < longitud && y >= 0 && y < longitudColumnas;
    }

    public static int aleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
