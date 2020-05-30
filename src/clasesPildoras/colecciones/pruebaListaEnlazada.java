package clasesPildoras.colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author sergioyana
 */
public class pruebaListaEnlazada {

    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<>();

        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Perú");

        LinkedList<String> capitales = new LinkedList<>();

        capitales.add("Madird");
        capitales.add("Bogotá");
        capitales.add("D.F.");
        capitales.add("Lima");

        ListIterator<String> iterA = paises.listIterator();
        ListIterator<String> iterB = capitales.listIterator();

        while (iterB.hasNext()) {
            if (iterA.hasNext()) {
                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println(paises);

        iterB = capitales.listIterator();

        while (iterB.hasNext()) {
            iterB.next();
            if (iterB.hasNext()) {
                iterB.next();
                iterB.remove();
            }
        }
        System.out.println(capitales);
        
        paises.removeAll(capitales);
        
        System.out.println(paises);
    }

}
