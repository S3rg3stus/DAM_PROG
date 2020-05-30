package faltas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2º) Hacer un programa que crea una clase Faltas con un vector de nombres, un
 * vector de nombres de asignaturas y una matriz de faltas de 10 x 3 elementos.
 * Tendrá los siguientes métodos:
 *
 * - Cargar la tabla
 *
 * - Consulta del número de faltas para un alumno dado y una asignatura
 * determinada.
 *
 * - Consulta del alumno con mayor número de faltas.
 *
 * - Ordenar la tabla por nombre.
 *
 * - Consulta del total de faltas para un alumno dado en las tres asignaturas.
 *
 * Crear una clase Menú con la llamada a cada uno de los métodos de la clase
 * faltas.
 *
 * @author sergio
 */
public class principal {

    public static void main(String[] args) {
        /**
         * Ponemos la clase Scanner para introducir por teclado.
         */
        Scanner input = new Scanner(System.in);

        /**
         * ponemos las variables que vamos a utilizar.
         */
        int numeros = 0, opcion = 0;

        /**
         * Pedimos por teclado el tamaño de la agenda. En éste caso para los
         * nombres.
         */
        System.out.println("Cantidad de alumnos a incorporar: ");
        numeros = input.nextInt();

        /**
         * Le añadimos el tamaño al array.
         */
        String[] nombre = new String[numeros];

        /**
         * Instanciamos un array con las asignaturas predefinidas.
         */
        String[] asignaturas = {"Ingles", "Historia", "Programación"};

        /**
         * Creamos una matriz faltas de 10x3.
         */
        int[][] faltas = new int[3][3];

        /**
         * Llamamos a la clase Faltas para invocar los métodos que necesitamos.
         */
        Faltas faltas1 = new Faltas();

        /**
         * Creamos un do-while porque al menos una vez vamos a pedir los datos.
         * y la condición a pedir será que mientras la opción sea mayor de 1 y
         * menor de 6 se siga pidiendo datos.
         */
        do {
            /**
             * Imprimimos el menú de opciones a elegir.
             */
            System.out.println("=====MENÚ======");
            System.out.println("1.- Carga la tabla. ");
            System.out.println("2.- Consulta el número de faltas para un alumnos y una asignatura determinada. ");
            System.out.println("3.- Consulta del alumno con mayor número de faltas.");
            System.out.println("4.- Ordena la tabal por nombre.");
            System.out.println("5.- Consulta el total de faltas para un alumno dado en las tres asignaturas.");
            System.out.println("6.- SALIR");
            System.out.println("================");

            /**
             * Damos a elegir una opcion.
             */
            System.out.print("Elige una opción:");
            opcion = input.nextInt();

            /**
             * Creamos un switch para distribuir las opciones y llamar a los
             * métodos de la clase Faltas.
             */
            switch (opcion) {
                case 1:
                    faltas1.cargarDatos(nombre, asignaturas, faltas);
                    faltas1.Tabla(nombre, asignaturas, faltas);
                    break;
                case 2:
                    Faltas.mostrarDatos(nombre, asignaturas, faltas);
                    break;
                case 3:
                    int posicion = Faltas.mostrarMayor(faltas);

                    System.out.println("El alumno de mas faltas es: " + nombre[posicion] + " con: " + Arrays.toString(faltas[posicion]));
                    break;
                case 4:
                    Arrays.sort(nombre);

                    faltas1.Tabla(nombre, asignaturas, faltas);
                    break;
                case 5:
                    Faltas.totalFaltas(nombre, asignaturas, faltas);
                    break;
                case 6:
                    System.out.println("Ha elegido terminar el programa.");
                    break;
                default:
                    System.out.println("Dato no valido.");
            }
        } while (opcion >= 1 && opcion < 6);

    }

}
