package ulead.ac.cr.logica;
import ulead.ac.cr.entidades.Persona;
import ulead.ac.cr.ui.UIHelper;
import ulead.ac.cr.entidades.cajas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

import ulead.ac.cr.cola.Queue;

public class GestorLogico {

    public static int PersonasColaNormal;
    public static int PersonasColaPreferencial;

    public static ArrayList<Persona> ListaPersona = new ArrayList<Persona>();
    public static int sumaDePersonas = 0;

    UIHelper ui = new UIHelper();


    public static void MenuPrincipal() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        UIHelper ui = new UIHelper();
        int opcion = 0;

        do{
            ui.MenuUI();
            opcion = input.nextInt();
            GestorLogico.OpcionMenu(opcion);
        }while(opcion<4);


    }
    public static void OpcionMenu(int opcion) throws FileNotFoundException {
        switch (opcion){
            case 1:
                GestorLogico.FuncionCola();
                break;
            case 2:
                cajas.Calculos();
        }
    }
    public static void FuncionCola() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        cajas cajas = new cajas();
        UIHelper ui = new UIHelper();
        int numCajas;
        int opcioncajanovata;
        int numcolas=0;

        boolean cajaNovata = false;
        int ColasDePrioridad = 0;

        ui.CuantasCajas();
        ui.MensajeAlerta();
        numCajas = input.nextInt();
        ui.MensajeCajaNovata();
        opcioncajanovata = input.nextInt();
        ui.MensajeNumColas();
        numcolas = input.nextInt();


        switch (opcioncajanovata){
            case 1:
                cajaNovata = true;
                break;
            case 2:
                cajaNovata = false;
                break;

        }
        try {
            Scanner lector = new Scanner(new File("C:\\Users\\justi\\IdeaProjects\\ProyectoFinal\\Simulacion.txt"));

            while (lector.hasNextLine()) {
                String currentLine = lector.nextLine();
                String[] datos = currentLine.split(",");

                PersonasColaNormal = Integer.parseInt(datos[0]);
                PersonasColaPreferencial = Integer.parseInt(datos[1]);
                cajas.caja(PersonasColaNormal,PersonasColaPreferencial,numCajas, numcolas);
                if(PersonasColaNormal!=0) {
                    ui.MensajeLineaCompletada();
                }
                sumaDePersonas = sumaDePersonas + Integer.parseInt(datos[0]);
            }

            lector.close();

            }catch (Exception e){
                System.out.println("No se pudo cargar el archivo");
            }
        }
    }

