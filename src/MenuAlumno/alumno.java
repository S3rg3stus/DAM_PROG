package MenuAlumno;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class alumno {

    /**
     * Introducimos atributos privados.
     */
    private String nombre;
    private String Direccion;
    private String DNI;
    private String Telefono;

    /**
     * Constructor vacio.
     */
    public alumno() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre
     * @param Direccion
     * @param DNI
     * @param Telefono
     */
    public alumno(String nombre, String Direccion, String DNI, String Telefono) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.DNI = DNI;
        this.Telefono = Telefono;
    }

    /**
     * Métodos GETTERS Y SETTERS.
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * Creamos un método para guardar los datos de un alumno.
     *
     * @return
     */
    public String guardarDatos() {
        /**
         * Ponemos la clase Scanner para introducir por teclado.
         */
        Scanner input = new Scanner(System.in);
        /**
         * Pedimos por teclado el nombre.
         */
        System.out.print("Dame el nombre del alumno:");
        nombre = input.next();

        /**
         * Pedimos por teclado la dirección del alumno.
         */
        System.out.print("Dame la direccion:");
        Direccion = input.next();

        /**
         * Pedimos por teclado el número del DNI.
         */
        System.out.print("Dame el número de dni:");
        DNI = input.next();

        /**
         * Pedimos por teclado el teléfono del alumno.
         */
        System.out.print("Dame el número de telefonos:");
        Telefono = input.next();

        return nombre;
    }

    /**
     * Creamos un método String para reflejar los datos.
     *
     * @return
     */
    public String consultarDatos() {
        return "alumno" + "\nnombre: " + nombre + "\nDireccion: " + Direccion + "\nDNI: " + DNI + "\nTelefono: " + Telefono;
    }
}
