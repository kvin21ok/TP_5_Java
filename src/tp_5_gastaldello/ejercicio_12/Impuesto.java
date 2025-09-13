package tp_5_gastaldello.ejercicio_12;

/**
 *
 * @author Kevin Gastaldello
 */
public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;
    
    public Impuesto(){}
    
    public Impuesto(double monto){
        this.monto = monto;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public Contribuyente getContribuyente(){
        return contribuyente;
    }
    public void setContribuyente(Contribuyente contribuyente){
        if (contribuyente != null){
            this.contribuyente = contribuyente;
        }
    }

}
