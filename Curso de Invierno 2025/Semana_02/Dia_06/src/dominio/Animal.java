package dominio;

public abstract class Animal {
	protected String nombre;
	protected int edad;
	protected String raza;
	
	public Animal(String n, int e, String r) {
		this.nombre = n;
		this.edad = e;
		this.raza = r;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String mostrarInfo() {
		return getNombre() + " (" + getClass().getSimpleName() + " " + getRaza() + ", " + getEdad() + " años)" + ": " + hacerSonido();
	}
	
	abstract public String hacerSonido();
}
