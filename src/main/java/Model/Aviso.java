package Model;

import java.util.Date;

public class Aviso {
    public Date fechaHora = new Date();
    public String asunto;
    public String contenido;
    
    public Aviso (Date fechaHora, String asunto, String contenido) {
        this.fechaHora = fechaHora;
        this.asunto = asunto;
        this.contenido = contenido;
    }
    
    public Date getFechaHora () {
        return fechaHora;
    }
    public void setFechaHora (Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    public String getAsunto () {
        return asunto;
    }
    public void setAsunto (String asunto) {
        this.asunto = asunto;
    }
    public String getContenido () {
        return contenido;
    }
    public void setContenido (String contenido) {
        this.contenido = contenido;
    }
    
    public void crearAviso (Date fechaHora, String asunto, String contenido) {
        Aviso aviso = new Aviso(fechaHora, asunto, contenido);
    }
    
}
