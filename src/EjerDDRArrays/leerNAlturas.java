package EjerDDRArrays;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class leerNAlturas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int personas, media = 0, supMedia, infMedia;

        System.out.print("Cuantas personas hay: ");
        personas = input.nextInt();

        int[] altura = new int[personas];
        recorrePersona(altura);

        masAltoBajos(altura);
    }

    public static void recorrePersona(int[] array) {
        Scanner input = new Scanner(System.in);

        int personas = 0, media = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("La persona " + (i + 1) + " : ");
            array[i] = input.nextInt();
            media = media + array[i];
        }
        media /= array.length;
    }

    public static void masAltoBajos(int[] array) {
        int masAlt = 0, menosAlt = 0, alto = 0, bajo = 0, media = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                alto++;
            } else if (array[i] < media) {
                bajo++;
            }
        }
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + masAlt);
        System.out.println("Personas con estatura inferior a la media: " + menosAlt);
    }
}
