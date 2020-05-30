package EjerDDRArrays;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class contarElementos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array");
        int numeros = input.nextInt();
        int[] array = new int[numeros];

        int pos = 0, neg = 0, cero = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de array " + i + " : ");
            array[i] = input.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pos++;
            } else if (array[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
}
