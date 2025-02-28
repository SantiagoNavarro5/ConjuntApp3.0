package Model;

import java.util.HashSet;

public class Apartamento {
    public String numeroApartamento;
    public boolean estado;
    public static HashSet<Integer> numerosUsados = new HashSet<>();
    
    public Apartamento (String numeroApartamento, boolean estado) {
        this.numeroApartamento = numeroApartamento;
        this.estado = estado;
        
    }
    
    public String getNumeroApto() {
        return numeroApartamento;
    }
    public void setNumeroApto(String numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }
    public boolean getEstadoApto() {
        return estado;
    }
    public void setEstadoApto(boolean estado) {
        this.estado = estado;
    }
    /*
    public crearApto(String numeroApartamento, boolean estado) {
        Apto aparatamento = new Apto (numeroApartamento, estado);
        
    }
    */
    
    
    
}
