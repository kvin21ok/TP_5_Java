package tp_5_gastaldello.ejercicio_10;

/**
 *
 * @author Kevin Gastaldello
 */
public class ClaveSeguridad {
    
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(){}
    
    public ClaveSeguridad(String codigo, String ultimaModificacion){
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        if (codigo != null){
            this.codigo = codigo;
        }
    }
    
    public String getUltimaModificacion(){
        return ultimaModificacion;
    }
    public void setUltimaModificacion(String ultimaModificacion){
        if(ultimaModificacion != null){
            this.ultimaModificacion = ultimaModificacion;
        }
    }

}
