package Inheritance;

public class Dogs {
	
	private String Breed;
	private String Weight;
	private String Height;
	
	public Dogs(String breed, String weight, String height) {
		super();
		Breed = breed;
		Weight = weight;
		Height = height;
	}

	public String getBreed() {
		return Breed;
	}

	public void setBreed(String breed) {
		Breed = breed;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getHeight() {
		return Height;
	}

	public void setHeight(String height) {
		Height = height;
	}
	
	
	
}
