package ArrayDDR;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class compararArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("introduce el valor del primer array: ");
        numero = input.nextInt();

        int[] array = new int[numero];

        rellenaArray1(array);

        System.out.print("introduce el valor del segundo array: ");
        numero = input.nextInt();

        int[] array2 = new int[numero];

        rellenaArray2(array2);
        System.out.println("===========");
        muestraArray(array);
        System.out.println("");
        muestraArray2(array2);
        System.out.println("");
        
        comparaArray(array, array2);
    }

    public static void rellenaArray1(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posición " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static void rellenaArray2(int[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posición " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static void muestraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void muestraArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static void comparaArray(int[] array, int[]array2){
        if (Arrays.equals(array, array2)) {
            System.out.println("Son iguales.");
        }else{
            System.out.println("No son iguales.");
        }
    }
}
