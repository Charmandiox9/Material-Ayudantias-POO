package Factory;

public interface ISistema {
	public boolean crearAutomovil(String marca, String modelo);
	public boolean crearMotocicleta(String marca, String modelo);
	public boolean crearBicicleta(String marca, String modelo);
	public void mostrarVehiculos();
}
