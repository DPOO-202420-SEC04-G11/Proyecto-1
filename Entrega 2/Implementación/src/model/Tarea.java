
package model;

public class Tarea extends Actividad {
    private String estado;
    private String resultado;
    
    public Tarea(String descripcion, String objetivo, String dificultad, int duracion, String estado, String resultado) {
        super(descripcion, objetivo, dificultad, duracion);
        this.estado = estado;
        this.resultado = resultado;
    }
    
    public void enviarTarea() {
        // Lógica para enviar tarea
    }
    
    public void marcarRevisada() {
        // Lógica para marcar la tarea como revisada
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
