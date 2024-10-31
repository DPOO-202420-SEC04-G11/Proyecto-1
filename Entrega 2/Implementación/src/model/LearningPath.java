
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LearningPath {
    private String titulo;
    private String descripcion;
    private String dificultad;
    private int duracion;
    private float rating;
    private Date fechaCreacion;
    private List<Actividad> actividades;
    
    public LearningPath(String titulo, String descripcion, String dificultad, int duracion, float rating, Date fechaCreacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.duracion = duracion;
        this.rating = rating;
        this.fechaCreacion = fechaCreacion;
        this.actividades = new ArrayList<>();
    }
    
    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }
    
    public void editarActividades() {
        // Lógica para editar actividades
    }
    
    public void mostrarRecomendaciones() {
        // Lógica para mostrar recomendaciones
    }

    public String getTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulo'");
    }
}
