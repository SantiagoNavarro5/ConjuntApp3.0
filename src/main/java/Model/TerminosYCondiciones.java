package Model;

import java.util.Date;

public class TerminosYCondiciones {
    public Date fechaHoraActualizacion = new Date();
    public String version;
    public String contenido;
    
    public TerminosYCondiciones (Date fechaHoraActualizacion, String version, String contenido) {
        this.fechaHoraActualizacion = fechaHoraActualizacion;
        this.version = version;
        this.contenido = contenido;
    }
    
    public Date getFechaTyC() {
        return fechaHoraActualizacion;
    }
    public void setFechaTyC(Date fechaHoraActualizacion) {
        this.fechaHoraActualizacion = fechaHoraActualizacion;
    }
    public String getVersionTyC() {
        return version;
    }
    public void setVersionTyC(String version) {
        this.version = version;
    }
    public String getContenidoTyC() {
        return contenido;
    }
    public void setContenidoTyC(String contenido) {
        this.contenido = contenido;
    }
    
    
}
