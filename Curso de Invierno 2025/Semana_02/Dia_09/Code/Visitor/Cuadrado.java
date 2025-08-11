package Visitor;

public class Cuadrado extends Forma{
	private double lado;

	public Cuadrado(String n, double lado) {
		super(n);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitarCuadrado(this);
	}
}
