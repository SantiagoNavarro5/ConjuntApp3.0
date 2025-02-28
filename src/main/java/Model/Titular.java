package Model;

public class Titular extends Usuario {
    private Apartamento apartamento;
    private String celular;
    private ResidenteExtra residente;
    
    public Titular (String nombreCompleto, String cedula, String email, int idCuenta, String contraseña, String tipoUsuario, Apartamento apartamento, String celular, ResidenteExtra residente) {
        super(nombreCompleto, cedula, email, idCuenta, contraseña, tipoUsuario);
        this.apartamento = apartamento;
        this.celular = celular;
        this.residente = residente;
    }
    
    public Apartamento getApartamentoUsuario() {
        return apartamento;
    }
    public void setApartamentoUsuario(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
    public String getCelularUsuario() {
        return celular;
    }
    public void setCelularUsuario(String celular) {
        this.celular = celular;
    }
    public ResidenteExtra getResidentes() {
        return residente;
    }
    public void setResidentes(ResidenteExtra residente) {
        this.residente = residente;
    }
    
    
}
