package cr.ac.ulead.objetos;

public class Persona implements SerializadorUlead {

    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private String peso;
    private String estatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }


    @Override
    public String SerializarXML() {
        return  "<Persona> \n" +
                " <Nombre>" + getNombre() + "</Nombre> \n" +
                " <Apellido>" + getApellido() + "</Apellido> \n"
                + " <FechaNacimiento> " +
                getFecha_nacimiento() + "</FechaNacimiento> \n"
                + " <Estatura>" + getEstatura() + "</Estatura> \n" +
                " <peso>" + getPeso() + "</peso> \n"
                + "</Persona> ";
    }


    @Override
    public String SerializarJson() {

        return "{" + "\n" +
                "\"nombre\":" + "\"" + getNombre() + "\"," + "\n" +
                "\"apellido\":" + "\"" + getApellido() + "\"," + "\n" +
                "\"fecha de nacimiento\":" + getFecha_nacimiento() + "," + "\n" +
                "\"peso\":" + getPeso() + "," + "\n" +
                "\"estatura\":" + getEstatura() + "\n" +
                "}";
    }
}
