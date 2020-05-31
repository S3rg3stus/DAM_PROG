package POODDR;

/**
 *
 * @author sergioyana
 */
public class poo {

    public static void main(String[] args) {
        /**
         * arrays instanciances
         */
        Libro libro1 = new Libro(123456, "titulo1", "autor1", 30);
        Libro libro2 = new Libro(123457, "titulo2", "autor2", 60);
        
        Raices ecuacion = new Raices(2,5,-3);
        
        /**
         * print
         */
        System.out.println(libro1);
        System.out.println("******************");
        ecuacion.calcular();
        System.out.println("******************");

        /**
         * compare number's page
         */
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println(libro1.getTitulo() + "tiene mas paginas.");
        } else {
            System.out.println("El libro 2 tiene mas paginas.");
        }
    }
}
