
package model;

public class RecursoEducativo extends Actividad {
    private String tipoRecurso;
    private String urlRecurso;
    
    public RecursoEducativo(String descripcion, String objetivo, String dificultad, int duracion, String tipoRecurso, String urlRecurso) {
        super(descripcion, objetivo, dificultad, duracion);
        this.tipoRecurso = tipoRecurso;
        this.urlRecurso = urlRecurso;
    }
    
    @Override
    public void marcarComoCompletada() {
        // Lógica para marcar el recurso como completado
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
