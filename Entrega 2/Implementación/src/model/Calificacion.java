
package model;

public class Calificacion {
    private Actividad actividad;
    private Estudiante estudiante;
    private int puntaje;
    private boolean aprobado;

    public Calificacion(Actividad actividad, Estudiante estudiante, int puntaje, boolean aprobado) {
        this.actividad = actividad;
        this.estudiante = estudiante;
        this.puntaje = puntaje;
        this.aprobado = aprobado;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    @Override
    public String toString() {
        return "Calificacion: " + actividad.getDescripcion() + " - Estudiante: " + estudiante.getNombre() + " - Puntaje: " + puntaje + " - Aprobado: " + aprobado;
    }
}
