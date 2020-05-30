package ArrayDDR.arrayList;

import POODDR.Aeropuerto.Avion;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sergioyana
 */
public class ElementoRepetido {

    public static void main(String[] args) {

        ArrayList<Avion> planes = new ArrayList<>();
        
        Avion a1 = new Avion("boing123", 100, 200);
        Avion a2 = new Avion("Boing357", 300, 500);

        planes.add(a1);
        planes.add(a2);
        
        Iterator <Avion>it=planes.iterator();
        
        Avion a;
        
        while(it.hasNext()){
            a=it.next();
            System.out.println(a);
        }

        /*Avion a3 = new Avion("boing123", 100, 200);

        if (planes.contains(a3)) {
            System.out.println("Existe.");
        } else {
            System.out.println("No existe.");
        }*/

    }
}
