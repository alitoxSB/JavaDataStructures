package ulead.ac.cr.cola;

public class PriorityQueue<T>{

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    private int size;

    public PriorityQueue(){
        primero = null;
        ultimo = null;
        size = 0;
    }
    public boolean isEmpty(){
        return primero == null;
    }
    public int sizeQ(){
        return size;
    }
    public T primero(){
        if(isEmpty()){
            return null;
        }
        return primero.getElemento();
    }

    public  T enqueue(T elemento){
        Nodo<T> aux = new Nodo(elemento, null);
        if(isEmpty()){
            primero = aux;
            ultimo = aux;
        }else{
            if(sizeQ()==1){
                ultimo = aux;
                primero.setSiguiente(aux);
            }else{
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }
        size++;
        return aux.getElemento();
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("Cola vacía");
        }
        T elemento = primero.getElemento();
        Nodo<T> aux = primero.getSiguiente();
        primero = null;
        primero = aux;
        size--;

        if(isEmpty()){
            ultimo = null;
        }
        return elemento;
    }

    public String toString(){
        if(isEmpty()){
            return "La lista esta vacia";
        }else{
            String cadena = "";
            Nodo<T> aux = primero;
            while(aux!=null){
                cadena += aux;
                aux = aux.getSiguiente();
            }
            return cadena;
        }
    }


}