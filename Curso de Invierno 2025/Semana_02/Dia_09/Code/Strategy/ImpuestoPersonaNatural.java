package Strategy;

public class ImpuestoPersonaNatural implements ImpuestoStrategy{

	@Override
	public double calcularImpuesto(double ingresos) {
		return ingresos * 0.15;
	}

	@Override
	public String obtenerDescripcion() {
		return "Se está ocupando la estrategia de calcula de impuestos de persona natural.";
	}

}
