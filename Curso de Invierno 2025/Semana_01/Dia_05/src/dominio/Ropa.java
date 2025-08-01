package dominio;

public class Ropa extends Producto{
	private int talla;
	private String material;

	public Ropa(String n, double p, int s, int t, String m) {
		super(n, p, s);
		this.talla = t;
		this.material = m;
	}
	
	

	public int getTalla() {
		return talla;
	}



	public void setTalla(int talla) {
		this.talla = talla;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	@Override
	public String mostrarInfo() {
		return "Nombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock()
		+ "\nTalla: " + getTalla() + "\nMaterial: " + getMaterial() + "\nPrecio especial: " + calcularPrecioEspecial();
	}

	@Override
	public double calcularPrecioEspecial() {
		return (getPrecio() * getStock()) / getTalla();
	}

}
