package EjerDDRArrays;

/**
 * Guardar en un array los 20 primeros números pares.
 * @author sergioyana
 */
public class numerosPares {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int numero = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numero;
            numero += 2;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
