package tp_5_gastaldello.ejercicio_11;

/**
 *
 * @author Kevin Gastaldello
 */
public class Artista {
    
    private String nombre;
    private String genero;
    
    public Artista(){}
    
    public Artista(String nombre, String genero){
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        if (genero != null){
            this.genero = genero;
        }
    }
}
