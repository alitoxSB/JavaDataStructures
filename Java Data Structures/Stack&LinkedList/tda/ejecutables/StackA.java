package cr.ac.ulead.tda.ejecutables;

import cr.ac.ulead.logic.Ejecucion;
import cr.ac.ulead.objetos.Persona;
import cr.ac.ulead.objetos.Mascota;
import cr.ac.ulead.tda.logic.LogicStackA;
import cr.ac.ulead.ui.UIHelper;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;

public class StackA {

    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {StackA();}


    public static void StackA(){
        int opcion = 0;
        do {
            LogicStackA.MenuStackA();
            opcion = input.nextInt();
            LogicStackA.EjecucioPilaA(opcion);
        }while(opcion!=5);
    }
}




