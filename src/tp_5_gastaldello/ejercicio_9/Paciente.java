package tp_5_gastaldello.ejercicio_9;

/**
 *
 * @author Kevin Gastaldello
 */
public class Paciente {
    
    private String nombre;
    private String obraSocial;
    
    public Paciente(){}
    
    public Paciente(String nombre, String obraSocial){
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getObraSocial(){
        return obraSocial;
    }
    public void setObraSocial(String obraSocial){
        this.obraSocial = obraSocial;
    }

}
