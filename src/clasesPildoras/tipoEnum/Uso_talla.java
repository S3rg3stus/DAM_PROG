package clasesPildoras.tipoEnum;

/**
 *
 * @author sergioyana
 */
public class Uso_talla {

    enum Talla {
        MINI, MEDIANO, GRANDE, MUYGRANDE
    };

    public static void main(String[] args) {

        Talla s = Talla.MINI;

        Talla m = Talla.MEDIANO;

        Talla l = Talla.GRANDE;

        Talla xl = Talla.MUYGRANDE;
    }
}
