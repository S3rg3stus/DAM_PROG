package clasesPildoras.genericos;

//import clasesPildoras.ArrayListI.Empleado;
/**
 *
 * @author sergioyana
 */
public class MetodosGenericos {

    public static void main(String[] args) {

        String[] nombres = {"Yurena", "Maria", "Pepe", "Ana"};

        /*
        String elementos = MisMatrices.getElementos(nombres);
        System.out.println(elementos);

        Empleado[] listaEmpleados = {new Empleado("Ana", 45, 2500),
            new Empleado("Sergio", 36, 3500),
            new Empleado("Lucia", 45, 2500),
            new Empleado("Ana", 45, 2500),
            new Empleado("Ana", 45, 2500)
        };
        System.out.println(MisMatrices.getElementos(listaEmpleados));*/
        
        System.out.println(MisMatrices.getElementos(nombres));
    }
}

class MisMatrices {

    public static < T extends Comparable> T getElementos(T[] a) {

        T elementoMenor = a[0];
        //return "El array tiene: " + a.length + " elementos.";

        if (a == null || a.length == 0) {
            return null;
        }

        for (int i = 1; i < a.length; i++) {
            if (elementoMenor.compareTo(a[i]) > 0) {
                elementoMenor = a[i];
            }
        }
        return elementoMenor;
    }
}
