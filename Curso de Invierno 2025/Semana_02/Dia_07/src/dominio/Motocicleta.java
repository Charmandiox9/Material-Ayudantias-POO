package dominio;

public class Motocicleta extends Vehiculo{
	private int cilindrada;

	public Motocicleta(String m, String ma, String mo, int a, double k, int c) {
		super(m, ma, mo, a, k);
		this.cilindrada = c;
	}

	@Override
	public double calcularCostoAlquiler(int dias) {
		return 15000 * dias;
	}

	@Override
	public String mostrarInformacion() {
		return "MOTOCICLETA \nMarca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\nAño: " + anio
				+ "\nKilometraje: " + kilometraje + "\nCilindrada: " + cilindrada;
	}

}
