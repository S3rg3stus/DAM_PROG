package POODDR;

/**
 *
 * @author sergioyana
 */
public class prinicipal {

    public static void main(String[] args) {
        Pelicula film = new Pelicula("", 90, 16, "Sergio");
        Cine cinema = new Cine(8, 9, 5.5, film);

        int numViewer = 20;
        int file = 0;
        char letter = 0;
        Espectador e;
        for (int i = 0; i < numViewer && cinema.thereIsRoom(); i++) {
            e = new Espectador(Methods.nombres[Methods.numeroAleatorio(0, Methods.nombres.length - 1)], Methods.numeroAleatorio(10, 30),
                    Methods.numeroAleatorioReal(1, 10));

            System.out.println(e);
            do {
                file = Methods.numeroAleatorio(0, cinema.getFile() - 1);
                letter = (char) Methods.numeroAleatorio('A', 'A' + (cinema.getColumns()-1));

            } while (cinema.thereIsSeat(file, letter));

            if (cinema.heCanSit(file, letter, e)) {
                cinema.Sit(file, letter, e);
                
            }
            
            cinema.Show();
            System.out.println("Fin");
        }
    }
}
