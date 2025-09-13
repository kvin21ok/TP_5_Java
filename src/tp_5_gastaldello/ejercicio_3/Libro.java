package tp_5_gastaldello.ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    
    public Libro(){}
    
    public Libro(String titulo, String isbn, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public Autor getAutor(){
        return autor;
    }
    public void setAutor(Autor autor){
        if (autor != null){
            this.autor = autor;
        }
    }
    
    public Editorial getEditorial(){
        return editorial;
    }
    public void setEditorial(Editorial editorial){
        if (editorial != null){
            this.editorial = editorial;
        } else {
            System.out.println("El libro no tiene editorial pero la editorial sigue existiendo");
        }
    }

}
