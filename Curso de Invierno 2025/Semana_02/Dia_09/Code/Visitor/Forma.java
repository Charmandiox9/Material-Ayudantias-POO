package Visitor;

public abstract class Forma implements Visitable{
	protected String nombre;
	
	public Forma(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return nombre;
	}
	
}
