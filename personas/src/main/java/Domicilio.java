
public class Domicilio {
    public String calle;
    public String numeroInt;
    public String numeroExterno;
    public String codigoPostal;
    public String colonia;

    public Domicilio(String calle, String numeroInt, String numeroExterno, String codigoPostal, String colonia) {
        this.calle = calle;
        this.numeroInt = numeroInt;
        this.numeroExterno = numeroExterno;
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroInt() {
        return numeroInt;
    }

    public String getNumeroExterno() {
        return numeroExterno;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeroInt(String numeroInt) {
        this.numeroInt = numeroInt;
    }

    public void setNumeroExterno(String numeroExterno) {
        this.numeroExterno = numeroExterno;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
    
}
