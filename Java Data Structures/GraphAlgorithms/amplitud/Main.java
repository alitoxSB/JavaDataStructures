package cr.ac.ulead.grafos.amplitud;

import cr.ac.ulead.grafos.ui.UIHelper;

public class Main {
    UIHelper uiHelper = new UIHelper();

    static int[][] matrixAdyacencia = {
            {0, 1, 0, 1, 0, 0, 0},
            {1, 0, 1, 1, 1, 0, 0},
            {0, 1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 1},
            {0, 0, 0, 1, 1, 0, 1},
            {0, 0, 0, 0, 1, 1, 0}
    };

    private void Amplitud_Run(){
        Amplitud amplitud = new Amplitud(Main.matrixAdyacencia);
        amplitud.BSF(Main.matrixAdyacencia, 4);
        uiHelper.Printer_amplitud();
        for (int i = 0; i < Main.matrixAdyacencia.length; i++)
            System.out.print(amplitud.Recorrido_Grafo(i));
    }

    public static void main(String args[]) {
        Main main = new Main();
        Amplitud amplitud = new Amplitud(matrixAdyacencia);
        main.Amplitud_Run();
    }
}