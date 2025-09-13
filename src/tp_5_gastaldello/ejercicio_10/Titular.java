package tp_5_gastaldello.ejercicio_10;

/**
 *
 * @author Kevin Gastaldello
 */
public class Titular {
    
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    
    public Titular(){}
    
    public Titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre != null){
            this.nombre = nombre;
        }
    }
    
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        if (dni != null){
            this.dni = dni;
        }
    }
    
    public CuentaBancaria getCuenta(){
        return cuenta;
    }
    public void setCuenta(CuentaBancaria cuenta){
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this){
            cuenta.setTitular(this);
        }
    }

}
