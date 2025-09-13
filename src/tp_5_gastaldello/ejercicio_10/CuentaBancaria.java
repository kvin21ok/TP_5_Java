package tp_5_gastaldello.ejercicio_10;

/**
 *
 * @author Kevin Gastaldello
 */
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    
    public CuentaBancaria(){}
    
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion){
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    public String getCbu(){
        return cbu;
    }
    public void setCbu(String cbu){
        if (cbu != null){
            this.cbu = cbu;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        if (saldo >= 0){ // no podemos comparar con null, puede haber una cuenta en rojo pero quise agregar esta validadcion para practicar
            this.saldo = saldo;
        }
    }
    
    public ClaveSeguridad getClave(){
        return clave;
    }
    public void setClave(ClaveSeguridad clave){
        if (clave != null){
            this.clave = clave;
        }
    }
    
    public Titular getTitular(){
        return titular;
    }
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this){
            titular.setCuenta(this);
        }
    }

}
