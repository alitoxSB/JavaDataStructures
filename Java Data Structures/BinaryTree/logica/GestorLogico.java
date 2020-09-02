package cr.ac.ulead.logica;

import cr.ac.ulead.entidades.Tree;
import cr.ac.ulead.entidades.Persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestorLogico {
    Tree tree = new Tree();

    Scanner input = new Scanner(System.in);

    public void menu(int opcion) throws FileNotFoundException {
        switch (opcion){
            case 1:
                tree.insert(IngresarPersona());
                break;
            case 2:
                CargarDatos(tree);
                break;
            case 3:
                tree.inOrderGestor();
                break;
            case 4:
                tree.preOrderGestor();
                break;
            case 5:
                tree.posOrder();
                break;
            case 6:
                tree.displayTree();
                break;
            case 7:
                System.out.println("Muchas gracias por usar el arbol binario");
            default:
                System.out.println("Ocurrio un error");
                break;
        }
    }
    public Persona IngresarPersona() {

        Persona persona = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        String nombrePersona = input.next();
        persona.setNombre(nombrePersona);

        System.out.println("Ingrese el apellido de la persona");
        String apellidoPersona = input.next();
        persona.setApellido(apellidoPersona);

        System.out.println("Digite la fecha de nacimiento en formato d/M/yyyy:");
        String fecha = input.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fechaDef = LocalDate.parse(fecha, formatter);
        persona.setFecha_nacimiento(fechaDef);

        System.out.println("Ingrese la cedula de la persona");
        String cedulaPersona = input.next();
        persona.setCedula(cedulaPersona);

        return persona;

    }
    public void CargarDatos(Tree tree) throws FileNotFoundException {
        Scanner lector = new Scanner(new File("C:\\Users\\justi\\OneDrive\\Escritorio\\BinaryTree-master\\BinaryTree-master\\src\\cr\\ac\\ulead\\personas.csv"));
        try {
            while (lector.hasNextLine()) {

                String currentLine = lector.nextLine();
                String[] datos = currentLine.split(";");

                Persona persona = new Persona();

                persona.setNombre(datos[0]);
                persona.setApellido(datos[1]);
                persona.setCedula(datos[3]);

                String fechaCSV = datos[2];
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
                LocalDate fechaDef = LocalDate.parse(fechaCSV, formatter);
                persona.setFecha_nacimiento(fechaDef);

                System.out.println(persona.toString());
                tree.insert(persona);

            }
        }catch (Exception e){
            System.out.println("No se pudo cargar el archivo");
        }
    }
}
