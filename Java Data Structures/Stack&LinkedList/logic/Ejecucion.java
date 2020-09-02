package cr.ac.ulead.logic;
import cr.ac.ulead.objetos.Mascota;
import cr.ac.ulead.objetos.Persona;
import cr.ac.ulead.tda.ejecutables.StackA;
import cr.ac.ulead.ui.UIHelper;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejecucion {

    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    UIHelper ui = new UIHelper();
    Persona persona = new Persona();
    Mascota mascota = new Mascota();


    public void ejecucion_menu (int opcion) {

        switch (opcion) {
            case 1:
                ui.datos_persona(persona);
                output.println(persona.SerializarXML());
                break;
            case 2:
                ui.datos_persona(persona);
                output.println(persona.SerializarJson());
                break;
            case 3:
                ui.datos_mascota(mascota);
                output.println(mascota.SerializarXML());
                break;
            case 4:
                ui.datos_mascota(mascota);
                output.println(mascota.SerializarJson());
                break;
            default:
                ui.wrongOption();
        }
    }
}

