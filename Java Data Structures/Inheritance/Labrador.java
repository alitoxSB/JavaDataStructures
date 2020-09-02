package Inheritance;

public class Labrador extends Dogs{
	private String Nombre;
	private int Edad;
	
	public Labrador(String Nombre, int Edad, String breed, String weight, String height) {
		super(breed, weight, height);
		this.Nombre = Nombre;
		this.Edad = Edad;
	}
	public void ShowData() {
		System.out.println("nombre: " + Nombre+
				"\nEdad: " + Edad +
				"\nRaza: " + getBreed()+
				"\nPeso: " + getWeight()+
				"\nAltura:" + getHeight());
	}
	
}
