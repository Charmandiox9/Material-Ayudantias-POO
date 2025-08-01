package dominio;

public class Electrodomestico extends Producto{
	private int mesesGarantia;
	private double eficienciaEnergetica;

	public Electrodomestico(String n, double p, int s, int mg, double ee) {
		super(n, p, s);
		this.mesesGarantia = mg;
		this.eficienciaEnergetica = ee;
	}
	
	

	public int getMesesGarantia() {
		return mesesGarantia;
	}



	public void setMesesGarantia(int mesesGarantia) {
		this.mesesGarantia = mesesGarantia;
	}



	public double getEficienciaEnergetica() {
		return eficienciaEnergetica;
	}



	public void setEficienciaEnergetica(double eficienciaEnergetica) {
		this.eficienciaEnergetica = eficienciaEnergetica;
	}



	@Override
	public String mostrarInfo() {
		return "Nombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock()
		+ "\nMeses de garantía: " + getMesesGarantia() + "\nEficiencia energética: " + getEficienciaEnergetica() + "\nPrecio especial: " + calcularPrecioEspecial();
	}

	@Override
	public double calcularPrecioEspecial() {
		return (getPrecio() * getStock()) / (getMesesGarantia() * getEficienciaEnergetica());
	}

}
