package POODDR.Aeropuerto;

import java.util.Objects;

/**
 *
 * @author sergioyana
 */
public class Avion implements Activable {

    /**
     * Intorducimos lo atributos
     */
    private String model;
    private int numSeats;
    private double topVelocity;
    private boolean activate = false;

    public Avion(String model, int numSeats, double topVelocity) {
        this.model = model;
        this.numSeats = numSeats;
        this.topVelocity = topVelocity;
    }

    public Avion() {
        this("", 0, 0);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public double getTopVelocity() {
        return topVelocity;
    }

    public void setTopVelocity(double topVelocity) {
        this.topVelocity = topVelocity;
    }

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
        final Avion other = (Avion) obj;
        return Objects.equals(this.model, other.model);
    }
    
    

    @Override
    public String toString() {
        return "Avion: " + "\nmodel: " + model + "\nnumSeats: " + numSeats + "\ntopVelocity: " + topVelocity;
    }

    @Override
    public boolean isActivable() {
        return activate;
    }

    @Override
    public void setActivado(boolean value) {
        this.activate = value;
    }

}
