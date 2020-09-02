package cr.ac.ulead.principal;

import cr.ac.ulead.logica.GestorLogico;
import cr.ac.ulead.ui.UIHelper;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        UIHelper ui = new UIHelper();
        GestorLogico gestorLogico = new GestorLogico();
        Scanner input = new Scanner(System.in);

        int opcion = 0;

        do{
            ui.menuPrincipal();
            opcion = input.nextInt();
            gestorLogico.menu(opcion);
        }while(opcion != 7);


    }
}
