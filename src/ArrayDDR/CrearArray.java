
package ArrayDDR;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class CrearArray {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            int []matriz=new int[3];
            int numero = 0;
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("Dame los valores: ");
                numero=input.nextInt();
                matriz[i]=numero;
            }
            
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i]);
            }
            
            
            
        }
}
