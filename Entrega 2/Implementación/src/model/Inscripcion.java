
package model;

import java.util.Date;

public class Inscripcion {
    private Estudiante estudiante;
    private LearningPath learningPath;
    private Date fechaInscripcion;
    private int progreso;

    public Inscripcion(Estudiante estudiante, LearningPath learningPath, Date fechaInscripcion) {
        this.estudiante = estudiante;
        this.learningPath = learningPath;
        this.fechaInscripcion = fechaInscripcion;
        this.progreso = 0; // Inicialmente sin progreso
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public LearningPath getLearningPath() {
        return learningPath;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public int getProgreso() {
        return progreso;
    }

    public void actualizarProgreso(int nuevoProgreso) {
        this.progreso = nuevoProgreso;
    }

    @Override
    public String toString() {
        return "Inscripcion: " + estudiante.getNombre() + " en " + learningPath.getTitulo() + ", Progreso: " + progreso + "%";
    }
}
