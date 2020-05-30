package clasesPildoras.colecciones.claseTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author sergioyana
 */
public class PruebaTreeSet {

    public static void main(String[] args) {
        /*TreeSet<String> ordenaPersona = new TreeSet<>();

        ordenaPersona.add("Sergio");
        ordenaPersona.add("Ana");
        ordenaPersona.add("Lucia");

        for (String string : ordenaPersona) {
            System.out.println(string);
        }*/

        Articulo primero = new Articulo(1, "Primer articulo");
        Articulo segundo = new Articulo(20, "Segundo articulo");
        Articulo tercero = new Articulo(3, "Tercer articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<>();

        ordenaArticulos.add(tercero);
        ordenaArticulos.add(primero);
        ordenaArticulos.add(segundo);

        ordenaArticulos.forEach((ordenaArticulo) -> {
            System.out.println(ordenaArticulo.getDescripcion());
        });

        //Articulo comparadorArticulos = new Articulo();
        //TreeSet<Articulo> ordenaArticulos2 = new TreeSet<>(comparadorArticulos);
        //ComparadorArticulos comparaArt = new ComparadorArticulos();
        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<>(new Comparator<Articulo>() {

            @Override
            public int compare(Articulo t, Articulo t1) {
                String desc1 = t.getDescripcion();
                String desc2 = t1.getDescripcion();

                return desc1.compareTo(desc2);
            }
        });

        ordenaArticulos2.add(tercero);
        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);

        ordenaArticulos2.forEach((articulo) -> {
            System.out.println(articulo.getDescripcion());
        });
    }

}

class Articulo implements Comparable<Articulo> {

    private int numArticulo;
    private String descripcion;

    public Articulo(int num, String desc) {
        numArticulo = num;

        descripcion = desc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int compareTo(Articulo t) {
        return numArticulo - t.numArticulo;
    }

}
