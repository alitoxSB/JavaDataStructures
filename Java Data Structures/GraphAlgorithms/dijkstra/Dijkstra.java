package cr.ac.ulead.grafos.dijkstra;

public class Dijkstra {
    public Dijkstra(int[][] adjacencyMatrix) {
    }

    public static void dijkstra(int [][] adyacenciMatrix){
        int v = adyacenciMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for (int i=1; i<v;i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i=0;i<v-1;i++){
            int minVertex = minVertice(distance, visited);
            visited[minVertex] = true;

            for(int j = 0; j<v; j++){
                if(adyacenciMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int Distancia_nueva = distance[minVertex] + adyacenciMatrix[minVertex][j];
                    if (Distancia_nueva < distance[j]) {
                        distance[j]=Distancia_nueva;
                        }
                    }
                }
            }

        for(int i = 1; i<v; i++){
            System.out.println(i + " "+ distance[i]);
        }

        }

    private static int minVertice(int[] distancia, boolean[] visite){
        int vertice_minimo = -1;
        for(int i = 0; i<distancia.length; i++){
            if(!visite[i] && (vertice_minimo == -1 || distancia[i]<distancia[vertice_minimo])){
                vertice_minimo = i;
            }
        }
        return vertice_minimo;
    }




}
