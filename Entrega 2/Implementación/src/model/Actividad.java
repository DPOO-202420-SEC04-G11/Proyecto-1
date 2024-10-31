
package model;

import java.util.List;

public abstract class Actividad {
    private String descripcion;
    private String objetivo;
    private String dificultad;
    private int duracion;
    private List<Actividad> prerrequisitos;
    
    public Actividad(String descripcion, String objetivo, String dificultad, int duracion) {
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.dificultad = dificultad;
        this.duracion = duracion;
    }
    
    public abstract void marcarComoCompletada();
    
    public void mostrarAdvertencia() {
        // Lógica para mostrar advertencia de prerrequisitos
    }

    public abstract boolean validarPrerrequisitos(Object actividadesCompletadas);

    protected abstract String getDescripcion();
}
