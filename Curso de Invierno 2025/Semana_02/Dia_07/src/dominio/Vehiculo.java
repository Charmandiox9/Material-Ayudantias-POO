package dominio;

import logica.IVehiculo;

public abstract class Vehiculo implements IVehiculo{
	protected String matricula, marca, modelo;
	protected int anio;
	protected double kilometraje;
	protected boolean disponible;
	
	public Vehiculo(String m, String ma, String mo, int a, double k) {
		this.matricula = m;
		this.marca = ma;
		this.modelo = mo;
		this.anio = a;
		this.kilometraje = k;
		this.disponible = true;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public boolean estaDisponible() {
		return disponible;
	}
	
	public void alquilar() {
		disponible = false;
	}
	
	public void devolver() {
		disponible = true;
	}
	
	public abstract String mostrarInformacion();
	
	
}
