package ulead.ac.cr.ui;

import ulead.ac.cr.Logica.GestorDatos;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UIHelper {

    Scanner input = new Scanner(System.in);
    String producto_buscar;

    GestorDatos gestorDatos = new GestorDatos();

    public void MenuPrincipal(int opcion) throws FileNotFoundException {



        System.out.println("Bienvenido!");
        System.out.println("Digite que programa quiere ejecutar:");
        System.out.println("1: Primer programa");
        System.out.println("2: Segundo programa");
        System.out.println("3: Salir");
        opcion = input.nextInt();

        switch (opcion){
            case 1:
                do{
                    opcion = 0;
                    MenuPrograma1(opcion);
                    opcion = input.nextInt();
                }while (opcion != 4);
                break;

            case 2:
                do{
                    opcion = 0;
                    MenuPrograma2(opcion);
                    opcion = input.nextInt();
                }while(opcion != 4);
                break;
        }
    }

    public void MenuPrograma1(int opcion) throws FileNotFoundException {
        do{
            System.out.println("Seleccione una opcion.");
            System.out.println("1: Cargar datos");
            System.out.println("2: Buscar datos por aproximación del nombre");
            System.out.println("3: Obtener codigo unico de tres digitos de los productos");
            System.out.println("4: Salir");
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    gestorDatos.cargarDatos();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que desea buscar: ");
                    producto_buscar = input.next();
                    gestorDatos.BuscarProducto(producto_buscar);
                    break;
                case 3:
                    gestorDatos.CodigoHexa();

                    break;
            }
        }while (opcion!=4);

    }
    public void MenuPrograma2(int opcion) throws FileNotFoundException {
        do{
            System.out.println("Seleccione una opcion.");
            System.out.println("1: Convertir el indice de Hexadecimal a decimal");
            System.out.println("2: Cargar los datos al HashTable");
            System.out.println("3: Buscar datos por su posicion en el HashTable");
            System.out.println("4: Salir");
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    gestorDatos.HexatoDecimal();
                    break;
                case 2:
                    gestorDatos.FuncionCodigoHash();
                    break;
                case 3:
                    int indice = 0;
                    System.out.println("Ingrese el indice que desea buscar");
                    indice=input.nextInt();
                    gestorDatos.BusquedaIndiceColision(indice);
            }
        }while(opcion!=4);

    }

}
