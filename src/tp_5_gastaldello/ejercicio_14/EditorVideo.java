package tp_5_gastaldello.ejercicio_14;

/**
 *
 * @author Kevin Gastaldello
 */
public class EditorVideo {
    
    private boolean estaEncendido;
    
    public void encender(){
        estaEncendido = true;
    }
    
    public void exportar(String formato, Proyecto proyecto){
        if (estaEncendido){
            Render render = new Render(formato);
            render.setProyecto(proyecto);
            System.out.println("Render creado en formato " +render.getFormato() +" para el proyecto " +render.getProyecto().getNombre());
        } else {
            System.out.println("El editor esta apagado");
        }
    }

}
