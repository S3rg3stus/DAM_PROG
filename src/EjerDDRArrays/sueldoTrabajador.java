package EjerDDRArrays;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class sueldoTrabajador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] empleados = new String[4];
        int[] sueldos = new int[4];

        rellenaArray(empleados, sueldos);
        recorreArray(empleados, sueldos);
    }

    public static void rellenaArray(String[] empleados, int[] sueldos) {
        Scanner input = new Scanner(System.in);

        String mayorNombre;
        int mayorSueldo;
        int i = 0;

        System.out.print("El empleado " + (i + 1) + " : ");
        empleados[i] = input.next();
        System.out.println("Sueldo: ");
        sueldos[i] = input.nextInt();

        mayorNombre = empleados[i];
        mayorSueldo = sueldos[i];
    }

    public static void recorreArray(String[] empleados, int[] sueldos) {
        Scanner input = new Scanner(System.in);

        String mayorNombre = null;
        int mayorSueldo = 0;
        int i = 0;
        for (i = 1; i < empleados.length; i++) {
            System.out.print("El empleado " + (i + 1) + " : ");
            empleados[i] = input.next();
            System.out.println("Sueldo: ");
            sueldos[i] = input.nextInt();
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                mayorNombre = empleados[i];
            }
        }
        System.out.println("Empleado con mayor sueldo: " + mayorNombre);
        System.out.println("Sueldo: " + mayorSueldo);
    }
}
