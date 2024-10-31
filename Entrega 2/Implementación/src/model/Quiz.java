
package model;

import java.util.List;

public class Quiz extends Actividad {
    private List<Pregunta> preguntas;
    private int calificacionMinima;
    private int calificacion;
    
    public Quiz(String descripcion, String objetivo, String dificultad, int duracion, List<Pregunta> preguntas, int calificacionMinima) {
        super(descripcion, objetivo, dificultad, duracion);
        this.preguntas = preguntas;
        this.calificacionMinima = calificacionMinima;
    }
    
    public void evaluarRespuestas() {
        // Lógica para evaluar respuestas
    }
    
    public void mostrarResultados() {
        // Lógica para mostrar resultados y retroalimentación
    }
    
    @Override
    public void marcarComoCompletada() {
        // Lógica para marcar como completado
    }

    @Override
    public boolean validarPrerrequisitos(Object actividadesCompletadas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarPrerrequisitos'");
    }

    @Override
    protected String getDescripcion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescripcion'");
    }
}
