package cr.ac.ulead.grafos.topological;
import cr.ac.ulead.grafos.topological.Topological;
public class Main {
    public static int [][] matrix_topological = {
            {0,0,0,0,1,1},
            {0,0,0,1,1,0},
            {0,0,0,0,1,0},
            {0,0,1,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}};

        public static void main(String[] args) {
            Topological topological = new Topological();
            topological.TopologicalRun();
        }
    }

