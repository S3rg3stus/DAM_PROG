package MenuAlumno;

import java.util.*;

/**
 * 3º) Crea una clase Alumno con los siguientes datos:
 *
 * - Nombre
 *
 * - Dirección
 *
 * - DNI
 *
 * - Teléfono
 *
 * Crea un constructor para inicializar todos los datos de un alumno, y un
 * método para consultar los datos del alumno.
 *
 * Crea una clase Menú con un ArrayList de objetos de la clase Alumno y con las
 * siguientes opciones:
 *
 * Alta de alumnos. Por cada alumno se creará un objeto de la clase Alumno, y se
 * almacena en el ArrayList
 *
 * Consulta de los datos para un alumno determinado
 *
 * @author sergio
 */
public class Menu {

    /**
     * Creamos el ARRAYLIST static para que lo lea el programa.
     */
    static ArrayList<alumno> listaAlumno = new ArrayList<>();

    public static void main(String[] args) {
        /**
         * Ponemos la clase Scanner para introducir por teclado.
         */
        Scanner input = new Scanner(System.in);

        /**
         * ponemos las variables que vamos a utilizar.
         */
        int opcion = 0;
        String nombre = null, Direccion = null, DNI = null, Telefono = null, auxDNI;
        boolean encontrado = false;

        /**
         * Hacemos un DO-WHILE para que nos pida mas opciones mientras que no
         * marquemos salir.
         */
        do {
            System.out.print("Dame una opcion: ");
            opcion = input.nextInt();

            /**
             * Ponemos un switch para elegir las opciones.
             */
            switch (opcion) {
                case 1:

                    /**
                     * Instanciamos la clase alumno.
                     */
                    alumno alumno1 = new alumno(nombre, Direccion, DNI, Telefono);
                    /**
                     * Hacemos la llamada al método guardarDatos para pedir los
                     * datos del alumno.
                     */
                    alumno1.guardarDatos();

                    /**
                     * Añadimo alumno mediante el .add
                     */
                    listaAlumno.add(alumno1);
                    break;
                case 2:
                    /**
                     * Consultamos el dni, para verificar si existe.
                     */
                    System.out.print("Consulta el dni:");
                    auxDNI = input.next();

                    /**
                     * Creamos un foreach para leer el alumno introducido.
                     */
                    for (alumno nombres : listaAlumno) {
                        /**
                         * Mediante el IF buscamos si es correcto.
                         */
                        if (nombres.getDNI().equalsIgnoreCase(auxDNI)) {
                            encontrado = true;
                            System.out.println(nombres.consultarDatos());
                        }
                    }
                    /**
                     * Creamos un IF si existe o no.
                     */
                    if (encontrado == false) {
                        System.out.println("No existe.");
                    } else {
                        System.out.println("Si exite.");
                    }
                    break;
                case 3:
                    /**
                     * Salimos del programa.
                     */
                    System.out.println("Has elegido salir del programa.");
                    break;
            }
        } while (opcion >= 1 && opcion < 3);

    }
}
