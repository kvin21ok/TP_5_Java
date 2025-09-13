package tp_5_gastaldello.ejercicio_6;

/**
 *
 * @author Kevin Gastaldello
 */
public class Mesa {
    
    private int numero;
    private int capacidad;
    
    public Mesa(){}
    
    public Mesa(int numero, int capacidad){
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getCapacidad(){
        return capacidad;
    }

}
