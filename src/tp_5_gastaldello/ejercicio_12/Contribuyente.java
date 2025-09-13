package tp_5_gastaldello.ejercicio_12;

/**
 *
 * @author Kevin Gastaldello
 */
public class Contribuyente {
    
    private String nombre;
    private String cuil;
    
    public Contribuyente(){}
    
    public Contribuyente(String nombre, String cuil){
        this.nombre = nombre;
        this.cuil = cuil;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCuil(){
        return cuil;
    }

}
