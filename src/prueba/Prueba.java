package prueba;

import java.util.Scanner;

/**
 *
 * @author sergioyana
 */
public class Prueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       /*
          i= FILAS
          j= COLUMNAS
        */
        
        int [][] matriz=new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion i: "+i+" j: "+j);
                matriz[i][j]=input.nextInt();
            }
            
        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            
        }
    }

}
