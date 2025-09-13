package tp_5_gastaldello.ejercicio_7;

/**
 *
 * @author Kevin Gastaldello
 */
public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(){}
    
    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public String getPatente(){
        return patente;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor motor){
        if (motor != null){
            this.motor = motor;
        } else {
            System.out.println("El vehiculo no tiene motor pero el motor sigue existiendo");
        }
    }
    
    public Conductor getConductor(){
        return conductor;
    }
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

}
