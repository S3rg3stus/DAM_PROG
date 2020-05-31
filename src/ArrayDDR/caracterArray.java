package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class caracterArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        String frase;

        System.out.println("Introduce la frase:");
        frase = input.next();

        char[] caracteres = new char[frase.length()];

        char caracter;

        for (int i = 0; i < caracteres.length; i++) {
            caracter = frase.charAt(i);
            caracteres[i] = caracter;

        }

        muestraArray(caracteres);
    }

    public static void muestraArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

