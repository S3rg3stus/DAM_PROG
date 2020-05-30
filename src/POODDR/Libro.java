package POODDR;

/**
 *
 * @author sergioyana
 */
public class Libro {

    /**
     * variables
     */
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    /**
     * empty builder method
     */
    public Libro() {
    }

    /**
     * builder method with parameters
     * 
     * @param ISBN
     * @param titulo
     * @param autor
     * @param numPaginas 
     */
    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    /**
     * getters and setters
     * 
     * @return 
     */
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * toString method
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Libro:" + "\nISBN: " + ISBN + "\ntitulo: " + titulo + "\nautor: " + autor + "\nnumPaginas: " + numPaginas;
    }
    
    

}
