package tp_5_gastaldello.ejercicio_14;

/**
 *
 * @author Kevin Gastaldello
 */
public class Proyecto {
    
    private String nombre;
    private int duracionMin;
    
    public Proyecto(){}
    
    public Proyecto(String nombre, int duracionMin){
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDuracionMin(){
        return duracionMin;
    }

}
