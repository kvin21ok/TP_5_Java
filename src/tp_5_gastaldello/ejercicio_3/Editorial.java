package tp_5_gastaldello.ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class Editorial {
    
    private String nombre;
    private String direccion;
    
    public Editorial(){}
    
    public Editorial(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }

}
