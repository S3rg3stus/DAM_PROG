package EjerDDRArrays;

import java.util.Scanner;

/**
 * Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
 * mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la
 * posicion es correcta, se añadira a una cadena que se mostrara al final, se
 * dejará de insertar cuando se introduzca un -1.
 *
 * @author sergioyana
 */
public class Ejerc05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cadena = "";

        char[] caracter = new char[91 - 65];

        for (int i = 0, indice = 0; i < 91; indice++, i++) {
            caracter[indice] = (char) i;
        }
        System.out.print("Intorduce números: ");
        int numeros = input.nextInt();

        while (numeros != -1) {
            if (numeros >= 0 && numeros < caracter.length) {
                cadena += caracter[numeros];
            } else {
                System.out.println("Error.");
                System.out.println("Intorduce números: ");
            }
            numeros = input.nextInt();
        }
        System.out.println("La cadena es " + cadena);
    }
}
