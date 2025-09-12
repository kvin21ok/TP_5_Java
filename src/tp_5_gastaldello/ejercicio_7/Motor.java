package tp_5_gastaldello.ejercicio_7;

/**
 *
 * @author Kevin Gastaldello
 */
public class Motor {
    private String tipo;
    private String numeroSerie;
    
    public Motor(){}
    
    public Motor(String tipo, String numeroSerie){
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
}
