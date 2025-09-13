package tp_5_gastaldello.ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {

        // Crear el Autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");

        // Crear la Editorial
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");

        // Crear el Libro
        Libro libro = new Libro("Cien años de soledad", "978-3-16-148410-0", editorial); // agregacion
        libro.setAutor(autor);         // asignar autor (unidireccional)

        // Imprimir información del Libro
        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Autor: " + libro.getAutor().getNombre() +
                           ", Nacionalidad: " + libro.getAutor().getNacionalidad());
        System.out.println("Editorial: " + libro.getEditorial().getNombre() +
                           ", Dirección: " + libro.getEditorial().getDireccion());
        
        libro.setEditorial(null);
        System.out.println(editorial.getNombre());
    }

}
