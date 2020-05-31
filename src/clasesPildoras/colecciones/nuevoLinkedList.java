package clasesPildoras.colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author sergioyana
 */
public class nuevoLinkedList {

    public static void main(String[] args) {

        LinkedList<String> personas = new LinkedList<>();

        personas.add("Pepe");
        personas.add("Ana");
        personas.add("Sergio");

        System.out.println(personas.size());

        ListIterator<String> it = personas.listIterator();

        it.next();

        it.add("Sofia");

        for (String persona : personas) {
            System.out.println(persona);
        }
    }
}
