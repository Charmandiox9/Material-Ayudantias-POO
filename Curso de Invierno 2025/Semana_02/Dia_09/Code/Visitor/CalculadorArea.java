package Visitor;

public class CalculadorArea implements Visitor{
	private double totalArea;

	@Override
	public void visitarCirculo(Circulo circulo) {
		totalArea = 3.14 * (circulo.getRadio() * circulo.getRadio());
	}

	@Override
	public void visitarCuadrado(Cuadrado cuadrado) {
		totalArea = cuadrado.getLado() * cuadrado.getLado();
	}

	@Override
	public void visitarTriangulo(Triangulo triangulo) {
		totalArea = 0.5 * (triangulo.getBase() * triangulo.getAltura());
	}
	
	public double getTotalArea() {
		return totalArea;
	}

}
