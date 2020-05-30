package EstructuraDinámicasDDR;

/**
 *
 * @author sergioyana
 * @param <T>
 */
public class PilaDinamica<T> {

    private Nodo<T> top;
    private int tamaño;

    public PilaDinamica() {
        this.top = null;
        this.tamaño = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return this.tamaño;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = top.getElemento();
            Nodo<T> aux = top.getSiguiente();
            top = null;
            top = aux;
            this.tamaño--;
            return elemento;
        }
    }

    public void push(T elemento) {
        Nodo<T> aux = new Nodo<>(elemento, top);
        top = aux;
        this.tamaño++;
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getElemento();
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "La pila está vacia.";
        } else {
            String resultado = "";
            Nodo<T> aux = top;
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }
}
