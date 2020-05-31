package clasesPildoras.genericos;

/**
 *
 * @author sergioyana
 */
public class UsoPareja {

    public static void main(String[] args) {
        Pareja<String> una = new Pareja<>();

        una.setPrimero("Sergio");

        System.out.println(una.getPrimero());

        Persona pers1 = new Persona("Ana");

        Pareja<Persona> otra = new Pareja<>();

        otra.setPrimero(pers1);

        System.out.println(otra.getPrimero());
    }
}

class Persona {

    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
