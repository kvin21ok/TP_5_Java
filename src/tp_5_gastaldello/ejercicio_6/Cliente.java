package tp_5_gastaldello.ejercicio_6;

/**
 *
 * @author Kevin Gastaldello
 */
public class Cliente {
    
    private String nombre;
    private String telefono;
    
    public Cliente(){}
    
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

}
