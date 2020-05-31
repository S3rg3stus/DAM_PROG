package ArrayDDR;

/**
 *
 * @author sergioyana
 */
public class cienNumeros {

    public static void main(String[] args) {

        int[] array = new int[100];

        int media;
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
}
