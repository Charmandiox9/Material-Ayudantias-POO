package dominio;

public class Alimento extends Producto{
	private String fechaVencimiento;
	private String categoria;

	public Alimento(String n, double p, int s, String fv, String c) {
		super(n, p, s);
		this.fechaVencimiento = fv;
		this.categoria = c;
	}
	
	

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}



	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	@Override
	public String mostrarInfo() {
		return "Nombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock()
		+ "\nFecha de vencimiento: " + getFechaVencimiento() + "\nCategoria: " + getCategoria() + "\nPrecio especial: " + calcularPrecioEspecial();
	}

	@Override
	public double calcularPrecioEspecial() {
		return (getPrecio() * getStock()) / Integer.parseInt(getFechaVencimiento().split("-")[1]);
	}

}
