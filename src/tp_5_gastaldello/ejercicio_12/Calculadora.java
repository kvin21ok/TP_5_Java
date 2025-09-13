package tp_5_gastaldello.ejercicio_12;

/**
 *
 * @author Kevin Gastaldello
 */
public class Calculadora {
    
    private boolean estaEncendida;
    
    public void encender(){
        estaEncendida = true;
    }
    
    public void calcular(Impuesto impuesto){
        final double PORCENTAJE = 0.10;
        double montoImpuesto = impuesto.getMonto() * PORCENTAJE;
        double total = (impuesto.getMonto() + montoImpuesto);
        if (estaEncendida){
            System.out.println("El impuesto sobre $" +impuesto.getMonto() +" es de $" +montoImpuesto +". El total a pagar es de $" +total);
        } else {
            System.out.println("La calculadora esta apagada!");
        }
    }

}
