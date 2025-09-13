package tp_5_gastaldello.ejercicio_13;

/**
 *
 * @author Kevin Gastaldello
 */
public class CodigoQR {
    
    private String valor;
    private Usuario usuario;
    
    public CodigoQR(){}
    
    public CodigoQR(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return valor;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        if (usuario != null){
            this.usuario = usuario;
        }
    }

}
