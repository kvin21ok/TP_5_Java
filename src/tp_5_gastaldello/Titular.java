package tp_5_gastaldello;

/**
 *
 * @author Kevin Gastaldello
 */
public class Titular {
    
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
    }
    
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDni(){
        return dni;
    }

}
