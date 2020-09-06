package javamon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FabricaJavamon {
	
	public Javamon create(String nombre) {
		
		Javamon nuevo = new Javamon();
		nuevo.setNombre(nombre);
		nuevo.setAtaqueEsp(generateRandomValue());
		nuevo.setAtaqueLow(generateRandomValue());
		nuevo.setAtaqueMid(generateRandomValue());
		nuevo.setAtaqueMid(generateRandomValue());
		nuevo.setDefLow(generateRandomValue());
		nuevo.setDefMid(generateRandomValue());
		nuevo.setAtaqueSup(generateRandomValue());
		nuevo.setTipo(generateTipoAtaque());
		return nuevo;
	}
	
	private TipoAtaque generateTipoAtaque() {
		// TODO Auto-generated method stub
		return null;
	}

	private int generateRandomValue(){
		double random = Math.random();
		random = random * 20 + 1;
		return (int) random;
	}
	
}
