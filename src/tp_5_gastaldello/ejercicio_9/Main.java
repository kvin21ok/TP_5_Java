package tp_5_gastaldello.ejercicio_9;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    public static void main(String[] args) {
        // Crear paciente y profesional
        Paciente paciente = new Paciente("Kevin Gastaldello", "OSDE");
        Profesional profesional = new Profesional("Dra. María Pérez", "Cardiología");

        // Crear cita médica y asignar paciente y profesional
        CitaMedica cita = new CitaMedica("2025-09-12", "15:30");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        // Mostrar información de la cita
        System.out.println("=== Información de la Cita Médica ===");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre() + ", Obra Social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + ", Especialidad: " + cita.getProfesional().getEspecialidad());
    }

}
