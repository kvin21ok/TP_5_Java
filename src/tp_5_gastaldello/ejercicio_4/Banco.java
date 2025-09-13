package tp_5_gastaldello.ejercicio_4;

/**
 *
 * @author Kevin Gastaldello
 */
public class Banco {
    
    private String nombre;
    private String cuit;
    
    public Banco(){}
    
    public Banco(String nombre, String cuit){
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCuit(){
        return cuit;
    }
    

}
