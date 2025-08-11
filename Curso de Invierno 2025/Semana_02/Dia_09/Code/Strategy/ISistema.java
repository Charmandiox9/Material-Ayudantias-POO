package Strategy;

public interface ISistema {
	public double calcularImpuestoPersonaNatural(double ingresos);
	public double calcularImpuestoEmpresaPequeña(double ingresos);
	public double calcularImpuestoGranCorporacion(double ingresos);
	public String mostrarInfoEstrategia();
}
