package tp_5_gastaldello.ejercicio_7;

/**
 *
 * @author Kevin Gastaldello
 */
public class Conductor {
    
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    
    public Conductor(){}
    
    public Conductor(String nombre, String licencia){
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getLicencia(){
        return licencia;
    }
    public void setLicencia(String licencia){
        this.licencia = licencia;
    }
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

}
