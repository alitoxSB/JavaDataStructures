package cr.ac.ulead.grafos.ui;

public class UIHelper {

    //Helper para Profundidad

    public void Printer_error(){
        System.out.println("Lo sentimos");
        System.out.println("El nodo solicitado no existe en este grafo.");
    }
    public void Printer_Grafo_profundidad(){
        System.out.println("Recorrido de Busqueda de profundiad conforme a la posición seleccionada es:");
    }

    //Helper para topological
    public void Printer_topological(){
        System.out.println("El recorrido de la busqueda por Topological Sort es:");
    }

    //Helper para amplitud
    public void Printer_amplitud(){
        System.out.println("El recorrido de la busqueda por amplitud es:");
    }

    //Helper para Kruskal
    public void Printer_kruskal(){
        System.out.println("El recorrido de la busqueda por amplitud es:");
    }



}
