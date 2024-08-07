
public class Empleo {
    public String empresa;
    public String puesto;
    public int antiguedad;

    public Empleo(String empresa) {
        this.empresa = empresa;
    }

    public Empleo(String empresa, String puesto, int antiguedad) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.antiguedad = antiguedad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}
