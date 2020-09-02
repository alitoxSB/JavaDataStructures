package cr.ac.ulead.grafos.amplitud;

import cr.ac.ulead.grafos.ui.UIHelper;

import java.util.Queue;
import java.util.LinkedList;

public class Amplitud {

	private int [] Grafo_Recorrido;
	private int con;
	Queue<Integer> queue = new LinkedList<>();
	UIHelper uiHelper = new UIHelper();

	public Amplitud (int [][]Matrix){
		this.Grafo_Recorrido = new int[Matrix.length];
		this.con = 0;
	}

	public void BSF(int[][] adyacenciMatrix, int visited_v) {

		boolean[] visited = new boolean[adyacenciMatrix.length];


		visited[visited_v] = true;

		queue.add(visited_v);

		while (queue.size() != 0) {
			this.Grafo_Recorrido[con++] = queue.peek();
			int j = queue.poll();

			for (int i = 0; i < adyacenciMatrix.length; i++) {
				if (adyacenciMatrix[j][i] == 1) {
					if(visited[i] == false){
						queue.add(i);
						visited[i] = true;
					}
				}
			}
		}
	}

	public String Recorrido_Grafo(int i) {
		return this.Grafo_Recorrido[i] + " ";
	}

}