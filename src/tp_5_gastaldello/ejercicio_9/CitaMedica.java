package tp_5_gastaldello.ejercicio_9;

/**
 *
 * @author Kevin Gastaldello
 */
public class CitaMedica {
    
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(){}
    
    public CitaMedica(String fecha, String hora){
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public String getHora(){
        return hora;
    }
    
    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        if (paciente != null){
            this.paciente = paciente;
        }
    }
    
    public Profesional getProfesional(){
        return profesional;
    }
    public void setProfesional(Profesional profesional){
        if (profesional != null){
            this.profesional = profesional;
        }
    }

}
