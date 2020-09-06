package javamon;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.Scanner;

public class Usuario {
	
	static List<String> JavamonesUser = new ArrayList<String>();
	static String usuario;
	static File DirectorioUsuario;
	static File Javadex;
	static File AlmacenJavamones;	
	 Scanner input = new Scanner(System.in);
	 PrintStream output = new PrintStream(System.out);
	static Scanner sn = new Scanner(System.in);

	public static void NuevoUsuario() throws IOException{
		
		Usuario nuevo = new Usuario();
				
		System.out.println("Digite un nombre de usuario");
		usuario = sn.next();
		DirectorioUsuario = new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario);
		DirectorioUsuario.mkdir();
		
		System.out.println("Digite una contraseña");
		String password = sn.next();
		File password_usuario = new File(DirectorioUsuario,"pass.txt");
		password_usuario.createNewFile();
		
		
		FileWriter file_writer = new FileWriter(password_usuario);
		PrintWriter print_writer = new PrintWriter(file_writer);
		print_writer.append(password);
		print_writer.close();
		
		Javadex = new File(DirectorioUsuario,"javadex-"+usuario+".csv");
		Javadex.createNewFile();
		
		AlmacenJavamones = new File(DirectorioUsuario,"almacen-"+usuario+".csv");
		AlmacenJavamones.createNewFile();
	}
	
	
	public static void login() throws IOException{
		
		int opcionDesechar;
		String[] JavamonesJavadex = new String[6];
		Usuario nuevo = new Usuario();
		int contador = 1;
		String UserPass = null;
		
		File dir = new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\");
		String [] ficheros = dir.list();
		
		System.out.println("Digite su nombre de usuario:");
		String usuario = sn.next();
		
		try {
			String pass = dir + "\\"+usuario+"\\pass.txt";
			File password = new File(pass);
			Scanner lectorArchivo = new Scanner(new File(pass));
			UserPass = lectorArchivo.next();
			lectorArchivo.close();
		}catch(Exception e) {
			
		}
		System.out.println("Digite su contraseña:");
		String DigitPass = sn.next();
		
		boolean validador = false;
		if (ficheros == null)
			  System.out.println("No hay usuarios registrados.");
			else { 
			 
			for (int x=0;x<ficheros.length;x++)
				
			    if (usuario.equals(ficheros[x])) {
			    	if(DigitPass.equals(UserPass)) {
			    		validador = true;
			    		boolean salir = false;
			    		int opcion;
			    		
			    		while(!salir) {
			    			System.out.println("¡Bienvenido "+usuario+"!");
			    			System.out.println("Selecciona una opcion");
			    			System.out.println("1 ----> Crear Javamon");
			    			System.out.println("2 ----> Desechar Javamon");
			    			System.out.println("3 ----> Listar Javamones en un javadex");
			    			System.out.println("4 ----> Listar Javamones del almacen");
			    			System.out.println("5 ----> Salir");
			    			opcion = sn.nextInt();
			    			
			    			switch(opcion) {
			    			
			    			case 1:
			    				contador = 1;
			    				String javadexDic = "C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\javadex-"+usuario+".csv";
		    					PrintStream output = new PrintStream(System.out);
		    					Scanner sn = new Scanner(System.in);
		    				
		    					FabricaJavamon fabrica = new FabricaJavamon();
		    					String NombreJavamon;
		    					
		    					try {
			    					System.out.println("Estos son tus Javamones");
			    					Scanner fileReader = new Scanner(new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\javadex-"+usuario+".csv"));
			    					while (fileReader.hasNextLine() ) {
			    						System.out.println(contador+": "+fileReader.nextLine());
			    						contador++;
			    					}		   
			    					fileReader.close();
			    				}catch(FileNotFoundException e) {
			    					System.out.println("Javadex no encontrado");}
		    					
		    					if(contador>5) {System.out.println("Ya tienes 5 Javamones");}
		    					else {
		    					System.out.println("Digite el nombre del javamon");
		    					NombreJavamon = sn.next();
		    					Javamon nuevo1 = fabrica.create(NombreJavamon);
		    				
		    					int ataque = (int) (Math.random()*6);
		    				
		    					if(ataque==0) { nuevo1.setTipo(TipoAtaque.ELECTRICIDAD);}
		    					if(ataque==1) { nuevo1.setTipo(TipoAtaque.AGUA);}
		    					if(ataque==2) { nuevo1.setTipo(TipoAtaque.AIRE);}
		    					if(ataque==3) { nuevo1.setTipo(TipoAtaque.ETER);}
		    					if(ataque==4) { nuevo1.setTipo(TipoAtaque.FUEGO);}
		    					if(ataque==5) { nuevo1.setTipo(TipoAtaque.TIERRA);}
		    				
		    				
		    					System.out.println(NombreJavamon +" fue creado y se encuentra en tu javadex");
		    					System.out.println(nuevo1);
		    					
		    				
		    					if (Files.lines(Paths.get(javadexDic)).count() != 0) {
		    						Files.write(
		    						      Paths.get(javadexDic), 
		    						      ("\r\n" + nuevo1.toCSVLine()).getBytes(), 
		    						      StandardOpenOption.APPEND);
		    					} else {
		    						Files.write(
		    						      Paths.get(javadexDic), 
		    						      nuevo1.toCSVLine().getBytes(), 
		    						      StandardOpenOption.APPEND);
		    					}
		    				}
		    			break;
			    				
			    			case 2:
			    				Scanner sns = new Scanner(System.in);
			    				contador = 0;
			    				
			    				
			    				try {
			    					Scanner fileReader = new Scanner(new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\javadex-"+usuario+".csv"));
			    					while (fileReader.hasNextLine()) {	
			    						JavamonesUser.add(fileReader.nextLine());
			    						contador++;
			    						}
			    				}catch(Exception e) {}
			    				
			    				try {
			    					contador = 1;
			    					System.out.println("Digita el numero respectivo del Javamon que quieres desechar");
			    					Scanner fileReader = new Scanner(new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\javadex-"+usuario+".csv"));
			    					while (fileReader.hasNextLine()) {
			    						System.out.println(contador+": "+fileReader.nextLine());
			    						contador++;	
			    					}
			    					fileReader.close();
			    					int decision_desechar = sns.nextInt();
			    					
			    	
				    				File Javadex_Javamon=new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\javadex-"+usuario+".csv");			    									   
				    				File Sustitucion_javadex = new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\javadex-"+usuario+".csv");
					    			File Almacen = 	new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\almacen-"+usuario+".csv");
				    				if (Sustitucion_javadex.delete()) {System.out.println("");}
					    				else {}
					    			
					    			Javadex_Javamon.createNewFile();	
					    			
					    			
					    					try {
					    						FileWriter file_writer = new FileWriter(Javadex_Javamon);
					    						PrintWriter print_writer = new PrintWriter(file_writer);		    		
					    						print_writer.append(JavamonesUser.get(1));
					    						print_writer.append("\r\n" + JavamonesUser.get(2));
					    						print_writer.append("\r\n" + JavamonesUser.get(3));
					    						print_writer.append("\r\n" + JavamonesUser.get(4));
					    						print_writer.close();
					    					}catch(Exception e) {}
					    			
					    			try {
					    				FileWriter AlamcenWriter = new FileWriter(Almacen);
					    				PrintWriter print_Almacen = new PrintWriter(AlamcenWriter);
					    			
					    				print_Almacen.append(JavamonesUser.get(0));
					    				print_Almacen.close();
					    			}catch(Exception e) {}
					    			
			    				}catch(FileNotFoundException e) {
			    					System.out.println("Javadex no encontrado");			    			
			    			}
			    			break;
			    			
			    			case 3:
			    				contador = 1;			    				
			    				try {
			    					System.out.println("Estos son tus Javamones");
			    					Scanner fileReader = new Scanner(new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\javadex-"+usuario+".csv"));
			    					while (fileReader.hasNextLine() ) {
			    						System.out.println(contador+": "+fileReader.nextLine());
			    						contador++;
			    					}		   
			    					fileReader.close();
			    				}catch(FileNotFoundException e) {
			    					System.out.println("Javadex no encontrado");}	
			    			break;
			    			
			    			case 4:
			    				contador = 1;			    				
			    				try {
			    					System.out.println("Estos son tus Javamones en el almacen");
			    					Scanner fileReader = new Scanner(new File("C:\\Users\\justi\\eclipse-workspace\\javamon\\src\\javamon\\usuarios\\" + usuario+"\\almacen-"+usuario+".csv"));
			    					while (fileReader.hasNextLine() ) {
			    						System.out.println(contador+": "+fileReader.nextLine());
			    						contador++;
			    					}		   
			    					fileReader.close();
			    				}catch(FileNotFoundException e) {
			    					System.out.println("Almacen no encontrado");}
			    			break;
			    			case 5:
			    				salir = true;
			    		}
			    		}
			    	}
			    }	
			    if (validador != true) {
			    	System.out.println("El usuario o contraseña es incorrecto");
			    }	
			}
	}

}
