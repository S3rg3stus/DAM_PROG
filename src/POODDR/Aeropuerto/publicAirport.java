package POODDR.Aeropuerto;

/**
 *
 * @author sergioyana
 */
public class publicAirport extends Aeropuerto {

    private double finance;
    private int numWorker;

    public publicAirport() {
        super();
    }

    public publicAirport(double finance, int numWorker, String name, String country, String street, int number, String town, int openingYear, int capacity) {
        super(name, country, street, number, town, openingYear, capacity);
        this.finance = finance;
        this.numWorker = numWorker;
    }

    public publicAirport(double finance, int numWorker, String name, Adress address, int openingYear, int capacity) {
        super(name, address, openingYear, capacity);
        this.finance = finance;
        this.numWorker = numWorker;
    }

    public double getFinance() {
        return finance;
    }

    public void setFinance(double finance) {
        this.finance = finance;
    }

    public int getNumWorker() {
        return numWorker;
    }

    public void setNumWorker(int numWorker) {
        this.numWorker = numWorker;
    }

    @Override
    public String toString() {
        return super.toString() + " Is public and has finance: " + finance + " and has " + numWorker + " low Workers.";
    }

    @Override
    public void totalEarnings(double quantity) {
        double earnings = quantity + finance + (numWorker * 100);

        System.out.println("The earnings is: " + earnings);
    }

}
