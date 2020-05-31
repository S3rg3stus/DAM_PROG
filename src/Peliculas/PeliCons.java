package Peliculas;

import java.time.LocalDate;

/**
 *
 * @author sergioyana
 */
public class PeliCons implements Comparable<PeliCons> {

    String codigo, autor, titulo;
    LocalDate fecha;

    public PeliCons() {
    }
    
    public PeliCons(String codigo, String autor, String titulo, LocalDate fecha) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    @Override
    public int compareTo(PeliCons t) {
        return this.codigo.compareToIgnoreCase(t.codigo);
    }

}
