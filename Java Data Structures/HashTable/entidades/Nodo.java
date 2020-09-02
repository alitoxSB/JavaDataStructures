package ulead.ac.cr.entidades;

public class Nodo {

    public Nodo vacio;
    public Producto Value;
    public Nodo Next;

    public Nodo(Producto producto) {
    }

    public Nodo getVacio() {
        return vacio;
    }

    public void setVacio(Nodo vacio) {
        this.vacio = vacio;
    }

    public Producto getValue() {
        return Value;
    }

    public void setValue(Producto value) {
        Value = value;
    }

    public Nodo getNext() {
        return Next;
    }

    public void setNext(Nodo next) {
        Next = next;
    }
}
