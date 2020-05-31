package EjerDDRArrays;

/**
 * Crea un array de números de 100 posiciones, que contendrá los números del 1
 * al 100. Obtén la suma de todos ellos y la media.
 *
 * @author sergioyana
 */
public class Ejerc04 {

    public static void main(String[] args) {
        int[] numeros = new int[100];

        int suma = 0, media = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);

            suma += numeros[i];
        }
        media = suma / numeros.length;

        System.out.println("La suma es: " + suma + "\nLa media es: " + media);
    }
}
