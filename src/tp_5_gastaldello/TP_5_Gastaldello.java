package tp_5_gastaldello;

/**
 *
 * @author Kevin Gastaldello
 */
public class TP_5_Gastaldello {

    public static void main(String[] args) {
        
        // Crear el Banco
        Banco banco = new Banco("Banco Patagonia", "30-12345678-9");

        // Crear el Cliente
        Cliente cliente = new Cliente("Kevin Gastaldello", "12345678");

        // Crear la Tarjeta de Crédito
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28");

        // Vincular las relaciones bidireccionales y agregación
        tarjeta.setCliente(cliente);
        cliente.setTarjeta(tarjeta);
        tarjeta.setBanco(banco);

        // Imprimir información de la Tarjeta
        System.out.println("=== Información de la Tarjeta de Crédito ===");
        System.out.println("Número: " + tarjeta.getNumero());
        System.out.println("Fecha de Vencimiento: " + tarjeta.getFechaVencimiento());
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre() +
                           ", DNI: " + tarjeta.getCliente().getDni());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre() +
                           ", CUIT: " + tarjeta.getBanco().getCuit());

        // Imprimir información del Cliente
        System.out.println("\n=== Información del Cliente ===");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Tarjeta Número: " + cliente.getTarjeta().getNumero());
        System.out.println("Tarjeta Vencimiento: " + cliente.getTarjeta().getFechaVencimiento());
        

    }

}
