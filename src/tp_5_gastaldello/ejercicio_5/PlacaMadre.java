package tp_5_gastaldello.ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class PlacaMadre {
    
    private String modelo;
    private String chipset;
    
    public PlacaMadre(){}
    
    public PlacaMadre(String modelo, String chipset){
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getChipset(){
        return chipset;
    }
    public void setChipset(String chipset){
        this.chipset = chipset;
    }

}
