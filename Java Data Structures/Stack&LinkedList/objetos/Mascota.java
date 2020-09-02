package cr.ac.ulead.objetos;

public class Mascota implements SerializadorUlead {

    private String nombre_mascota;
    private String tipo_mascota;
    private String edad_mascota;

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public String getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(String edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    @Override
    public String SerializarXML() {

        return "<mascota>" + "\n" +
                "<nombre>" + getNombre_mascota() + "</nombre>" + "\n" +
                "<tipoAnimal>" + getTipo_mascota() + "</tipoAnimal>" + "\n" +
                "<edad>" + getEdad_mascota() + "</edad>" + "\n" +
                "</mascota>";
    }

    @Override
    public String SerializarJson() {
        return "{" + "\n" +
                "\"nombre\":" + "\"" + getNombre_mascota() + "\"," + "\n" +
                "\"tipo de animal\":" + "\"" + getTipo_mascota() + "\"," + "\n" +
                "\"Edad\":" + getEdad_mascota() + "\n" +
                "}";
    }
}
