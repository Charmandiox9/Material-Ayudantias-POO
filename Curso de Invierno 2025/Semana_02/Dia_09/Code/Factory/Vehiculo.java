package Factory;

public abstract class Vehiculo {
	protected String marca, modelo;
	
	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public abstract String obtenerTipo();
	public abstract void mostrarInformacion();
}
