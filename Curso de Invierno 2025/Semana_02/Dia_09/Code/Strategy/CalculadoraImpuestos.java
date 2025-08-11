package Strategy;

public class CalculadoraImpuestos{
	private ImpuestoStrategy estrategia;
	
	public void establecerEstrategia(ImpuestoStrategy estrategia) {
		this.estrategia = estrategia;
	}
	public double calcular(double ingresos) {
		return estrategia.calcularImpuesto(ingresos);
	}
	public String obtenerDescripcionEstrategia() {
		return estrategia.obtenerDescripcion();
	}
	
}
