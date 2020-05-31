package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class mayorYMenorArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.print("Introduce el tamaño del array: ");
        numero = input.nextInt();

        int[] array = new int[numero];
        rellenaArray(array);
        muestraArray(array);

    }

    public static void rellenaArray(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor de la posición " + i + " : ");
            array[i] = input.nextInt();
        }
    }

    public static void muestraArray(int[] array) {
        int mayor= array[0], menor=array[0];
        
        for (int i = 0; i < array.length; i++) {
            if(array[i]>mayor){
                mayor=array[i];
            }
            if(array[i]<menor){
                menor=array[i];
            }
            
        }
        System.out.println("mayor: "+mayor);
        System.out.println("menor: "+menor);
    }

}
