package faltas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Faltas {

    /**
     * Metemos clase Scanner para introducir por teclado.
     */
    Scanner input = new Scanner(System.in);

    /**
     * Creamos e instanciamos dos arrays.
     */
    String[] nombre = new String[3];
    String[] asignaturas = new String[3];

    /**
     * Constructor vacio.
     */
    public Faltas() {
    }

    /**
     * Constructor de Faltas con parametros.
     *
     * @param nombre
     * @param asignaturas
     */
    public Faltas(String[] nombre, String[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    /**
     * Getters y Setters
     *
     * @return
     */
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * Metodo para cargar los datos.
     *
     * @param alumnos
     * @param asignaturas
     * @param faltas
     * @return
     */
    public String[] cargarDatos(String[] alumnos, String[] asignaturas, int[][] faltas) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < alumnos.length; i++) {

            System.out.print("Introduce nombre del alumno: " + (i + 1) + " : ");
            alumnos[i] = input.next();
        }
        for (int j = 0; j < alumnos.length; j++) {
            System.out.println("Para el alumno " + alumnos[j]);
            for (int i = 0; i < asignaturas.length; i++) {
                System.out.println("Introduce las faltas para la asignatura " + asignaturas[i]);
                faltas[j][i] = input.nextInt();
            }
        }

        return alumnos;
    }

    /**
     * Metodo para cargar la teabla
     *
     * @param alumnos
     * @param asignaturas
     * @param faltas
     * @return
     */
    public String[] Tabla(String[] alumnos, String[] asignaturas, int[][] faltas) {
        System.out.println("TABLA");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println(asignaturas[j] + " ----- " + faltas[i][j]);
            }
        }
        return alumnos;
    }

    /**
     * Metodo para mostrar los datos del alumno con faltas en una determinada
     * asignatura.
     *
     * @param alumnos
     * @param asignaturas
     * @param faltas
     */
    public static void mostrarDatos(String[] alumnos, String[] asignaturas, int[][] faltas) {
        Scanner input = new Scanner(System.in);

        System.out.println("Elige a un alumno: ");
        String nombre = input.next();

        System.out.println("Elige a una asignatura: ");
        String asignatura = input.next();

        for (int k = 0; k < alumnos.length; k++) {

            if (alumnos[k].equalsIgnoreCase(nombre)) {
                for (int l = 0; l < asignaturas.length; l++) {
                    if (asignaturas[l].equalsIgnoreCase(asignatura)) {
                        System.out.print("El alumno solicitado es: " + nombre + " - " + asignatura + " - " + faltas[k][l] + "\n");
                    }
                }
            }

        }

    }

    /**
     * Metodo para mostrar el que mas faltas tiene
     *
     * @param array
     * @return
     */
    public static int mostrarMayor(int[][] array) {
        int mayor = array[0][0];
        int posicionMayor = 0;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > mayor) {
                    mayor = array[i][j];
                    posicionMayor = i;
                }
            }
        }
        System.out.println(Arrays.toString(array[posicionMayor]));
        return posicionMayor;
    }
    
    /**
     * Metodo para mostrar el total de faltas.
     * @param nombre
     * @param asignaturas
     * @param faltas 
     */
    public static void totalFaltas(String[] nombre, String[] asignaturas, int[][] faltas) {
        Scanner input = new Scanner(System.in);

        int sumFaltas = 0;
        int mayor = 0;
        System.out.println("Elige a un alumno: ");
        String nombres = input.next();

        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                sumFaltas += faltas[i][j];
            }

        }
        System.out.println("EL alumno " + nombres + " tiene " + sumFaltas);

    }

}
