package tp_5_gastaldello.ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class Propietario {
    
    private String nombre;
    private String dni;
    private Computadora computadora;
    
    public Propietario(){}
    
    public Propietario(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public Computadora getComputadora(){
        return computadora;
    }
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
    }

}
