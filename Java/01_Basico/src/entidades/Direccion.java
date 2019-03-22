package entidades;


public class Direccion {
    
    private String tipoVia;
    private String nombreVia;
    private String codigoPostal;
    
    public Direccion(String tipoVia, String nombreVia, String codigoPostal, String pais) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}
    
	@Override
    public String toString() {
        return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", codigoPostal=" + codigoPostal
                + ", pais=" + pais + "]";
    }
    public String getTipoVia() {
        return tipoVia;
    }
    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }
    public String getNombreVia() {
        return nombreVia;
    }
    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    private String pais;
    
    
}