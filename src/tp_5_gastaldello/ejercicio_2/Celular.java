package tp_5_gastaldello.ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(){}
    
    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public String getImei(){
        return imei;
    }    
    
    public String getMarca(){
        return marca;
    }    
    
    public String getModelo(){
        return modelo;
    }    
    
    public Bateria getBateria(){
        return bateria;
    }    
    public void setBateria(Bateria bateria){
        if (bateria != null){
            this.bateria = bateria;
        } else {
            System.out.println("El celular no tiene bateria pero esta sigue existiendo");
        }
    }
    
    public Usuario getUsuario(){
        return usuario;
    }    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }

}
