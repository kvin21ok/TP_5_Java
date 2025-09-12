package tp_5_gastaldello.ejercicio_1;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        
        Titular titular = new Titular("Kevin Gastaldello", "12345678");
        Pasaporte pasaporte = new Pasaporte("A1234567", "2025-09-11", "foto123.jpg", "JPEG", titular);

        System.out.println("=== Información del Pasaporte ===");
        System.out.println("Número: " + pasaporte.getNumero());
        System.out.println("Fecha de Emisión: " + pasaporte.getFechaEmision());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen() + ", Formato: " + pasaporte.getFoto().getFormato());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre() + ", DNI: " + pasaporte.getTitular().getDni());

        System.out.println("\n=== Información del Titular ===");
        System.out.println("Nombre: " + titular.getNombre());
        System.out.println("DNI: " + titular.getDni());
        System.out.println("Pasaporte Número: " + titular.getPasaporte().getNumero());
    }

}
