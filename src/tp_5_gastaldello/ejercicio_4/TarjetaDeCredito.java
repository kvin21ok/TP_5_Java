package tp_5_gastaldello.ejercicio_4;

/**
 *
 * @author Kevin Gastaldello
 */
public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;    
    
    public TarjetaDeCredito(){}
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }
    
    public Banco getBanco(){
        return banco;
    }
    public void setBanco(Banco banco){
        if (banco != null){
            this.banco = banco;
        } else {
            System.out.println("La tarjeta no tiene banco pero el banco sigue existiendo");
        }
    }

}
