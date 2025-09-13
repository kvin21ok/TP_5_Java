package tp_5_gastaldello.ejercicio_13;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Kevin Gastaldello", "kevin@email.com");

        // Crear el generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Intentar generar antes de encender
        generador.generar("QR-001", usuario);

        // Encender el generador
        generador.encender();

        // Generar un código QR
        generador.generar("QR-002", usuario);
    }

}
