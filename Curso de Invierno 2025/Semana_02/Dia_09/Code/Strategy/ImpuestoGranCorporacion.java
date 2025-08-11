package Strategy;

public class ImpuestoGranCorporacion implements ImpuestoStrategy {

	@Override
	public double calcularImpuesto(double ingresos) {
		return ingresos * 0.3;
	}

	@Override
	public String obtenerDescripcion() {
		return "Se está ocupando la estrategia de calcula de impuestos de gran corporación.";
	}

}
