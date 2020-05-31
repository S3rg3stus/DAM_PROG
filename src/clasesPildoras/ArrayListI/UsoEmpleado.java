package clasesPildoras.ArrayListI;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sergioyana
 */
public class UsoEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();

        empleado1.dameDatos();
        /*Empleado[] listaEmpleado = new Empleado[3];

        listaEmpleado[0] = new Empleado("Ana", 45, 2500);
        listaEmpleado[1] = new Empleado("Antonio", 55, 200);
        listaEmpleado[2] = new Empleado("Maria", 25, 2600);*/

        ArrayList<Empleado> listaEmpleado = new ArrayList<>();

        //listaEmpleado.ensureCapacity(3);//SE ESTABLECE EL TAMAÑO DE LA MEMORIA.
        listaEmpleado.add(new Empleado("Ana", 45, 2500));
        listaEmpleado.add(new Empleado("Antonio", 55, 2000));
        listaEmpleado.add(new Empleado("Maria", 22, 2200));

        //listaEmpleado.set(1, new Empleado("Maria", 22, 2200));//MUEVE DE POSICIÓN.
        //System.out.println(listaEmpleado.get(0).dameDatos());
        //listaEmpleado.trimToSize();//RECORTA EL ESPACIO SOBRANTE DE LA MEMORIA.
        System.out.println(listaEmpleado.size());

        /*listaEmpleado.forEach((listaEmpleado1) -> {
            System.out.println(listaEmpleado1.dameDatos());
        });*/
        //ITERATOR
        Iterator<Empleado> miIterador = listaEmpleado.iterator();

        while (miIterador.hasNext()) {
            System.out.println(miIterador.next().dameDatos());
        }

    }
}
