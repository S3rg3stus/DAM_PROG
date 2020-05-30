package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class numeroNatural {

    public static void main(String[] args) {
        int numero = validaNumero(0, Integer.MAX_VALUE);

        int[] numeros = digitosnumeroArray(numero);

        muestraArray(numeros);
    }

    public static int validaNumero(int minimo, int maximo) {
        Scanner input = new Scanner(System.in);

        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        int numero;
        do {
            System.out.print("Escribe un numero:");
            numero = input.nextInt();

            if (!(numero >= minimo && numero <= maximo)) {
                System.out.println("Debes escribir un numero entre " + minimo + " y " + maximo);
            }

        } while (!(numero >= minimo && numero <= maximo));

        return numero;
    }

    public static int[] digitosnumeroArray(int numero) {

        int cuentaNumero = 0;
        final int DIVISOR = 10;

        for (int i = numero; i > 0; i /= DIVISOR) {
            cuentaNumero++;
        }

        int[] digitos = new int[cuentaNumero];

        for (int i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
            digitos[j] = i % DIVISOR;
        }
        return digitos;
    }

    public static void muestraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
