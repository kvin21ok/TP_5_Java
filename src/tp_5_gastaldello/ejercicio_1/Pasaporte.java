package tp_5_gastaldello.ejercicio_1;

import tp_5_gastaldello.ejercicio_1.Titular;

/**
 *
 * @author Kevin Gastaldello
 */
public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
        this.titular = titular;
        if (titular != null){
            titular.setPasaporte(this);
        }
    }
    
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getFechaEmision(){
        return fechaEmision;
    }
    public void setFechaEmision(String fechaEmision){
        this.fechaEmision = fechaEmision;
    }
    
    public Foto getFoto(){
        return foto;
    }
    
    public Titular getTitular(){
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    

}
