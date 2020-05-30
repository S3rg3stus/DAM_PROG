package clasesPildoras.colecciones;

import java.util.*;

/**
 *
 * @author sergioyana
 */
public class CuentasUsuarios {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Sergio", "00001", 200000);
        Cliente cl5 = new Cliente("Sergio", "00001", 200000);
        Cliente cl2 = new Cliente("Ana", "00002", 250000);
        Cliente cl3 = new Cliente("Juan", "00003", 100000);
        Cliente cl4 = new Cliente("Lucia", "00004", 300000);

        Set<Cliente> clientesBanco;
        clientesBanco = new HashSet<>();

        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        /*for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.toString());

            if (cliente.getNombre().equals("Juan")) {

                clientesBanco.remove(cliente);

            }
        }*/
        Iterator<Cliente> it = clientesBanco.iterator();

        while (it.hasNext()) {
            String nombreCliente = it.next().getNombre();
            if (nombreCliente.equals("Juan")) {
                it.remove();
            }
        }

        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.toString());
        }

        /*Iterator<Cliente> it=clientesBanco.iterator();
        
        while(it.hasNext()){
            String nombreCliente=it.next().getNombre();
            
            System.out.println(nombreCliente);
            
            String nCuenta=it.next().getN_cuenta();
        }*/
    }
}
