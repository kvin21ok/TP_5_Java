package tp_5_gastaldello.ejercicio_1;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        
        // 1️⃣ Crear el titular
        Titular titular = new Titular("Kevin Gastaldello", "40545665");
        
        // 2️⃣ Crear la foto
        Foto foto = new Foto("foto_pasaporte.jpg", "jpg");
        
        // 3️⃣ Crear el pasaporte y asignar titular y foto
        Pasaporte pasaporte = new Pasaporte("P1234567", "2025-09-10", foto, titular);
        
        // 4️⃣ Probar la relación bidireccional
        System.out.println("----- Datos del Pasaporte -----");
        System.out.println("Número: " + pasaporte.getNumero());
        System.out.println("Fecha de emisión: " + pasaporte.getFechaEmision());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen() 
                           + " (Formato: " + pasaporte.getFoto().getFormato() + ")");
        
        System.out.println("\n----- Datos desde el Titular -----");
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
    }

}
