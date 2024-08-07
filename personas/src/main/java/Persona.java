
import java.util.List;


public class Persona {

    public String nombre;
     public String apellidoPaterno;
     public String apellidoMaterno;
     public String sexo ;
     public int edad;
     public boolean estadoCivil;
     public float estatura;
     public List<Domicilio> domicilios;
     public List<MediosDeContacto> mediosDeContacto;
     public Empleo empleo;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String sexo, int edad, boolean estadoCivil, float estatura, List<Domicilio> domicilios, List<MediosDeContacto> mediosDeContacto, Empleo empleo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
        this.domicilios = domicilios;
        this.mediosDeContacto = mediosDeContacto;
        this.empleo = empleo;
    }

    Persona(String saul, String c, String c0, String h, String casado, List<Domicilio> domicilios1, List<MedioDeContacto> contactos1, Empleo empleo1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public float getEstatura() {
        return estatura;
    }

    public List<Domicilio> getDomicilios() {
        return domicilios;
    }

    public List<MediosDeContacto> getMediosDeContacto() {
        return mediosDeContacto;
    }

    public Empleo getEmpleo() {
        return empleo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setDomicilios(List<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }

    public void setMediosDeContacto(List<MediosDeContacto> mediosDeContacto) {
        this.mediosDeContacto = mediosDeContacto;
    }

    public void setEmpleo(Empleo empleo) {
        this.empleo = empleo;
    }

    private static class MediosDeContacto {

        public MediosDeContacto() {
        }
    }
    

    
    }

    

