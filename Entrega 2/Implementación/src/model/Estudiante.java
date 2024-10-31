
package model;

public class Estudiante extends User {
    
    public Estudiante(String nombre, String correo, String contraseña) {
        super(nombre, correo, contraseña, "Estudiante");
    }
    
    public void inscribirseLearningPath() {
        // Lógica para inscribirse en Learning Paths
    }
    
    public void realizarActividad() {
        // Lógica para realizar actividades
    }
    
    public void verProgreso() {
        // Lógica para ver su progreso
    }
    
    public void recibirRecomendaciones() {
        // Lógica para recibir recomendaciones
    }
}
