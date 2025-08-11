package Factory;

public class Automovil extends Vehiculo{

	public Automovil(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String obtenerTipo() {
		return getClass().getSimpleName();
	}

	@Override
	public void mostrarInformacion() {
		System.out.println(obtenerTipo().toUpperCase() + "\nMarca: " + marca + "\nModelo: " + modelo);
	}

}
