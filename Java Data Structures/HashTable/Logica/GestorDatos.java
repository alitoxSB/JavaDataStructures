package ulead.ac.cr.Logica;

import ulead.ac.cr.entidades.Lista;
import ulead.ac.cr.entidades.Producto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {

    public ArrayList<Producto> DatosProdutos = new ArrayList<>();
    public ArrayList<String> CodigoDecimal = new ArrayList<>();

    public boolean DatosCargados = false;
    public boolean CodigosCargados = false;


    public void cargarDatos() throws FileNotFoundException {

        int contadorLineas = 0;

        Scanner lector = new Scanner(new File("C:\\Users\\justi\\OneDrive\\Escritorio\\tarea\\DataSetEstructuras.csv"));

        while (lector.hasNextLine()) {
            contadorLineas++;
            String currentLine = lector.nextLine();
            String[] datos = currentLine.split(";");

            Producto producto = new Producto();

            producto.setCodigo_alfanumerico(datos[0]);
            producto.setCategoria(datos[2]);
            producto.setNombre(datos[1]);
            producto.setnumero_fila(String.valueOf(contadorLineas));

            DatosProdutos.add(producto);
            Lista lista = new Lista();
            lista.Agregar(producto);
            System.out.println(producto);
            DatosCargados = true;


        }
        lector.close();
        CodigosCargados = true;
        System.out.println("Datos cargados con exito.");
    }

    public void FuncionCodigoHash() throws FileNotFoundException {

        int i;
        for (i = 0; i < DatosProdutos.size(); i++) {

            String nuevoCodigo = DatosProdutos.get(i).getCodigo_alfanumerico().substring(29);
            int HashCode = Integer.parseInt(nuevoCodigo, 16);

            CodigoDecimal.add("\n" + DatosProdutos.get(i).getNombre() + "," + HashCode);
        }
        System.out.println("HashTable cargada con exito.");

    }


    public void imprimirDatos() {
        for (int i = 0; i < DatosProdutos.size(); i++) {
            System.out.println(DatosProdutos.get(i));
        }
    }

    public void BuscarProducto(String producto_buscar) {

        if (CodigosCargados==false){
            System.out.println("Tienes que cargar los datos");
        }else{

            int productos_match;
            int productosEncontrados = 0;

            for (int i = 0; i < DatosProdutos.size(); i++) {

                String nombreProducto = DatosProdutos.get(i).getNombre();

                if (nombreProducto.contains(producto_buscar)) {
                    System.out.println(nombreProducto + "esta en la posicion lineal: " + i);
                    productosEncontrados++;
                } else {

                }
            }
            System.out.println("Se encontraron " + productosEncontrados + " productos");
        }


    }


    public void IntroducirDatosLista(Lista lista, ArrayList<Producto> DatosProdutos) {

        for (int i = 0; i < DatosProdutos.size(); i++) {
            lista.Agregar(DatosProdutos.get(i));
            lista.ImprimirLista();
        }

    }

    public void CodigoHexa() {
        int i;
        for (i = 0; i < DatosProdutos.size(); i++) {

            String nuevoCodigo = DatosProdutos.get(i).getCodigo_alfanumerico().substring(29);
            System.out.println("Producto:" + DatosProdutos.get(i).getNombre() + " Tiene como indice hexadecimal: " + nuevoCodigo);
        }
    }

    public void HexatoDecimal() {
        int i;
        for (i = 0; i < DatosProdutos.size(); i++) {

            String nuevoCodigo = DatosProdutos.get(i).getCodigo_alfanumerico().substring(29);
            int HashCode = Integer.parseInt(nuevoCodigo, 16);
            System.out.println("El producto: " + DatosProdutos.get(i).getNombre() + " tiene como indice decimal: " + HashCode);
        }
    }
    public void BusquedaIndiceColision(int indice){
        int contador = 0;
        int i;
        for (i = 0; i < DatosProdutos.size(); i++) {

            String nuevoCodigo = DatosProdutos.get(i).getCodigo_alfanumerico().substring(29);
            int HashCode = Integer.parseInt(nuevoCodigo, 16);

            if (HashCode==indice){
                contador++;
                System.out.println(DatosProdutos.get(i).getNombre() + "," + DatosProdutos.get(i).getCategoria() + "," + " " +
                        "Indice:" + HashCode);
            }

        }
        System.out.println("Se encontraron " + contador + " productos en este HashTable");
    }
}