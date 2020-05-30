package ArrayDDR;

/**
 *
 * @author sergioyana
 */
public class mediaCienNuemeros {

    public static void main(String[] args) {

        int[] array = new int[100];
        int media;
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        System.out.println("la suma es: " + suma);

        media = suma / array.length;

        System.out.println("la media es: " + media);

    }
}
