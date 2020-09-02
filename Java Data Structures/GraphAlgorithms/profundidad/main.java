package cr.ac.ulead.grafos.profundidad;

public class main {

    public static class MainProfundidad {

        static int[][] matrixAdyacencia = {

                {0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 1},
                {0, 0, 0, 1, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 0}

        };

        public static void main(String args[]) {
            Profundidad Profundidad = new Profundidad(matrixAdyacencia);
            Profundidad.RunProfundidad();
        }
    }
}
