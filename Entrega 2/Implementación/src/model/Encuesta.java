
package model;

import java.util.List;

public class Encuesta extends Actividad {
    private List<String> preguntasAbiertas;
    
    public Encuesta(String descripcion, String objetivo, String dificultad, int duracion, List<String> preguntasAbiertas) {
        super(descripcion, objetivo, dificultad, duracion);
        this.preguntasAbiertas = preguntasAbiertas;
    }
    
    public void recogerRespuestas(List<String> respuestas) {
        // Lógica para recoger respuestas de la encuesta
    }
    
    @Override
    public void marcarComoCompletada() {
        // Lógica para marcar como completada
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
