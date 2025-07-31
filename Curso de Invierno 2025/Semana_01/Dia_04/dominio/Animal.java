package dominio;

public abstract class Animal {
	protected String animal;
	protected int edad;
	protected String habitat;
	protected String alimento;
	
	public Animal(String n, int e, String h, String a) {
		this.animal = n;
		this.edad = e;
		this.habitat = h;
		this.alimento = a;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	abstract public String alimentarse();
	
	abstract public String comportamiento();
	
	public String mostrarInfo() {
		return animal + " (" + this.getClass().getSimpleName() + ", " + edad + " años)"
				+ "\n- Hábitat: " + habitat + "\n- " + alimentarse() + "\n- " + comportamiento();
	}
	
	
}
