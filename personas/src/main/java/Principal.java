
import org.json.JSONArray;
import org.json.JSONObject;

public class Principal {

    public static void main(String[] args) {

    
        JSONArray personasArray = new JSONArray();

       
        JSONObject persona1 = new JSONObject();
        persona1.put("nombre", "Saul");
        persona1.put("apellidoPaterno", "C");
        persona1.put("apellidoMaterno", "C");
        persona1.put("sexo", "H");
        persona1.put("estadoCivil", "casado");

       
        JSONArray domicilios1 = new JSONArray();
        domicilios1.put(new JSONObject().put("calle", "Calle 1").put("numeroInt", "123").put("numeroExterno", "456")
                                         .put("codigoPostal", "90655").put("colonia", "Colonia Miguel Hidalgo"));
        domicilios1.put(new JSONObject().put("calle", "Calle 4").put("numeroInt", "556").put("numeroExterno", "0")
                                         .put("codigoPostal", "90455").put("colonia", "Colonia Juárez"));
        persona1.put("domicilios", domicilios1);

        JSONArray mediosDeContacto1 = new JSONArray();
        mediosDeContacto1.put(new JSONObject().put("tipo", "laboral").put("telefonoLada", "241").put("telefono", "2478435")
                                               .put("correo", "laboral1@example.com"));
        mediosDeContacto1.put(new JSONObject().put("tipo", "personal").put("telefonoLada", "241").put("telefono", "4210076")
                                               .put("correo", "personal1@example.com"));
        persona1.put("mediosDeContacto", mediosDeContacto1);

       
        JSONObject empleo1 = new JSONObject();
        empleo1.put("empresa", "Empresa Banco");
        empleo1.put("puesto", "Puesto Gerente");
        empleo1.put("antiguedad", 3);
        persona1.put("empleo", empleo1);

        //  segunda persona
        JSONObject persona2 = new JSONObject();
        persona2.put("nombre", "Erik");
        persona2.put("apellidoPaterno", "M");
        persona2.put("apellidoMaterno", "S");
        persona2.put("sexo", "H");
        persona2.put("estadoCivil", "casado");

        JSONArray domicilios2 = new JSONArray();
        domicilios2.put(new JSONObject().put("calle", "Calle 6").put("numeroInt", "55").put("numeroExterno", "66")
                                         .put("codigoPostal", "90489").put("colonia", "Colonia Miguel Hidalgo"));
        domicilios2.put(new JSONObject().put("calle", "Calle 75").put("numeroInt", "043").put("numeroExterno", "0")
                                         .put("codigoPostal", "90410").put("colonia", "Colonia San Miguel"));
        persona2.put("domicilios", domicilios2);

        JSONArray mediosDeContacto2 = new JSONArray();
        mediosDeContacto2.put(new JSONObject().put("tipo", "laboral").put("telefonoLada", "241").put("telefono", "5689002")
                                               .put("correo", "laboral2@example.com"));
        mediosDeContacto2.put(new JSONObject().put("tipo", "personal").put("telefonoLada", "241").put("telefono", "8765432")
                                               .put("correo", "personal2@example.com"));
        persona2.put("mediosDeContacto", mediosDeContacto2);

        JSONObject empleo2 = new JSONObject();
        empleo2.put("empresa", "Empresa Banco");
        empleo2.put("puesto", "Puesto Gerente");
        empleo2.put("antiguedad", 6);
        persona2.put("empleo", empleo2);

        //  tercera persona
        JSONObject persona3 = new JSONObject();
        persona3.put("nombre", "Sebastian");
        persona3.put("apellidoPaterno", "Na");
        persona3.put("apellidoMaterno", "Na");
        persona3.put("sexo", "H");
        persona3.put("estadoCivil", "soltero");

        JSONArray domicilios3 = new JSONArray();
        domicilios3.put(new JSONObject().put("calle", "Calle s").put("numeroInt", "86").put("numeroExterno", "88")
                                         .put("codigoPostal", "90414").put("colonia", "Colonia Centro"));
        domicilios3.put(new JSONObject().put("calle", "Calle a").put("numeroInt", "33").put("numeroExterno", "0")
                                         .put("codigoPostal", "90408").put("colonia", "Colonia Centro Tlaxcala"));
        persona3.put("domicilios", domicilios3);

        JSONArray mediosDeContacto3 = new JSONArray();
        mediosDeContacto3.put(new JSONObject().put("tipo", "laboral").put("telefonoLada", "241").put("telefono", "1234568")
                                               .put("correo", "laboral3@example.com"));
        mediosDeContacto3.put(new JSONObject().put("tipo", "personal").put("telefonoLada", "241").put("telefono", "8765321")
                                               .put("correo", "personal3@example.com"));
        persona3.put("mediosDeContacto", mediosDeContacto3);

        JSONObject empleo3 = new JSONObject();
        empleo3.put("empresa", "Empresa");
        empleo3.put("puesto", "Puesto Programador");
        empleo3.put("antiguedad", 1);
        persona3.put("empleo", empleo3);

        //  cuarta persona
        JSONObject persona4 = new JSONObject();
        persona4.put("nombre", "Mauricio");
        persona4.put("apellidoPaterno", "C");
        persona4.put("apellidoMaterno", "C");
        persona4.put("sexo", "H");
        persona4.put("estadoCivil", "soltero");

        JSONArray domicilios4 = new JSONArray();
        domicilios4.put(new JSONObject().put("calle", "Calle s/n").put("numeroInt", "0").put("numeroExterno", "0")
                                         .put("codigoPostal", "90430").put("colonia", "Colonia San Bartolo"));
        persona4.put("domicilios", domicilios4);

        JSONArray mediosDeContacto4 = new JSONArray();
        mediosDeContacto4.put(new JSONObject().put("tipo", "laboral").put("telefonoLada", "241").put("telefono", "245678")
                                               .put("correo", "laboral4@example.com"));
        mediosDeContacto4.put(new JSONObject().put("tipo", "personal").put("telefonoLada", "241").put("telefono", "8765431")
                                               .put("correo", "personal4@example.com"));
        persona4.put("mediosDeContacto", mediosDeContacto4);

        JSONObject empleo4 = new JSONObject();
        empleo4.put("empresa", "Empresa D");
        empleo4.put("puesto", "Puesto Programador");
        empleo4.put("antiguedad", 1);
        persona4.put("empleo", empleo4);

        //  array
        personasArray.put(persona1);
        personasArray.put(persona2);
        personasArray.put(persona3);
        personasArray.put(persona4);

       
        JSONObject grl = new JSONObject();
        grl.put("personas", personasArray);

        
        System.out.println(grl.toString(4)); 
    }
}