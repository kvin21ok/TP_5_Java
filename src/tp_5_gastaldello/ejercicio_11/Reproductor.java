package tp_5_gastaldello.ejercicio_11;

/**
 *
 * @author Kevin Gastaldello
 */
public class Reproductor {
    
    private boolean estaEncendido;
    
    public void encender(){
        estaEncendido = true;
    }
    
    public void reproducir(Cancion cancion){
        if (estaEncendido){
            System.out.println("Reproduciendo: " +cancion.getTitulo());
        } else {
            System.out.println("Reproductor apagado");
        }
    }

}
