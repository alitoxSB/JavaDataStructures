package ulead.ac.cr.entidades;

public class Lista {
    private Nodo Inicio = null;
    private Nodo Final = null;

    public boolean ListaVacia(){
        return Inicio == null;
    }

    public void Agregar(Producto producto){
            Nodo nuevoNodo;

            if (ListaVacia()){
                nuevoNodo = new Nodo(producto);
                Nodo Inicio = nuevoNodo;
            }else{
                nuevoNodo = new Nodo(producto);
                Final.setNext(nuevoNodo);
            }

        }
    public void ImprimirLista(){
        if(ListaVacia()){
            System.out.println("La lista esta vacia");
        }else{
            Nodo Temporal = Inicio;
            while(Temporal != null){
                System.out.println("El nodo es " + Temporal.Value);
                Temporal = Temporal.Next;
            }
        }

    }

}

