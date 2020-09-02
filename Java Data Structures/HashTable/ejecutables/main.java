package ulead.ac.cr.ejecutables;

import ulead.ac.cr.ui.UIHelper;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class main {
    public static void main(String args[]) throws FileNotFoundException {

        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        UIHelper uiHelper = new UIHelper();

        String producto_buscar;

        int opcion = 0;

        do{
            uiHelper.MenuPrincipal(opcion);

        }while(opcion!=3);


    }
}
