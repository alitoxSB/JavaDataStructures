package cr.ac.ulead.ui;

import java.io.PrintStream;
import java.util.Scanner;

import java.util.Stack;

import cr.ac.ulead.objetos.Persona;
import cr.ac.ulead.objetos.Mascota;
import cr.ac.ulead.tda.ejecutables.StackA;

public class UIHelper {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);

    public void mostrarMenu() {

        System.out.println("************************");
        System.out.println("*****SERIALIZADOR*******");
        System.out.println("************************");
        System.out.println("Que quieres serializar?");
        System.out.println("1: Persona en  XML\n2: Persona en  JSON\n3: Mascota en XML\n4: Mascota en json\n5: Salir");
    }

    public Mascota datos_mascota(Mascota mascota) {

        System.out.println("Ingrese los datos de la mascota.");

        System.out.println("Ingrese el nombre:");
        mascota.setNombre_mascota(sn.next());

        System.out.println("Ingrese el tipo de mascota:");
        mascota.setTipo_mascota(sn.next());

        System.out.println("Ingrese la edad de la mascota:");
        mascota.setEdad_mascota(sn.next());

        return mascota;

    }

    public Persona datos_persona(Persona persona){

        String personaDatos [];

        System.out.println("Ingrese los datos de la persona");

        System.out.println("Ingrese el nombre: ");
        persona.setNombre(sn.next());

        System.out.println("Ingrese el apellido:");
        persona.setApellido(sn.next());

        System.out.println("Ingrese el peso:");
        persona.setPeso(sn.next());

        System.out.println("Ingrese la estatura:");
        persona.setEstatura(sn.next());

        System.out.println("Ingrese la fecha de nacimiento:");
        persona.setFecha_nacimiento(sn.next());

        return persona;

    }


    public void wrongOption() {
        output.println("Adios!");
    }

}
