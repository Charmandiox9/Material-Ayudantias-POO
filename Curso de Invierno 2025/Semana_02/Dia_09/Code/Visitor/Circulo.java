package Visitor;

public class Circulo extends Forma{
	private double radio;

	public Circulo(String n, double radio) {
		super(n);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitarCirculo(this);
	}

}
