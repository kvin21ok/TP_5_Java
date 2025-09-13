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
    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getNumeroSerie(){
        return numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre(){
        return placaMadre;
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }

}
