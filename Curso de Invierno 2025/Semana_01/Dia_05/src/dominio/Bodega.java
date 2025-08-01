package dominio;

import java.util.ArrayList;

public class Bodega {
	private String id;
	private String ciudad;
	private int stockMax;
	ArrayList<Producto> productos;
	
	public Bodega(String c, int sm, String id) {
		this.ciudad = c;
		this.stockMax = sm;
		this.id = id;
		this.productos = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getStockMax() {
		return stockMax;
	}

	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void agregarProdcuto(Producto p) {
		if(stockMax - p.getStock() >= 0) {
			productos.add(p);
			stockMax -= p.getStock();
		} else {
			System.out.println("La " + getId() + " no tiene suficiente capacidad.");
		}
	}
	
	public void eliminarProducto(String n) {
		for(Producto p: productos) {
			if(p.getNombre().equals(n)) {
				productos.remove(p);
			}
		}
	}

}
