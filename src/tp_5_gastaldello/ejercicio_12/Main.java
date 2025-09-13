package tp_5_gastaldello.ejercicio_12;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear un contribuyente
        Contribuyente contribuyente = new Contribuyente("Ana Pérez", "20-12345678-9");

        // Crear un impuesto y asignarle el contribuyente
        Impuesto impuesto = new Impuesto(1500.0);
        impuesto.setContribuyente(contribuyente);

        // Crear la calculadora
        Calculadora calculadora = new Calculadora();

        // Intentar calcular antes de encender
        calculadora.calcular(impuesto);

        // Encender la calculadora
        calculadora.encender();

        // Calcular el impuesto
        calculadora.calcular(impuesto);

        // Mostrar información adicional
        System.out.println("Monto del impuesto: " + impuesto.getMonto());
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
    }
}
