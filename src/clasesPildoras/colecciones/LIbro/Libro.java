package clasesPildoras.colecciones.LIbro;

/**
 *
 * @author sergioyana
 */
public class Libro {

    private String titulo, autor;
    private int ISBN;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro: " + "\ntitulo: " + titulo + "\nautor: " + autor + "\nISBN: " + ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.ISBN;
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
        final Libro other = (Libro) obj;
        return this.ISBN == other.ISBN;
    }

}
