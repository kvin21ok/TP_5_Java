package tp_5_gastaldello.ejercicio_8;

/**
 *
 * @author Kevin Gastaldello
 */
public class Usuario {
    
    private String nombre;
    private String email;
    
    public Usuario(){}
    
    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
