package POODDR;

/**
 *
 * @author sergioyana
 */
public class Seat {

    private char letter;
    private int file;
    private Espectador viewer;

    public Seat(char letter, int file) {
        this.letter = letter;
        this.file = file;
        viewer = null;
    }

    public Seat() {
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public Espectador getViewer() {
        return viewer;
    }

    public void setViewer(Espectador viewer) {
        this.viewer = viewer;
    }

    public boolean occupied(){
        return viewer != null;
    }
    public int ageViewer(){
        return viewer.getAge();
    }

    @Override
    public String toString() {
        return "Seat{" + "letter=" + letter + ", file=" + file + ", viewer=" + viewer + '}';
    }
    
}
