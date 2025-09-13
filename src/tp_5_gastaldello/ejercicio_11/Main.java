package tp_5_gastaldello.ejercicio_11;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear un artista
        Artista artista = new Artista("The Beatles", "Rock");

        // Crear una canción y asignarle el artista
        Cancion cancion = new Cancion("Hey Jude");
        cancion.setArtista(artista);

        // Crear el reproductor
        Reproductor reproductor = new Reproductor();

        // Intentar reproducir antes de encender
        reproductor.reproducir(cancion);

        // Encender el reproductor
        reproductor.encender();

        // Reproducir la canción
        reproductor.reproducir(cancion);
    }

}
