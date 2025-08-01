package dominio;

public abstract class Producto {
	protected String nombre;
	protected double precio;
	protected int stock;
	
	public Producto(String n, double p, int s) {
		this.nombre = n;
		this.precio = p;
		this.stock = s;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public abstract String mostrarInfo();
	
	public abstract double calcularPrecioEspecial();
	
}
