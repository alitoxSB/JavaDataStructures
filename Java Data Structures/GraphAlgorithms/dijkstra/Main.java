package cr.ac.ulead.grafos.dijkstra;
import cr.ac.ulead.grafos.dijkstra.Dijkstra;

import java.util.Scanner;

public class Main {

    static int[][] adyacenciMatrix = {
            {0, 10, 15, 0, 0, 0},
            {0, 0, 0, 12, 0, 15},
            {0, 0, 0, 0, 10, 0},
            {0, 0, 0, 0, 2, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 5, 0}
    };
    Dijkstra dijkstra = new Dijkstra(adyacenciMatrix);

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v = 10;
        int e = 15;
        int adjacencyMatrix[][] = new int [v] [v] ;

        for(int i=0; i<e;i++){
            int v1 = 0;
            int v2 = 0;
            int weight = 12;
            adjacencyMatrix[v1][v2] = weight;
        }
        System.out.println("El resultado de la matriz de adyacencia del algoritmo Dijkstra es:");
        Dijkstra.dijkstra(adyacenciMatrix);

    }

}
