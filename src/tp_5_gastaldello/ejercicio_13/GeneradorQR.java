package tp_5_gastaldello.ejercicio_13;

/**
 *
 * @author Kevin Gastaldello
 */
public class GeneradorQR {
    
    private boolean estaEncendido;
    
    public void encender(){
        estaEncendido = true;
    }
    
    public void generar(String valor, Usuario usuario){
        if (estaEncendido){
            CodigoQR codigo = new CodigoQR(valor);
            codigo.setUsuario(usuario);
            System.out.println("Codigo generado: " +codigo.getValor() +" para el usuario: " +usuario.getNombre());
        } else {
            System.out.println("El generador esta apagado");
        }
        
    }

}
