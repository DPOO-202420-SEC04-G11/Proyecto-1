
package controller;

import model.*;
import persistence.Persistencia;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private Persistencia persistencia;
    private List<User> usuarios;
    private List<LearningPath> learningPaths;
    private List<Inscripcion> inscripciones;

    public Controlador() {
        this.persistencia = new Persistencia();
        this.usuarios = persistencia.cargarUsuarios();
        this.learningPaths = persistencia.cargarLearningPaths();
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirEstudianteEnLearningPath(Estudiante estudiante, LearningPath learningPath) {
        Inscripcion inscripcion = new Inscripcion(estudiante, learningPath, new java.util.Date());
        inscripciones.add(inscripcion);
        persistencia.guardarInscripciones(inscripciones);
        System.out.println("Estudiante inscrito en Learning Path exitosamente.");
    }

    public void calificarActividad(Profesor profesor, Actividad actividad, Estudiante estudiante, int puntaje) {
        if (profesor.esProfesor()) {
            boolean aprobado = puntaje >= 60; // Asumiendo 60 como puntaje mínimo para aprobar
            Calificacion calificacion = new Calificacion(actividad, estudiante, puntaje, aprobado);
            System.out.println("Actividad calificada: " + calificacion);
        } else {
            System.out.println("Permiso denegado: Solo los profesores pueden calificar.");
        }
    }

    public void completarActividad(Estudiante estudiante, Actividad actividad) {
        if (actividad.validarPrerrequisitos(estudiante.getActividadesCompletadas())) {
            actividad.marcarComoCompletada();
            estudiante.registrarActividadCompletada(actividad);
            System.out.println("Actividad completada exitosamente.");
        } else {
            System.out.println("Advertencia: No has completado los prerrequisitos para esta actividad.");
        }
    }

    public void mostrarProgresoEstudiante(Estudiante estudiante, LearningPath learningPath) {
        int progreso = estudiante.calcularProgreso(learningPath);
        System.out.println("Progreso en " + learningPath.getTitulo() + ": " + progreso + "%");
    }

    public void crearLearningPath(Profesor profesor, String titulo, String descripcion, String dificultad, int duracion) {
        if(profesor.esProfesor()) {
            LearningPath learningPath = new LearningPath(titulo, descripcion, dificultad, duracion, duracion, null);
            learningPaths.add(learningPath);
            persistencia.guardarLearningPaths(learningPaths);
            System.out.println("Learning Path creado exitosamente.");
        } else {
            System.out.println("Permiso denegado: Solo los profesores pueden crear Learning Paths.");
        }
    }
}
