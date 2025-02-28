package Model;

import java.util.Date;


public class PQRS {
    public int numeroRadicado;
    public String asunto;
    public String contenido;
    public Date fechaHoraRadicacion = new Date();
    public String titular;
    public String apartamento;
    public String cedula;
    public boolean adjuntos;
    public String estado;
    
    public PQRS (int numeroRadicado, String asunto, String contenido, Date fechaHoraRadicacion, String titular, String apartamento, String cedula, boolean adjuntos, String estado) {
        this.numeroRadicado = numeroRadicado;
        this.asunto = asunto;
        this.contenido = contenido;
        this.fechaHoraRadicacion = fechaHoraRadicacion;
        this.titular = titular;
        this.apartamento = apartamento;
        this.cedula = cedula;
        this.adjuntos = adjuntos;
        this.estado = estado;
    }
    
    public int getNumeroRadicado() {
        return numeroRadicado;
    }
    public void setNumeroRadicado(int numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }
    public String getAsuntoPQRS() {
        return asunto;
    }
    public void setAsuntoPQRS(String asunto) {
        this.asunto = asunto;
    }
    public String getContenidoPQRS() {
        return contenido;
    }
    public void setContenidoPQRS(String contenido) {
        this.contenido = contenido;
    }
    public Date getFechaPQRS() {
        return fechaHoraRadicacion;
    }
    public void setFechaPQRS(Date fechaHoraRadicacion) {
        this.fechaHoraRadicacion = fechaHoraRadicacion;
    }
    public String getAptoPQRS() {
        return apartamento;
    }
    public void setAptoPQRS(String apartamento) {
        this.apartamento = apartamento;
    }
    public String getTitularPQRS() {
        return titular;
    }
    public void setTitularPQRS(String titular) {
        this.titular = titular;
    }
    public String getCedulaPQRS() {
        return cedula;
    }
    public void setCedulaPQRS(String cedula) {
        this.cedula = cedula;
    }
    public boolean getAdjuntosPQRS() {
        return adjuntos;
    }
    public void setAdjuntosPQRS(boolean adjuntos) {
        this.adjuntos = adjuntos;
    }
    public String getEstadoPQRS() {
        return estado;
    }
    public void setEstadoPQRS(String estado) {
        this.estado = estado;
    }
    
    public void crearPQRS(int numeroRadicado, String asunto, String contenido, Date fechaHoraRadicacion, String titular, String apartamento, String cedula, boolean adjuntos, String estado) {
        PQRS nuevaPQRS = new PQRS(numeroRadicado, asunto, contenido, fechaHoraRadicacion, titular, apartamento, cedula, adjuntos, estado);
    }
    public void editarEstadoPQRS(String estado) {
        this.estado = estado;
    }
}
