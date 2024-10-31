
package model;

public class Profesor extends User {
    
    public Profesor(String nombre, String correo, String contraseña) {
        super(nombre, correo, contraseña, "Profesor");
    }
    
    public void crearLearningPath() {
        // Lógica para crear Learning Paths
    }
    
    public void gestionarActividades() {
        // Lógica para añadir y gestionar actividades
    }
    
    public void calificarActividad() {
        // Lógica para calificar tareas y quizzes
    }
    
    public void verProgresoEstudiantes() {
        // Lógica para ver el progreso de los estudiantes
    }
}
