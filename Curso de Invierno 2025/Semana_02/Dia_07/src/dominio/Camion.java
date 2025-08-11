package dominio;

public class Camion extends Vehiculo{
	private double capacidadCarga;

	public Camion(String m, String ma, String mo, int a, double k, double cc) {
		super(m, ma, mo, a, k);
		this.capacidadCarga = cc;
	}

	@Override
	public double calcularCostoAlquiler(int dias) {
		return 50000 * dias;
	}

	@Override
	public String mostrarInformacion() {
		return "CAMION \nMarca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\nAño: " + anio
				+ "\nKilometraje: " + kilometraje + "\nCapacidad de carga: " + capacidadCarga;
	}

}
