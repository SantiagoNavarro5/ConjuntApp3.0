package Model;

import java.util.Date;

public class Visita {
    private String nombreCompleto;
    private String cedula;
    private boolean vehiculo;
    private String placa;
    private Date fechaHoraIngreso = new Date();
    private Date fechaHoraSalida = new Date();
    private String apartamentoDestino;
    
    public Visita (String nombreCompleto, String cedula, boolean vehiculo, String placa, Date fechaHoraIngreso, Date fechaHoraSalida, String apartamentoDestino) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.fechaHoraSalida = fechaHoraSalida;
        this.apartamentoDestino = apartamentoDestino;
        this.vehiculo = vehiculo;
        if (vehiculo == true) {
            this.placa = placa;
        }
    }
    
    public String getNombreVisita() {
        return nombreCompleto;
    }
    public void setNombreVisita(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getCedulaVisita() {
        return cedula;
    }
    public void setCedulaVisita(String cedula) {
        this.cedula = cedula;
    }
    public boolean getVehiculoVisita() {
        return vehiculo;
    }
    public void setVehiculoVisita(boolean vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String getPlacaVisita() {
        return placa;
    }
    public void setPlacaVisita(String placa) {
        this.placa = placa;
    }
    public Date getFecha1Visita() {
        return fechaHoraIngreso;
    }
    public void setFecha1Visita(Date fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }
    public Date getFecha2Visita() {
        return fechaHoraSalida;
    }
    public void setFecha2Visita(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    public String getAptoVisita() {
        return apartamentoDestino;
    }
    public void setAptoVisita(String apartamentoDestino) {
        this.apartamentoDestino = apartamentoDestino;
    }
    
    
}
