package POODDR.Aeropuerto;

/**
 *
 * @author sergioyana
 */
public class Adress {

    private String country;
    private String street;
    private int number;
    private String town;

    public Adress() {
        this("","",0,"");
    }

    public Adress(String country, String street, int number, String town) {
        this.country = country;
        this.street = street;
        this.number = number;
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "\ncountry: " + country + "\nstreet: " + street + "\nnumber: " + number + "\ntown: " + town;
    }

}
