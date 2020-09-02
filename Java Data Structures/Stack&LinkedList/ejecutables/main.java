package cr.ac.ulead.ejecutables;
import java.io.PrintStream;
import java.util.Scanner;

import cr.ac.ulead.logic.Ejecucion;
import cr.ac.ulead.objetos.Persona;
import cr.ac.ulead.ui.UIHelper;

public class main {

    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {Serializador();}


        private static void Serializador () {

            Persona persona = new Persona();

            UIHelper ui = new UIHelper();
            Ejecucion logic = new Ejecucion();

            int option = 0;

            do {

                ui.mostrarMenu();
                option = input.nextInt();
                logic.ejecucion_menu(option);

            } while(option!=5);

        }
}
