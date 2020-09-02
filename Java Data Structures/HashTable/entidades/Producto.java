package ulead.ac.cr.entidades;

public class Producto {

    String nombre;

    String Categoria;

    String Codigo_alfanumerico;

    String numero_fila;

    int Codigo_decimal;

    public int getCodigo_decimal() {
        return Codigo_decimal;
    }

    public void setCodigo_decimal(int codigo_decimal) {
        Codigo_decimal = codigo_decimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getCodigo_alfanumerico() {
        return Codigo_alfanumerico;
    }

    public void setCodigo_alfanumerico(String codigo_alfanumerico) {
        Codigo_alfanumerico = codigo_alfanumerico;
    }

    public String getnumero_fila() {
        return numero_fila;
    }

    public void setnumero_fila(String numero_fila) {
        this.numero_fila = numero_fila;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", Categoria='" + Categoria + '\'' +
                ", Codigo_alfanumerico='" + Codigo_alfanumerico + '\'' +
                ", numero_fila='" + numero_fila + '\'' +
                ", Codigo_decimal='" + Codigo_decimal + '\'' +
                '}';
    }
}