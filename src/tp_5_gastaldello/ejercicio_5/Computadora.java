package tp_5_gastaldello.ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    public Computadora(){}
    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
        this.propietario = propietario;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre(){
        return placaMadre;
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
    }

}
