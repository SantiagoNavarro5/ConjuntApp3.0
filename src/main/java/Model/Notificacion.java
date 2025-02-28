package Model;

import java.util.Date;

public class Notificacion {
    private String apartamento;
    private String asunto;
    private String contenido;
    private Date fechaHora = new Date();
    private boolean recepcion;
    
    public Notificacion (String apartamento, String asunto, String contenido, Date fechaHora, boolean recepcion) {
        this.apartamento = apartamento;
        this.asunto = asunto;
        this.contenido = contenido;
        this.fechaHora = fechaHora;
        this.recepcion = recepcion;
    }
    
    public String getAptoNoti() {
        return apartamento;
    }
    public void setAptoNoti(String apartamento) {
        this.apartamento = apartamento;
    }
    public String getAsuntoNoti() {
        return asunto;
    }
    public void setAsuntoNoti (String asunto) {
        this.asunto = asunto;
    }
    public String getContenidoNoti() {
        return contenido;
    }
    public void setContenidoNoti(String contenido) {
        this.contenido = contenido;
    }
    public Date getFechaNoti() {
        return fechaHora;
    }
    public void setFechaNoti(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    public boolean getRecibidoNoti() {
        return recepcion;
    }
    public void setRecibidoNoti(boolean recepcion) {
        this.recepcion = recepcion;
    }
    
    public void crearNoti (String apartamento, String asunto, String contenido, Date fechaHora, boolean recepcion) {
        Notificacion nuevaNoti = new Notificacion(apartamento, asunto, contenido, fechaHora, false);
    }
    
    public void editarRecibidoNotis (boolean recepcion) {
        this.recepcion = true;
    }
}
