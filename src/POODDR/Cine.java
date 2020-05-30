package POODDR;

/**
 *
 * @author sergioyana
 */
public class Cine {

    private Seat seat[][];
    private double price;
    private Pelicula film;

    public Cine(int files, int columns, double price, Pelicula film) {
        seat = new Seat[files][columns];
        this.price = price;
        this.film = film;
    }

    public Seat[][] getSeat() {
        return seat;
    }

    public void setSeat(Seat[][] seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pelicula getFilm() {
        return film;
    }

    public void setFilm(Pelicula film) {
        this.film = film;
    }

    private void fillCinema() {

        int file = seat.length;
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[0].length; j++) {
                seat[i][j] = new Seat((char) ('A' + j), file);
            }

            file--;
        }
    }

    public boolean thereIsRoom() {

        boolean thereIsRoom = false;
        for (int i = 0; i < seat.length && !thereIsRoom; i++) {
            for (int j = 0; j < seat[0].length && !thereIsRoom; j++) {
                if (!seat[i][j].occupied()) {
                    thereIsRoom = true;
                }
            }
        }
        return thereIsRoom;
    }

    public boolean thereIsSeat(int file, char letter) {
        return getSeat(file, letter).occupied();
    }

    public boolean haveMoney(Espectador a) {
        return a.getMoney() > price;
    }

    public boolean heCanSit(int file, char letter, Espectador e) {
        return haveMoney(e) && film.hesOld(e) && thereIsSeat(file, letter);
    }

    public void Sit(int file, char letter, Espectador e) {
        seat[seat.length - file][letter - 'A'].setViewer(e);
    }

    public Seat getSeat(int file, char letter) {
        return seat[seat.length - file][letter - 'A'];
    }

    public int getFile() {
        return seat.length;
    }

    public int getColumns() {
        return seat[0].length;
    }

    public void Show() {
        for (int i = 0; i < seat.length; i++) {

            for (int j = 0; j < seat[0].length; j++) {
                System.out.println(seat[i][j]);
            }
            System.out.println("");
        }
    }
}
