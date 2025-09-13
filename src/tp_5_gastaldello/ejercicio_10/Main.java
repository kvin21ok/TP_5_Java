package tp_5_gastaldello.ejercicio_10;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear un titular
        Titular titular = new Titular("Kevin Gastaldello", "12345678");

        // Crear una cuenta bancaria con clave de seguridad
        CuentaBancaria cuenta = new CuentaBancaria("0001-0002-0003", 5000.0, "abc123", "12/09/2025");

        // Asociar el titular a la cuenta (bidireccional)
        cuenta.setTitular(titular);

        // Mostrar datos
        System.out.println("Cuenta CBU: " + cuenta.getCbu());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());
        System.out.println("Última modificación de clave: " + cuenta.getClave().getUltimaModificacion());
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());

        // Verificar la bidireccionalidad
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
        
        // Crear una cuenta bancaria con clave
        CuentaBancaria cuenta2 = new CuentaBancaria("0001-0002", 1000.0, "abc124", "12/09/2025");

        // Acceder a la clave desde la cuenta
        System.out.println("Clave antes de borrar la cuenta: " + cuenta2.getClave().getCodigo());

        // "Borrar" la cuenta asignando null
        cuenta2 = null;

        // En este punto, si no tenemos otra referencia a la clave,
        // el objeto ClaveSeguridad queda inaccesible
        // No podemos hacer esto: cuenta.getClave() // --> ERROR, la cuenta ya no existe

        System.out.println("La cuenta fue eliminada, por lo que la clave también queda inaccesible si no hay otra referencia.");
    }

}
