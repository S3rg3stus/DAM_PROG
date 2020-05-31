package clasesPildoras;

/**
 *
 * @author sergioyana
 */
public class pildorasArrays {

    public static void main(String[] args) {

        /*int[] mi_matriz = new int[5];
        
        mi_matriz[0]=6;
        mi_matriz[1]=1;
        mi_matriz[2]=8;
        mi_matriz[3]=-6;
        mi_matriz[4]=2;
         */
        int[] mi_matriz = {6, 1, 8, -6, 2};

        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Elemento " + i + " : " + mi_matriz[i]);
        }
    }
}
