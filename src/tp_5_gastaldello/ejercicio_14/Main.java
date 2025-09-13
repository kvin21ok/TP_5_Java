package tp_5_gastaldello.ejercicio_14;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear un proyecto
        Proyecto proyecto = new Proyecto("Hola Mundo", 15);

        // Crear el editor de video
        EditorVideo editor = new EditorVideo();

        // Intentar exportar antes de encender
        editor.exportar("MP4", proyecto);

        // Encender el editor
        editor.encender();

        // Exportar el proyecto a distintos formatos
        editor.exportar("MP4", proyecto);
        editor.exportar("AVI", proyecto);
    }

}
