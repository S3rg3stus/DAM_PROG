package clasesPildoras.colecciones.LIbro;

/**
 *
 * @author sergioyana
 */
public class UsoLibro {
    public static void main(String[] args){
        
        Libro libro1 =new Libro("P en Java","Juan", 25);
        Libro libro2 =new Libro("P en Java","Juan", 25);
        
        if (libro1.equals(libro2)) {
            System.out.println("Es el mismo");
        }else{
            System.out.println("Es distinto.");
        }
    }
}
