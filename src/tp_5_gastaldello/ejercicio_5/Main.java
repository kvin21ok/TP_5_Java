package tp_5_gastaldello.ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear la PlacaMadre
        PlacaMadre placa = new PlacaMadre("ASUS ROG", "Z490");

        // Crear el Propietario
        Propietario propietario = new Propietario("Kevin Gastaldello", "12345678");

        // Crear la Computadora
        Computadora pc = new Computadora("Dell", "SN12345");

        // Vincular relaciones
        pc.setPlacaMadre(placa);        // Composición
        pc.setPropietario(propietario); // Asociación bidireccional
        propietario.setComputadora(pc);

        // Imprimir información de la Computadora
        System.out.println("=== Información de la Computadora ===");
        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Número de Serie: " + pc.getNumeroSerie());
        System.out.println("PlacaMadre: " + pc.getPlacaMadre().getModelo() + ", Chipset: " + pc.getPlacaMadre().getChipset());
        System.out.println("Propietario: " + pc.getPropietario().getNombre() + ", DNI: " + pc.getPropietario().getDni());

        // Imprimir información del Propietario
        System.out.println("\n=== Información del Propietario ===");
        System.out.println("Nombre: " + propietario.getNombre());
        System.out.println("DNI: " + propietario.getDni());
        System.out.println("Computadora Marca: " + propietario.getComputadora().getMarca());
        System.out.println("Computadora Número de Serie: " + propietario.getComputadora().getNumeroSerie());
    }

}
