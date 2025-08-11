package Visitor;

public class Triangulo extends Forma{
	private double base, altura;

	public Triangulo(String n, double b, double a) {
		super(n);
		this.base = b;
		this.altura = a;
	}
	
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitarTriangulo(this);
	}

}
