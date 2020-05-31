package EstructuraDinámicasDDR;

import java.util.Stack;

/**
 *
 * @author sergioyana
 */
public class Principal {

    public static void main(String[] args) {

        PilaDinamica<Integer> pilaNumeros = new PilaDinamica<>();

        pilaNumeros.push(5);
        pilaNumeros.push(10);
        pilaNumeros.push(15);
        pilaNumeros.push(20);

        System.out.println("El tamaño es: " + pilaNumeros.size());

        System.out.println("El más alto es: " + pilaNumeros.top());

        int elemento = pilaNumeros.pop();
        System.out.println("He borrado el número: " + elemento);

        System.out.println("El más alto ahora es: " + pilaNumeros.top());

        System.out.println(pilaNumeros);

        System.out.println("Stack de JAVA: ");

        Stack<Integer> pilaStack = new Stack<>();
        
        pilaStack.push(5);
        pilaStack.push(10);
        
        System.out.println("El tamaño es: " + pilaNumeros.size());
        System.out.println("El más alto es: " + pilaStack.peek());
    }

}
