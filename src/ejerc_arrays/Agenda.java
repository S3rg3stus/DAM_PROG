package ejerc_arrays;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Agenda {

    /**
     * Metemos clase Scanner para introducir por teclado.
     */
    Scanner input = new Scanner(System.in);

    /**
     * Creamos e instanciamos dos arrays.
     */
    String[] alumnos = new String[3];
    String[] numero = new String[3];

    /**
     * Constructor vacio.
     */
    public Agenda() {
    }

    /**
     * Constructor con parametros.
     *
     * @param alumnos
     * @param numero
     */
    public Agenda(String[] alumnos, String[] numero) {
        this.alumnos = alumnos;
        this.numero = numero;
    }

    /**
     * Introducimos getters y setters.
     *
     * @return
     */
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public String[] getNumero() {
        return numero;
    }

    public void setNumero(String[] numero) {
        this.numero = numero;
    }

    /**
     * Creamos método CargarDatos para pedir los alumnos y los telefónos de la
     * agenda.
     *
     * El método tendrá dos arrays por parámetros.
     *
     * @param alumnos
     * @param telefonos
     */
    public static void cargarDatos(String[] alumnos, String[] telefonos) {
        Scanner input = new Scanner(System.in);

        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Introduce nombre del alumno: " + i + " : ");
            alumnos[i] = input.next();
            System.out.print("Introduce telefono del alumno: " + i + " : ");
            telefonos[i] = input.next();
        }
    }

    /**
     * Creamos un método que mostrará el dato solicitado en la opción 2 del
     * switch del método principal.
     *
     * @param alumnos
     * @param telefonos
     */
    public static void mostrarDatos(String[] alumnos, String[] telefonos) {
        Scanner input = new Scanner(System.in);

        int i = 0;

        System.out.println("Elige a un alumno: ");

        alumnos[i] = input.next();

        System.out.print("El alumno solicitado es: " + alumnos[i] + " - " + telefonos[i] + "\n");

    }

}
