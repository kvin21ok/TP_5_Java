package tp_5_gastaldello.ejercicio_7;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args) {

        // Crear Motor
        Motor motor = new Motor("V8", "M12345");

        // Crear Conductor
        Conductor conductor = new Conductor("Kevin Gastaldello", "LIC123456");

        // Crear Vehículo
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang");

        // Vincular relaciones
        vehiculo.setMotor(motor);          // Agregación
        vehiculo.setConductor(conductor);  // Asociación bidireccional
        conductor.setVehiculo(vehiculo);   // Asociación bidireccional

        // Imprimir información del Vehículo
        System.out.println("=== Información del Vehículo ===");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo() + ", Serie: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre() + ", Licencia: " + vehiculo.getConductor().getLicencia());

        // Imprimir información del Conductor
        System.out.println("\n=== Información del Conductor ===");
        System.out.println("Nombre: " + conductor.getNombre());
        System.out.println("Licencia: " + conductor.getLicencia());
        System.out.println("Vehículo Patente: " + conductor.getVehiculo().getPatente());
        System.out.println("Vehículo Modelo: " + conductor.getVehiculo().getModelo());
    }

}
