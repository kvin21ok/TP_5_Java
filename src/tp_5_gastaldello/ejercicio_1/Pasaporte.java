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
    
    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this);
    }
    
    public Foto getFoto(){
        return foto;
    }
    
    public Titular getTitular(){
        return titular;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getFechaEmision(){
        return fechaEmision;
    }

}
