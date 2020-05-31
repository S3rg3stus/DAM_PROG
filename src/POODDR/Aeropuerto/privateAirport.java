package POODDR.Aeropuerto;

/**
 *
 * @author sergioyana
 */
public class privateAirport extends Aeropuerto {

    private int numPartner;

    public privateAirport(int numPartner) {
        this.numPartner = numPartner;
    }

    public privateAirport(int numPartner, String name, String country, String street, int number, String town, int openingYear, int capacity) {
        super(name, country, street, number, town, openingYear, capacity);
        this.numPartner = numPartner;
    }

    public privateAirport(int numPartner, String name, Adress address, int openingYear, int capacity) {
        super(name, address, openingYear, capacity);
        this.numPartner = numPartner;
    }

    public int getNumPartner() {
        return numPartner;
    }

    public void setNumPartner(int numPartner) {
        this.numPartner = numPartner;
    }

    @Override
    public String toString() {
        return super.toString() + " Is private and has " + numPartner + " partners";
    }

    @Override
    public void totalEarnings(double quantity) {
        double earnings = quantity / this.numPartner;

        System.out.println("the quantity wins for partner is: " + earnings);
    }

}
