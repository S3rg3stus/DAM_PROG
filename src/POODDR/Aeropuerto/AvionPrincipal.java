package POODDR.Aeropuerto;

/**
 *
 * @author sergioyana
 */
public class AvionPrincipal {

    public static void main(String[] args) {

        Adress a = new Adress("Spain", "calle", 2, "Gran Canaria");
        Aeropuerto n1 = new privateAirport(5, "Gran Canaria", a, 1960, 150000);
        //publicAirport n2 = new publicAirport(100000,10,"Los Rodeos", a, 1945, 80000);

        Avion planes = new Avion("Boing456", 200, 300);
        Avion planes1 = new Avion("Boing357", 100, 200);
        n1.addPlane(planes);
        System.out.println(" ");
        n1.addPlane(planes1);

        planes.setActivado(true);

        System.out.println(n1.getNumPlanes());

        System.out.println(n1);
    }
}
