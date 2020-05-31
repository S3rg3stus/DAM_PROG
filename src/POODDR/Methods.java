package POODDR;

/**
 *
 * @author sergioyana
 */
public class Methods {
    
    public static final String nombres[] = {"Sergio","Ana","Lucia","Sofia"};

    public static int numeroAleatorio(int maximo, int minimo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
    public static double numeroAleatorioReal(int maximo, int minimo) {
        return (double) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
