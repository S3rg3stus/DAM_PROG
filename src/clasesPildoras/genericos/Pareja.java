package clasesPildoras.genericos;

/**
 *
 * @author sergioyana
 * @param <T>
 */
public class Pareja<T> {

    private T primero;

    public Pareja() {
        primero = null;
    }

    public void setPrimero(T nuevoValor){
        primero=nuevoValor;
    }
    public T getPrimero(){
        return primero;
    }
}