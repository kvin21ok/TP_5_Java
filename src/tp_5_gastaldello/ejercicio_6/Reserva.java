package tp_5_gastaldello.ejercicio_6;

/**
 *
 * @author Kevin Gastaldello
 */
public class Reserva {
    
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
    public Reserva(){}
    
    public Reserva(String fecha, String hora, Mesa mesa){
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public String getHora(){
        return hora;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        if (cliente != null){
            this.cliente = cliente;
        }
    }
    
    public Mesa getMesa(){
        return mesa;
    }
    public void setMesa(Mesa mesa){
        if (mesa != null){
            this.mesa = mesa;
        } else {
            System.out.println("La reserva no tiene mesa pero la mesa sigue existiendo");
        }
    }

}
