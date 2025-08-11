package logica;

public interface IVehiculo {
	double calcularCostoAlquiler(int dias);
	boolean estaDisponible();
	void alquilar();
	void devolver();
	String mostrarInformacion();
}
