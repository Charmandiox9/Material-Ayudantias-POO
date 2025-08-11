package dominio;

public class Auto extends Vehiculo{
	private int numeroPuertas;
	private String tipoCombustible;

	public Auto(String m, String ma, String mo, int a, double k, int np, String tc) {
		super(m, ma, mo, a, k);
		this.numeroPuertas = np;
		this.tipoCombustible = tc;
	}

	@Override
	public double calcularCostoAlquiler(int dias) {
		return 30000 * dias;
	}


	@Override
	public String mostrarInformacion() {
		return "AUTO \nMarca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\nAño: " + anio
				+ "\nKilometraje: " + kilometraje + "\nNúmero de puertas: " + numeroPuertas + "\nTipo de combustible: " + tipoCombustible;
	}

}
