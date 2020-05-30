package ejerc_arrays;

import java.util.Scanner;

/**
 * Hacer un programa que crea una clase Agenda con 10 nombres de alumnos con su
 * número de teléfono, y con los siguientes métodos:
 *
 * - Cargar los datos de los 10 alumnos.
 *
 * - Consulta del teléfono de un alumno determinado
 *
 * Crea una clase menú con dos opciones que llame a cada uno de los métodos.
 *
 * @author Sergio
 */
public class Ejerc_Arrays {

    public static void main(String[] args) {
        /**
         * Ponemos la clase Scanner para introducir por teclado.
         */
        Scanner input = new Scanner(System.in);

        /**
         * ponemos las variables que vamos a utilizar.
         */
        int numero;
        int opcion = 0;

        /**
         * Pedimos por teclado el tamaño de la agenda. En éste caso para los
         * nombres.
         */
        System.out.print("Dame el número de alumnos de la agenda:");
        numero = input.nextInt();

        /**
         * Le añadimos el tamaño al array.
         */
        String[] alumnos = new String[numero];

        /**
         * Pedimos por teclado el tamaño de los números de la agenda.
         */
        System.out.print("Dame el número de telefonos de la agenda:");
        numero = input.nextInt();

        /**
         * Le añadimos el tamaño al array teléfonos.
         */
        String[] telefonos = new String[numero];

        /**
         * Llamamos a la clase agenda para invocar los métodos que necesitamos.
         */
        Agenda agenda = new Agenda();

        /**
         * Creamos un do-while porque al menos una vez vamos a pedir los datos.
         * y la condición a pedir será que mientras la opción sea mayor de 1 y
         * menor de 3 se siga pidiendo datos.
         */
        do {

            /**
             * Imprimimos el menú de opciones a elegir.
             */
            System.out.println("=====MENÚ======");
            System.out.println("1.- Carga los datos de los alumnos: ");
            System.out.println("2.- Consulta el teléfono de un alumno determinado: ");
            System.out.println("3.- SALIR");
            System.out.println("================");

            /**
             * Damos a elegir una opcion.
             */
            System.out.print("Elige una opción:");
            opcion = input.nextInt();

            /**
             * Creamos un switch para distribuir las opciones y llamar a los
             * métodos de la clase Agenda.
             */
            switch (opcion) {
                case 1:
                    Agenda.cargarDatos(alumnos, telefonos);
                    break;
                case 2:
                    Agenda.mostrarDatos(alumnos, telefonos);
                    break;
                case 3:
                    System.out.println("Has salido del menú.");
                    break;
                default:
                    System.out.println("Dato no correcto.");
            }
        } while (opcion >= 1 && opcion < 3);
    }

}
