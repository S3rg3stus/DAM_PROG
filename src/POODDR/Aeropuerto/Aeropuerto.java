package POODDR.Aeropuerto;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author sergioyana
 */
public abstract class Aeropuerto implements Comparable<Aeropuerto> {

    private static int idAutoEnum = 1;

    private final int MAX_PLANES = 20;

    private int id;
    private String name;
    private Adress address;
    private int openingYear;
    private int capacity;
    private int numPlanes;

    private ArrayList<Avion> planes;

    public Aeropuerto() {
        this("", "", "", 0, "", 0, 0);
    }

    public Aeropuerto(String name, String country, String street, int number, String town, int openingYear, int capacity) {
        this.id = idAutoEnum++;
        this.name = name;
        this.address = new Adress(country, street, number, town);
        this.openingYear = openingYear;
        this.capacity = capacity;
        planes = new ArrayList<>();
        numPlanes = 0;

    }

    public Aeropuerto(String name, Adress address, int openingYear, int capacity) {
        this(name, address.getCountry(),
                address.getStreet(),
                address.getNumber(),
                address.getTown(),
                openingYear,
                capacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public int getOpeningYear() {
        return openingYear;
    }

    public void setOpeningYear(int openingYear) {
        this.openingYear = openingYear;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public final int openYears() {
        int actualYear = Calendar.getInstance().get(Calendar.YEAR);

        return actualYear - this.openingYear;
    }

    public int getNumPlanes() {
        return numPlanes;
    }

    private String showPlane() {

        String planesChar = "";
        planesChar = planes.stream().filter((a) -> (a.isActivable())).map((a) -> a.toString() + "\n").reduce(planesChar, String::concat);
        return planesChar;
    }

    public abstract void totalEarnings(double quantity);

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aeropuerto other = (Aeropuerto) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Aeropuerto: " + "\nid: " + this.id + "\nname: " + name + this.address + "\nopeningYear: " + openingYear + "\ncapacity: " + capacity + " peoples " + "\nplanes's list: " + "\n" + showPlane() + "\n";
    }

    public void addPlane(Avion a) {
        if (a != null) {
            this.planes.add(a);
        } else {
            System.out.println("You can't add more planes.");
        }
    }

    @Override
    public int compareTo(Aeropuerto t) {

        if (this.openingYear < t.getOpeningYear()) {
            return -1;
        } else if (this.openingYear > t.getOpeningYear()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void removePlane(Avion a) {
        if (a != null) {
            this.planes.remove(a);
        } else {
            System.out.println("You can't add more planes.");
        }
    }
}
