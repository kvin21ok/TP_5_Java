package tp_5_gastaldello.ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {

        // 1️⃣ Crear la batería
        Bateria bateria = new Bateria("ModeloX", 4000);

        // 2️⃣ Crear el celular
        Celular celular = new Celular("123456789012345", "Samsung", "A51");
        celular.setBateria(bateria); // asignar batería

        // 3️⃣ Crear el usuario
        Usuario usuario = new Usuario("Kevin Gastaldello", "12345678");
        usuario.setCelular(celular); // vincular usuario con celular
        celular.setUsuario(usuario); // vincular celular con usuario (bidireccional)

        // 4️⃣ Imprimir información
        System.out.println("=== Información del Celular ===");
        System.out.println("IMEI: " + celular.getImei());
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Batería: " + celular.getBateria().getModelo() +
                           ", " + celular.getBateria().getCapacidad() + "mAh");
        System.out.println("Usuario: " + celular.getUsuario().getNombre() +
                           ", DNI: " + celular.getUsuario().getDni());

        System.out.println("\n=== Información del Usuario ===");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("DNI: " + usuario.getDni());
        System.out.println("Celular IMEI: " + usuario.getCelular().getImei());
        System.out.println("Celular Marca: " + usuario.getCelular().getMarca());
    }

}
