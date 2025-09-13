package tp_5_gastaldello.ejercicio_14;

/**
 *
 * @author Kevin Gastaldello
 */
public class Render {
    
    private String formato;
    private Proyecto proyecto;
    
    public Render(){}
    
    public Render(String formato){
        this.formato = formato;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public Proyecto getProyecto(){
        return proyecto;
    }
    public void setProyecto(Proyecto proyecto){
        if (proyecto != null){
            this.proyecto = proyecto;
        }
    }

}
