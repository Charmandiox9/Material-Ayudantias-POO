package Factory;

public class VehiculosFactory {
	public static Vehiculo crearVehiculo(String tipo, String marca, String modelo) {
		switch(tipo.toLowerCase()) {
			case "automovil":
				return crearAutomovil(marca, modelo);
			case "motocicleta":
				return crearMotocicleta(marca, modelo);
			case "bicicleta":
				return crearBicicleta(marca, modelo);	
		}
		return null;
	}
	
	private static Vehiculo crearAutomovil(String marca, String modelo) {
		return new Automovil(marca, modelo);
	}
	
	private static Vehiculo crearMotocicleta(String marca, String modelo) {
		return new Motocicleta(marca, modelo);
	}
	
	private static Vehiculo crearBicicleta(String marca, String modelo) {
		return new Bicicleta(marca, modelo);
	}
}
