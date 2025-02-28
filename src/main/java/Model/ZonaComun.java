package Model;

public class ZonaComun {
    public String nombreZona;
    public String horario;
    public String reserva;
    public String terminosCondiciones;
    
    public ZonaComun (String nombreZona, String horario, String reserva, String terminosCondiciones) {
        this.nombreZona = nombreZona;
        this.horario = horario;
        this.reserva = reserva;
        this.terminosCondiciones = terminosCondiciones;
        
        
    }
    
    public String getNombreZona() {
        return nombreZona;
    }
    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }
    public String getHorarioZona() {
        return horario;
    }
    public void setHorarioZona(String horario) {
        this.horario = horario;
    }
    public String getReservaZona() {
        return reserva;
    }
    public void setReservaZona(String reserva) {
        this.reserva = reserva;
    }
    public String getTyCZona() {
        return terminosCondiciones;
    }
    public void setTyCZona(String terminosCondiciones) {
        this.terminosCondiciones = terminosCondiciones;
    }
    
    
}
