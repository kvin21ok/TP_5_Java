package tp_5_gastaldello.ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
       // Creamos el propietario
        Propietario propietario = new Propietario("Kevin Gastaldello", "12345678");
        
        // Creamos la computadora con composición fuerte de PlacaMadre
        Computadora computadora = new Computadora(
                "Dell",
                "SN12345",
                "ASUS ROG",
                "Z490"
        );
        
        // Asignamos la computadora al propietario (asociación bidireccional)
        propietario.setComputadora(computadora);
        
        // Mostramos la información de la computadora
        System.out.println("=== Información de la Computadora ===");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Número de Serie: " + computadora.getNumeroSerie());
        System.out.println("PlacaMadre: " + computadora.getPlacaMadre().getModelo() + ", Chipset: " + computadora.getPlacaMadre().getChipset());
        System.out.println("Propietario: " + computadora.getPropietario().getNombre() + ", DNI: " + computadora.getPropietario().getDni());
        
        // Mostramos la información del propietario
        System.out.println("\n=== Información del Propietario ===");
        System.out.println("Nombre: " + propietario.getNombre());
        System.out.println("DNI: " + propietario.getDni());
        System.out.println("Computadora Marca: " + propietario.getComputadora().getMarca());
        System.out.println("Computadora Número de Serie: " + propietario.getComputadora().getNumeroSerie());
    }
    
}
