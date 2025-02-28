package Model;

public class ResidenteExtra {
    public String nombreCompleto;
    public String numeroID;
    
    public ResidenteExtra (String nombreCompleto, String numeroID) {
        this.nombreCompleto = nombreCompleto;
        this.numeroID = numeroID;
    }
    
    public String getNombreResidente() {
        return nombreCompleto;
    }
    public void setNombreResidente(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getNumeroID() {
        return numeroID;
    }
    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }
    
    
}
