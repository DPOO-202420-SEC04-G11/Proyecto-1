
package model;

import java.util.List;

public class Pregunta {
    private String texto;
    private List<String> opciones;
    private String respuestaCorrecta;
    private String explicacion;
    
    public Pregunta(String texto, List<String> opciones, String respuestaCorrecta, String explicacion) {
        this.texto = texto;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
        this.explicacion = explicacion;
    }
    
    public boolean validarRespuesta(String respuestaSeleccionada) {
        return respuestaSeleccionada.equals(respuestaCorrecta);
    }
    
    public String mostrarExplicacion() {
        return explicacion;
    }
    
    // Métodos de acceso
    public String getTexto() { return texto; }
    public List<String> getOpciones() { return opciones; }
    public String getRespuestaCorrecta() { return respuestaCorrecta; }
    public String getExplicacion() { return explicacion; }
}
