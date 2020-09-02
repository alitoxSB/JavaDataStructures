package cr.ac.ulead.grafos.kruskal;
import cr.ac.ulead.grafos.kruskal.Kruskal;
public class Main {

    public static  int[][] matrix = {
            {0, 10, 6, 5, 0},
            {0, 0, 0, 15, 0},
            {0, 0, 0, 4, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };
    public static void main(String[] args) {
        Main main = new Main();
        main.KruskalRun();
    }
    public void KruskalRun(){
        Main main = new Main();

        Kruskal graph = new Kruskal(Kruskal.Vertices(), main.matrix.length);
        graph.addEdge(main.matrix);
        for (int i = 0; i < graph.KruskalMST().size(); i++) {
            System.out.println(graph.KruskalMST().get(i));
        }
    }
}