package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class fraseChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        String frase;
        char caracter;

        System.out.println("Introduce la frase:");
        frase = input.next();

        char[] caracteres = new char[frase.length()];

        for (int i = 0; i < caracteres.length; i++) {
            caracter = frase.charAt(i);
            caracteres[i] = caracter;
        }

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
    }
}
