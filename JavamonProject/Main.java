package javamon;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) throws IOException {
		
		Usuario nuevoUsuario = new Usuario(); ///user
		
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		Scanner sn = new Scanner(System.in);
		
		File DirectorioUsuario;
		int opcion;
		boolean salir = false;
		
		
		while(!salir) {
				System.out.println("************************************");
				System.out.println("******** BIENVENIDO A JAVAMON ******");
				System.out.println("************************************");
				System.out.println("*********** MENU PRINCIPAL *********");
				System.out.println("seleccione una opcion");
				System.out.println("1 -----> Crear cuenta");
				System.out.println("2 -----> Iniciar sesion");
				System.out.println("3 -----> Salir");
					try {
						opcion = sn.nextInt();

						switch(opcion) {
				
						case 1:
							Usuario.NuevoUsuario();
							break;
						case 2:
							Usuario.login();
							break;
						case 3:
							salir = true;
						}
				
				}catch(InputMismatchException e){
					System.out.println("Debes insertar un número");
	                sn.next();
				
			}
			
		}
	}

}
