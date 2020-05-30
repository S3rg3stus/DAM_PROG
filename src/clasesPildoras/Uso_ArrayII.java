package clasesPildoras;

import javax.swing.JOptionPane;

/**
 *
 * @author sergioyana
 */
public class Uso_ArrayII {

    public static void main(String[] args) {
        String[] paises = new String[5];

//        paises[0] = "España";
//        paises[1] = "México";
//        paises[2] = "Colombia";
//        paises[3] = "Perú";
//        paises[4] = "Chile";
//
//        for (int i = 0; i < paises.length; i++) {
//            System.out.println("Pais " + (i + 1) + "" + paises[i]);
//        }
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce país: " + (i + 1));
        }
        for (String element : paises) {
            System.out.println("Pais: " + element);
        }
    }
}
