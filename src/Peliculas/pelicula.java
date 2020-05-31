package Peliculas;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author sergioyana
 */
public class pelicula {

    public static void main(String[] args) {

        /**
         * Ponemos la clase Scanner para introducir por teclado.
         */
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        ArrayList<PeliCons> lista = new ArrayList<>();

        int codigo1, opcion;
        String codigo, autor, titulo, fechaS;
        LocalDate fecha;
        boolean valido = false;

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

                    do {
                        System.out.print("Introduzca el codigo de la pelicula: ");
                        codigo = input1.next();

                        if (validarCodigo(codigo)) {
                            valido = true;
                        }
                    } while (!valido);

                    System.out.print("Introduzca el autoe de la pelicula: ");
                    autor = input1.next();
                    System.out.print("Introduzca el titulo de la pelicula: ");
                    titulo = input1.next();
                    System.out.print("Introduzca el fecha de la pelicula: ");
                    fechaS = input1.next();
                    fecha = LocalDate.parse(fechaS);

                    PeliCons pelicula1 = new PeliCons(codigo, autor, titulo, fecha);

                    lista.add(pelicula1);
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        } while (opcion >= 1 && opcion < 3);
    }

    public static boolean validarCodigo(String codigo) {

        Pattern patron = Pattern.compile("[0-9]{2}/[0-9]{4}");
        Matcher m = patron.matcher(codigo);
        return m.matches();
    }
}
