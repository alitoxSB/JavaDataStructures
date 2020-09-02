package cr.ac.ulead.grafos.profundidad;
import cr.ac.ulead.grafos.ui.UIHelper;
import static cr.ac.ulead.grafos.profundidad.main.MainProfundidad.matrixAdyacencia;

public class Profundidad {

	UIHelper uiHelper = new UIHelper();

	private static int[] nodo_recorrido;
	private static int con;

	static void DFS(int V, int[][] AdyacenciMatrix) {
		boolean[] Nodo_visitado = new boolean[AdyacenciMatrix.length];
		for (int i = 0; i < AdyacenciMatrix.length; i++) {
			if (!Nodo_visitado[V]) {
				DFS_Util(V, Nodo_visitado, AdyacenciMatrix);
			}
		}
	}

	public Profundidad(int[][] Matrix) {
		this.nodo_recorrido = new int[Matrix.length];
		this.con = 0;
	}
	static void DFS_Util(int v, boolean[] visited, int[][] adyacenciMatrix) {
		if (!visited[v]) {
			nodo_recorrido[con++] = v;
			visited[v] = true;
			for (int j = 0; j < adyacenciMatrix[v].length; j++) {
				if (adyacenciMatrix[v][j] == 1 && !visited[j]) {
					DFS_Util(j, visited, adyacenciMatrix);
				}
			}
		}
	}
	public static int get_grafo_recorrido(int indice) {
		return nodo_recorrido[indice];
	}

	public void Recorrido() {
		Profundidad.DFS(6, matrixAdyacencia);
		uiHelper.Printer_Grafo_profundidad();
		for (int i = 0; i < matrixAdyacencia.length; i++) {
			System.out.print(Profundidad.get_grafo_recorrido(i) + " ");
		}
	}

	void RunProfundidad(){

		try {
			Recorrido();
		} catch (ArrayIndexOutOfBoundsException e) {
			uiHelper.Printer_error();

		}
	}

}