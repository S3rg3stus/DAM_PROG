package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class personaMayor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho;

        System.out.print("Introduce el número de personas: ");
        tamanho = input.nextInt();

        String[] nombres = new String[tamanho];

        System.out.println("====================");
        recorreNombres(nombres);
        System.out.println("====================");

        System.out.print("Las edad de las personas anteriores: ");
        tamanho = input.nextInt();

        int[] edad = new int[tamanho];

        System.out.println("====================");
        recorrerEdad(edad);
        System.out.println("====================");
        int posicion = mostrarMayor(edad);

        System.out.println("La persona mayor es " + nombres[posicion] + " con " + edad[posicion] + " años.");

    }

    public static String[] recorreNombres(String[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el nombre de la persona " + i + " : ");
            array[i] = input.next();
        }
        return array;
    }

    public static int[] recorrerEdad(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce la edad de la persona: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static int mostrarMayor(int[] array) {
        int mayor = array[0];
        int posicionMayor = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > mayor) {
                mayor = array[i];
                posicionMayor = i;
            }
        }
        System.out.println(array[posicionMayor]);
        return posicionMayor;
    }
}
