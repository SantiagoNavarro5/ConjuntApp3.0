package Model;

import java.util.Date;

public class PagoPendiente {
    public String apartamento;
    public String concepto;
    public float valor;
    public Date fechaHoraInicio = new Date();
    public boolean estado;
    
    public PagoPendiente (String apartamento, String concepto, float valor, Date fechaHoraInicio, boolean estado) {
        this.apartamento = apartamento;
        this.concepto = concepto;
        this.valor = valor;
        this.fechaHoraInicio = fechaHoraInicio;
        this.estado = estado;
    }
    
    public String getConceptoPago() {
        return concepto;
    }
    public void setConceptoPago(String concepto) {
        this.concepto = concepto;
    }
    public String getAptoPago() {
        return apartamento;
    }
    public void setAptoPago(String apartamento) {
        this.apartamento = apartamento;
    }
    public float getValorPago() {
        return valor;
    }
    public void setValorPago (float valor) {
        this.valor = valor;
    }
    public Date getFechaPago() {
        return fechaHoraInicio;
    }
    public void setFechaPago(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }
    public boolean getEstadoPago() {
        return estado;
    }
    public void setEstadoPago(boolean estado) {
        this.estado = estado;
    }
    
    public void crearPagos(String apartamento, String concepto, float valor, Date fechaHoraInicio, boolean estado) {
        PagoPendiente nuevoPago = new PagoPendiente(apartamento, concepto, valor, fechaHoraInicio, false);
    }
        
    public void marcarPagado (boolean estado) {
        this.estado = true;
    }
    
    
}
