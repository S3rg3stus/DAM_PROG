package ArrayDDR.arrayList;

import java.util.ArrayList;

/**
 *
 * @author sergioyana
 */
public class crearYRecorrer {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        int cantidadNumeros = numeroAleatorio(1, 20);

        for (int i = 0; i < cantidadNumeros; i++) {
            lista.add(numeroAleatorio(1, 10));
        }

        lista.forEach((lista1) -> {
            System.out.println(lista1);
        });
    }

    public static int numeroAleatorio(int maximo, int minimo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
