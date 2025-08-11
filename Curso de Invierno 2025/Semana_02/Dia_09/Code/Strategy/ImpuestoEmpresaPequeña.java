package Strategy;

public class ImpuestoEmpresaPequeña implements ImpuestoStrategy{

	@Override
	public double calcularImpuesto(double ingresos) {
		return ingresos * 0.25;
	}

	@Override
	public String obtenerDescripcion() {
		return "Se está ocupando la estrategia de calcula de impuestos de empresa pequeña.";
	}

}
