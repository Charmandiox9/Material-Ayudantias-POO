package dominio;

public class Supermercado {
	private String nombre;
	private Bodega[][] bodegas;
	private int fila = 0;
	private int columna = 0;
	
	public Supermercado(String n) {
		this.nombre = n;
		bodegas = new Bodega[2][2];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Bodega[][] getBodegas() {
		return bodegas;
	}

	public void setBodegas(Bodega[][] bodegas) {
		this.bodegas = bodegas;
	}
	
	public boolean agregarBodega(Bodega b) {
		if(fila < bodegas.length) {
			if(bodegas[fila][columna] == null) {
				bodegas[fila][columna] = b;
				System.out.println("Bodega agregada en posición [" + fila + "][" + columna + "]");
				columna++;
				if(columna >= bodegas[0].length) {
					columna = 0;
					fila++;
				}
				return true;
			}
		}
		return false;
	}
	
}
