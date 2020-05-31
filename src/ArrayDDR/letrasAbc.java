package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class letrasAbc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cadena = "";

        char[] abecedario = new char[91 - 65];
        for (int i = 65, indice = 0; i < 91; i++, indice++) {
            abecedario[indice] = (char) i;
        }

        System.out.println("Introduce un numero: ");
        int numero = input.nextInt();

        while (numero != -1) {
            if (numero >= 0 && numero < abecedario.length) {
                cadena += abecedario[numero];
            } else {
                System.out.println("Numero no válido.");
                System.out.println("Introduce un numero: ");
            }
            numero = input.nextInt();

        }
        System.out.println("La cadena es " + cadena);

    }
}
