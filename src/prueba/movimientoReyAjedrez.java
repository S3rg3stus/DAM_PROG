package prueba;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class movimientoReyAjedrez {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] matriz = new char[8][8];
//
        int posActualReyX = 0, posAntiguaReyX = 0;
        int posActualReyY = 0, posAntiguaReyY = 0;
        final char VACIO = 'X', REY = 'O';
        rellenarTablero(matriz, VACIO);
        matriz[posActualReyX][posActualReyY] = REY;

        boolean salir = false;
        int opcion = 0;

        while (!salir) {
            mostrarMatriz(matriz);

            System.out.println("¿Donde quieres moverte?");
            System.out.println("1.- Arriba.");
            System.out.println("2.- Arriba-derecha.");
            System.out.println("3.- Derecha.");
            System.out.println("4.- Abajo-derecha.");
            System.out.println("5.- Abajo.");
            System.out.println("6.- Abajo-izquierda.");
            System.out.println("7.- Izquierda.");
            System.out.println("8.- Arriba-izquierda.");
            System.out.println("9.- Salir");

            try {
                System.out.print("Elige una opcion: ");
                opcion = input.nextInt();

                posAntiguaReyX = posActualReyX;
                posAntiguaReyY = posActualReyY;

                switch (opcion) {
                    case 1:
                        posActualReyX--;
                        break;
                    case 2:
                        posActualReyX--;
                        posActualReyY++;
                        break;
                    case 3:
                        posActualReyY++;
                        break;
                    case 4:
                        posActualReyX++;
                        posActualReyY++;
                        break;
                    case 5:
                        posActualReyX++;
                        break;
                    case 6:
                        posActualReyX++;
                        posActualReyY--;
                        break;
                    case 7:
                        posActualReyY--;
                        break;
                    case 8:
                        posActualReyX--;
                        posActualReyY--;

                        break;
                    case 9:
                        System.out.println("===============");
                        System.out.println("Ha salido del programa.");
                        System.out.println("================");
                        salir = true;
                        break;
                    default:
                        System.out.println("Dato no correcto.");
                }
                if (limiteMatriz(matriz.length, matriz[0].length, posActualReyX, posActualReyY)) {
                    matriz[posActualReyX][posActualReyY] = REY;
                    matriz[posAntiguaReyX][posAntiguaReyY] = VACIO;
                } else {
                    System.out.println("Estas en el borde del tablero.");
                    posActualReyX = posAntiguaReyX;
                    posActualReyY = posAntiguaReyY;
                }

            } catch (InputMismatchException ie) {
                System.out.println("Dato no válido");
                input.next();
            }

        }

    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenarTablero(char[][] matriz, char casilla) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = casilla;
            }
        }
    }

    public static boolean limiteMatriz(int longitud, int longitudColumnas, int x, int y) {
        return x >= 0 && x < longitud && y >= 0 && y < longitudColumnas;
    }
}
