package Model;

public class Usuario {
    public String nombreCompleto;
    public String cedula;
    public String email;
    public int idCuenta;
    public String contraseña;
    public String tipoUsuario;
    
    public Usuario (String nombreCompleto, String cedula, String email, int idCuenta, String contraseña, String tipoUsuario) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.email = email;
        this.idCuenta = idCuenta;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }
    
    public String getNombreUsuario() {
        return nombreCompleto;
    }
    public void setNombreUsuario(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getCedulaUsuario() {
        return cedula;
    }
    public void setCedulaUsuario(String cedula) {
        this.cedula = cedula;
    }
    public String getEmailUsuario() {
        return email;
    }
    public void setEmailUsuario(String email) {
        this.email = email;
    }
    public int getIdUsuario() {
        return idCuenta;
    }
    public void setIdUsuario(int idCuenta) {
        this.idCuenta = idCuenta;
    }
    public String getContraseñaUsuario() {
        return contraseña;
    }
    public void setContraseñaUsuario(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    /*
    public Usuario CrearCuenta () {
        
    }
    */
}