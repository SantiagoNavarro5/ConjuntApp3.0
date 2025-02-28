package Model;

public class Administrador extends Usuario {
    private String celular;
    private String codigoSeguridad;
    
    public Administrador (String nombreCompleto, String cedula, String email, int idCuenta, String contraseña, String tipoUsuario, String celular, String codigoSeguridad) {
        super(nombreCompleto, cedula, email, idCuenta, contraseña, tipoUsuario);
        this.celular = celular;
        this.codigoSeguridad = codigoSeguridad;        
    }
    
    public String getCelularUsuario() {
        return celular;
    }
    public void setCelularUsuario(String celular) {
        this.celular = celular;
    }
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    
    
}
