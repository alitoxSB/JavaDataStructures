package cr.ac.ulead.grafos.topological;

import java.util.*;
import cr.ac.ulead.grafos.topological.Topological;
import cr.ac.ulead.grafos.ui.UIHelper;

public class Topological
{
    UIHelper uiHelper = new UIHelper();
    private int V;
    int [][] matrix;

    public Topological(int v)
    {
        V = v;
    }
    public Topological() {
    }

    public void addEdge(int[][] matrix) {
        this.matrix = matrix;
    }

    public ArrayList<String> topologicalSort()
    {
        ArrayList<String> Stack_list = new ArrayList<>();
        Stack<Integer> stack = new Stack<Integer>();

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);

        while (stack.empty()==false)
            Stack_list.add(stack.pop() + " ");

        return Stack_list;
    }

    void topologicalSortUtil(
            int v, boolean visited[],
            Stack<Integer> stack)
    {
        visited[v] = true;
        for (int j = 0; j < this.matrix[v].length ; j++) {
            if (!visited[j])
                if (this.matrix[j][v] == 1)
                    topologicalSortUtil(j, visited, stack);
        }
        stack.push(new Integer(v));
    }

    public void TopologicalRun(){

        Topological g = new Topological(Main.matrix_topological.length);
        g.addEdge(Main.matrix_topological);
        uiHelper.Printer_topological();
        for (int i = 0; i < g.topologicalSort().size(); i++) {
            System.out.print(g.topologicalSort().get(i));
        }
    }


}