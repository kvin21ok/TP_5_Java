package tp_5_gastaldello.ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Bateria {
    
    private String modelo;
    private int capacidad;
    
    public Bateria(){}
    
    public Bateria(String modelo, int capacidad){
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getCapacidad(){
        return capacidad;
    }

}
