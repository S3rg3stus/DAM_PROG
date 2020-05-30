package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class letraDNI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] letrasNIF
                = {
                    'T', 'R', 'W', 'A', 'G', 'M',
                    'Y', 'F', 'P', 'D', 'X', 'B',
                    'N', 'J', 'Z', 'S', 'Q', 'V',
                    'H', 'L', 'C', 'K', 'E'
                };

        letraDni(letrasNIF);

    }

    public static char[] letraDni(char[] documento) {
        Scanner input = new Scanner(System.in);

        int dni;

        System.out.print("Introduce tu DNI: ");
        dni = input.nextInt();

        final int DIVISOR = 23;
        int indiceLetra = dni % DIVISOR;

        System.out.println(dni + "" + documento[indiceLetra]);

        return documento;
    }
}
