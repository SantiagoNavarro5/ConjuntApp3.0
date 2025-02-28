package Model;

public class Empleado extends Usuario {
    private String codigoSeguridad;
    
    public Empleado (String nombreCompleto, String cedula, String email, int idCuenta, String contraseña, String tipoUsuario, String codigoSeguridad) {
        super(nombreCompleto, cedula, email, idCuenta, contraseña, tipoUsuario);
        this.codigoSeguridad = codigoSeguridad;
    }
    
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    
    
}
