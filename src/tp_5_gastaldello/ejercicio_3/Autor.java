package tp_5_gastaldello.ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class Autor {
    
    private String nombre;
    private String nacionalidad;
    
    public Autor(){}
    
    public Autor(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

}
