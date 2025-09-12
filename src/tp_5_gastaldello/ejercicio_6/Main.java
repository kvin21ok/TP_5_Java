package tp_5_gastaldello.ejercicio_6;

/**
 *
 * @author Kevin Gastaldello
 */

public class Main {
    public static void main(String[] args) {

        // Crear Cliente
        Cliente cliente = new Cliente("Kevin Gastaldello", "12345678");

        // Crear Mesa
        Mesa mesa = new Mesa(10, 4);

        // Crear Reserva
        Reserva reserva = new Reserva("2025-09-12", "20:00");

        // Vincular relaciones
        reserva.setCliente(cliente);  // Asociación unidireccional
        reserva.setMesa(mesa);        // Agregación

        // Imprimir información de la Reserva
        System.out.println("=== Información de la Reserva ===");
        System.out.println("Fecha: " + reserva.getFecha());
        System.out.println("Hora: " + reserva.getHora());
        System.out.println("Cliente: " + reserva.getCliente().getNombre() + ", Tel: " + reserva.getCliente().getTelefono());
        System.out.println("Mesa: Número " + reserva.getMesa().getNumero() + ", Capacidad: " + reserva.getMesa().getCapacidad());
    }
}