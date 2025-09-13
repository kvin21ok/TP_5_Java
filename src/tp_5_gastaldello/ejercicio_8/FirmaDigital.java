package tp_5_gastaldello.ejercicio_8;

/**
 *
 * @author Kevin Gastaldello
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;
    
    public FirmaDigital(){}
    
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario){
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public String getCodigoHash(){
        return codigoHash;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        if (usuario != null){
            this.usuario = usuario;
        } else {
            System.out.println("La firma no tiene usuario pero el usuario sigue existiendo");
        }
    }
}
