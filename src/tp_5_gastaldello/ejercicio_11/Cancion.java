package tp_5_gastaldello.ejercicio_11;

/**
 *
 * @author Kevin Gastaldello
 */
public class Cancion {
    
    private String titulo;
    private Artista artista;
    
    public Cancion(){}
    
    public Cancion(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        if (titulo != null){
            this.titulo = titulo;
        }
    }
    
    public Artista getArtista(){
        return artista;
    }
    public void setArtista(Artista artista){
        if (artista != null){
            this.artista = artista;
        }
    }
    
}
