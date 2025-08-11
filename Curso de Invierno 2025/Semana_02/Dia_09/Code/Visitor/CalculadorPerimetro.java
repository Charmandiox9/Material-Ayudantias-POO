package Visitor;

public class CalculadorPerimetro implements Visitor{
	private double totalPerimetro;

	@Override
	public void visitarCirculo(Circulo circulo) {
		totalPerimetro = 2 * 3.14 * circulo.getRadio();
	}

	@Override
	public void visitarCuadrado(Cuadrado cuadrado) {
		totalPerimetro = 4 * cuadrado.getLado();
	}

	@Override
	public void visitarTriangulo(Triangulo triangulo) {
		totalPerimetro = triangulo.getAltura() + triangulo.getBase() + triangulo.getAltura();
	}

	public double getTotalPerimetro() {
		return totalPerimetro;
	}
}
