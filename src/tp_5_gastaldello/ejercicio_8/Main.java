package tp_5_gastaldello.ejercicio_8;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Kevin Gastaldello", "kevin@mail.com");

        // Crear documento con firma digital (composición fuerte)
        Documento documento = new Documento(
                "Contrato de Prueba",
                "Contenido del contrato",
                "ABC123HASH",
                "2025-09-11",
                usuario
        );

        // Mostrar información del documento
        System.out.println("=== Información del Documento ===");
        System.out.println("Título: " + documento.getTitulo());
        System.out.println("Contenido: " + documento.getContenido());
        System.out.println("Firma Código Hash: " + documento.getFirma().getCodigoHash());
        System.out.println("Firma Fecha: " + documento.getFirma().getFecha());
        System.out.println("Usuario: " + documento.getFirma().getUsuario().getNombre() +
                           ", Email: " + documento.getFirma().getUsuario().getEmail());

        // Mostrar información del usuario
        System.out.println("\n=== Información del Usuario ===");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        
         // Crear usuario
        Usuario usuario2 = new Usuario("Andres Torres", "kevin@mail.com");

        // Crear documento con firma digital
        Documento documento2 = new Documento(
                "Contrato de Prueba",
                "Contenido del contrato",
                "ABC123HASH",
                "2025-09-11",
                usuario2
        );

        // Accedemos a la firma desde el documento
        System.out.println("Firma antes de borrar el documento: " + documento.getFirma().getCodigoHash());

        // Borramos el documento
        documento2 = null;

        // Intentamos acceder a la firma
        // La siguiente línea daría NullPointerException si intentamos:
        //System.out.println(documento2.getFirma().getCodigoHash());

        System.out.println("El documento fue borrado, por lo tanto su firma también dejó de existir.");
    }

}
